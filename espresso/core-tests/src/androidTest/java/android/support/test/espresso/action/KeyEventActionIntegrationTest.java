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

import android.content.Intent;
import android.support.test.espresso.NoActivityResumedException;
import android.support.test.filters.SdkSuppress;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.testapp.MainActivity;
import android.support.test.testapp.R;
import android.test.FlakyTest;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.KeyEvent;
import android.widget.TextView;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.Map;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.fail;
import static org.junit.rules.ExpectedException.none;

/**
 * Integration tests for {@link KeyEventAction}.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class KeyEventActionIntegrationTest {

  @Rule
  public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class,
      true, false);

  @Rule
  public ExpectedException expectedException = none();

  @Test
  public void clickBackOnRootAction() {
    rule.launchActivity(null);
    expectedException.expect(NoActivityResumedException.class);
    pressBack();
  }

  @Test
  public void clickBackOnNonRootActivityLatte() {
    rule.launchActivity(null);
    onData(allOf(instanceOf(Map.class), hasValue("LargeViewActivity"))).perform(click());
    pressBack();

    // Make sure we are back.
    onData(allOf(instanceOf(Map.class), hasValue("LargeViewActivity")))
        .check(matches(isDisplayed()));
  }

  @Test
  public void clickBackOnNonRootActionNoLatte() {
    rule.launchActivity(null);
    onData(allOf(instanceOf(Map.class), hasValue("LargeViewActivity"))).perform(click());
    onView(isRoot()).perform(ViewActions.pressBack());

    // Make sure we are back.
    onData(allOf(instanceOf(Map.class), hasValue("LargeViewActivity")))
        .check(matches(isDisplayed()));
  }

  @Ignore("Test only passes if run in isolation. Unless Gradle supports a single instrumentation " +
      "per test this test is ignored")
  @SuppressWarnings("unchecked")
  @SdkSuppress(minSdkVersion=13)
  @FlakyTest
  public void clickOnBackFromFragment() {
    Intent fragmentStack = new Intent().setClassName(getTargetContext(),
        "android.support.test.testapp.FragmentStack");
    fragmentStack.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    rule.launchActivity(fragmentStack);
    onView(allOf(withParent(withId(R.id.simple_fragment)), isAssignableFrom(TextView.class)))
        .check(matches(withText(containsString("#1"))));
    try {
      pressBack();
      fail("Should have thrown NoActivityResumedException");
    } catch (NoActivityResumedException expected) {
    }
    rule.launchActivity(fragmentStack);

    onView(withId(R.id.new_fragment)).perform(click()).perform(click()).perform(click());

    onView(allOf(withParent(withId(R.id.simple_fragment)), isAssignableFrom(TextView.class)))
        .check(matches(withText(containsString("#4"))));

    pressBack();

    onView(allOf(withParent(withId(R.id.simple_fragment)), isAssignableFrom(TextView.class)))
        .check(matches(withText(containsString("#3"))));

    pressBack();

    onView(allOf(withParent(withId(R.id.simple_fragment)), isAssignableFrom(TextView.class)))
        .check(matches(withText(containsString("#2"))));

    pressBack();

    onView(allOf(withParent(withId(R.id.simple_fragment)), isAssignableFrom(TextView.class)))
        .check(matches(withText(containsString("#1"))));

    try {
      pressBack();
      fail("Should have thrown NoActivityResumedException");
    } catch (NoActivityResumedException expected) {
    }
  }

  @Test
  public void pressKeyWithKeyCode() {
    rule.launchActivity(null);
    onData(allOf(instanceOf(Map.class), hasValue("SendActivity"))).perform(click());
    onView(withId(R.id.enter_data_edit_text)).perform(click());
    onView(withId(R.id.enter_data_edit_text)).perform(ViewActions.pressKey(KeyEvent.KEYCODE_X));
    onView(withId(R.id.enter_data_edit_text)).perform(ViewActions.pressKey(KeyEvent.KEYCODE_Y));
    onView(withId(R.id.enter_data_edit_text)).perform(ViewActions.pressKey(KeyEvent.KEYCODE_Z));
    onView(withId(R.id.enter_data_edit_text)).perform(ViewActions.pressKey(KeyEvent.KEYCODE_ENTER));
    onView(allOf(withId(R.id.enter_data_response_text), withText("xyz")))
        .check(matches(isDisplayed()));
  }
}
