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

package android.support.test.espresso.assertion;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.testapp.LayoutIssuesActivity;
import android.support.test.testapp.R;
import android.test.suitebuilder.annotation.LargeTest;

import junit.framework.AssertionFailedError;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.rules.ExpectedException.none;

/**
 * Integration tests for {@link LayoutAssertions}.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class LayoutAssertionsTest {

  @Rule
  public ActivityTestRule<LayoutIssuesActivity> rule =
      new ActivityTestRule<>(LayoutIssuesActivity.class);

  @Rule
  public ExpectedException expectedException = none();

  @Test
  public void assertNoEllipsizedText() {
    expectedException.expect(AssertionFailedError.class);
    onView(isRoot()).check(LayoutAssertions.noEllipsizedText());
  }

  @Test
  public void assertNoMultilineButtons() {
    onView(withId(R.id.wrap)).perform(click());
    expectedException.expect(AssertionFailedError.class);
    onView(isRoot()).check(LayoutAssertions.noMultilineButtons());
  }

  @Test
  public void assertNoOverlaps() {
    onView(withId(R.id.length)).perform(click());
    expectedException.expect(AssertionFailedError.class);
    onView(isRoot()).check(LayoutAssertions.noOverlaps());
  }

  @Test
  public void assertNoOverlapsViewNotFound() {
    onView(withId(R.id.length)).perform(click());
    expectedException.expect(NoMatchingViewException.class);
    onView(withText("nonexistent")).check(LayoutAssertions.noOverlaps());
  }
}
