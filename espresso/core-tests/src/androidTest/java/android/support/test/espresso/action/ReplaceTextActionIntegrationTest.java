/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.espresso.action;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.testapp.R;
import android.support.test.testapp.SendActivity;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;

/**
 * {@link ReplaceTextAction} integration tests.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class ReplaceTextActionIntegrationTest {
  @Rule
  public ActivityTestRule<SendActivity> rule = new ActivityTestRule<>(SendActivity.class);

  @Test
  public void replaceTextActionPerform() {
    Activity activity = rule.getActivity();
    String text = activity.getText(R.string.send_data_to_message_edit_text).toString();
    onView(withId(is(R.id.send_data_to_message_edit_text))).check(matches(withText(is(text))));
    String newText = "new Text";
    onView(withId(is(R.id.send_data_to_message_edit_text))).perform(replaceText(newText));
    onView(withId(is(R.id.send_data_to_message_edit_text))).check(matches(withText(is(newText))));
    onView(withId(is(R.id.send_data_to_message_edit_text))).perform(clearText());
    onView(withId(is(R.id.send_data_to_message_edit_text))).check(matches(withText(is(""))));
  }

  @Test
  public void clearTextActionPerformWithTypeText() {
    Activity activity = rule.getActivity();
    String text = activity.getText(R.string.send_data_to_message_edit_text).toString();
    onView(withId(is(R.id.send_data_to_call_edit_text))).perform(typeText(text));
    onView(withId(is(R.id.send_data_to_call_edit_text))).check(matches(withText(is(text))));
    onView(withId(is(R.id.send_data_to_call_edit_text))).perform(clearText());
    onView(withId(is(R.id.send_data_to_call_edit_text))).check(matches(withText(is(""))));
  }
}
