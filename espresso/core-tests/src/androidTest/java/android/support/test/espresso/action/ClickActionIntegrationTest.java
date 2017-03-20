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

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.testapp.LargeViewActivity;
import android.support.test.testapp.R;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Tests for {@link GeneralClickAction} on a large view.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class ClickActionIntegrationTest {

  @Rule
  public ActivityTestRule<LargeViewActivity> rule = new ActivityTestRule<>(LargeViewActivity.class);

  @Test
  public void clickActionTesting() {
    onView(withId(R.id.large_view)).check(matches(withText("large view")));
    onView(withId(R.id.large_view)).perform(click());
    onView(withId(R.id.large_view)).check(matches(withText("Ouch!!!")));
  }
}
