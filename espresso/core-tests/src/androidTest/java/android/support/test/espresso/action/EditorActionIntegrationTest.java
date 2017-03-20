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
import android.view.inputmethod.EditorInfo;

import org.hamcrest.CustomTypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasImeAction;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.junit.rules.ExpectedException.none;

/**
 * Tests for {@link EditorAction}.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class EditorActionIntegrationTest {

  @Rule
  public ActivityTestRule<SendActivity> rule = new ActivityTestRule<>(SendActivity.class);

  @Rule
  public ExpectedException expectedException = none();

  @Test
  public void pressImeActionButtonOnSearchBox() {
    String searchFor = "rainbows and unicorns";
    onView(withId(R.id.search_box)).perform(scrollTo(), ViewActions.typeText(searchFor));
    onView(withId(R.id.search_box))
        .check(matches(hasImeAction(EditorInfo.IME_ACTION_SEARCH)))
        .perform(pressImeActionButton());
    onView(withId(R.id.search_result)).perform(scrollTo());
    onView(withId(R.id.search_result))
        .check(matches(allOf(isDisplayed(), withText(containsString(searchFor)))));
  }

  @Test
  public void pressImeActionButtonOnNonEditorWidget() {
    expectedException.expect(PerformException.class);
    expectedException.expectCause(new CustomTypeSafeMatcher<Throwable>(
        "instance of IllegalStateException") {
      @Override
      protected boolean matchesSafely(Throwable throwable) {
        return throwable instanceof IllegalStateException;
      }
    });
    onView(withId(R.id.send_button)).perform(pressImeActionButton());
  }

  @Test
  public void pressSearchOnDefaultEditText() {
    onView(withId(R.id.enter_data_edit_text)).perform(pressImeActionButton());
  }
}
