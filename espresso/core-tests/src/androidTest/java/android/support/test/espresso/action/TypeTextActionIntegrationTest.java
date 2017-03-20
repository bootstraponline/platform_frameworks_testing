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

import android.support.test.espresso.PerformException;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.testapp.R;
import android.support.test.testapp.SendActivity;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.rules.ExpectedException.none;

/**
 * {@link TypeTextAction} integration tests.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class TypeTextActionIntegrationTest {

  @Rule
  public ExpectedException expectedException = none();

  @Rule
  public ActivityTestRule<SendActivity> rule = new ActivityTestRule<>(SendActivity.class);

  @Test
  public void typeTextActionPerform() {
    onView(withId(is(R.id.send_data_to_call_edit_text))).perform(typeText("Hello!"));
  }

  @Test
  public void typeTextActionPerformWithEnter() {
    onView(withId(R.id.enter_data_edit_text)).perform(typeText("Hello World!\n"));
    onView(allOf(withId(R.id.enter_data_response_text), withText("Hello World!")))
        .check(matches(isDisplayed()));
  }

  @Test
  public void typeTextInFocusedView() {
    onView(withId(is(R.id.send_data_to_call_edit_text))).perform(typeText(
        "Hello World How Are You Today? I have alot of text to type."));
    onView(withId(is(R.id.send_data_to_call_edit_text))).perform(typeTextIntoFocusedView(
        "Jolly good!"));
    onView(withId(is(R.id.send_data_to_call_edit_text))).check(matches(withText(
        "Hello World How Are You Today? I have alot of text to type.Jolly good!")));
  }

  @Test
  public void typeTextInFocusedView_constraintBreakage() {
    onView(withId(is(R.id.send_data_to_call_edit_text))).perform(typeText(
        "Hello World How Are You Today? I have alot of text to type."));
    expectedException.expect(PerformException.class);
    onView(withId(is(R.id.edit_text_message)))
        .perform(scrollTo(), typeTextIntoFocusedView("Jolly good!"));
  }

  @Test
  public void typeTextInDelegatedEditText() {
    String toType = "honeybadger doesn't care";
    onView(allOf(withParent(withId(R.id.delegating_edit_text)), withId(R.id.delegate_edit_text)))
        .perform(scrollTo(), typeText(toType), pressImeActionButton());
    onView(withId(R.id.edit_text_message))
      .perform(scrollTo())
      .check(matches(withText(containsString(toType))));
  }

  @Test
  public void testTypeText_NonEnglish() {
    expectedException.expect(RuntimeException.class);
    String toType = "在一个月之内的话";
    onView(allOf(withParent(withId(R.id.delegating_edit_text)), withId(R.id.delegate_edit_text)))
        .perform(scrollTo(), typeText(toType));
  }
}
