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

import org.hamcrest.CustomTypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.openLinkWithText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.containsString;
import static org.junit.rules.ExpectedException.none;

/**
 * {@link OpenLinkAction} integration tests.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class OpenLinkActionTest {

  @Rule
  public ActivityTestRule<SendActivity> rule = new ActivityTestRule<>(SendActivity.class);

  @Rule
  public ExpectedException expectedException = none();

  @Test
  public void openLink_TargetViewNotSpanned() {
    expectedException.expect(PerformException.class);
    expectedException.expectCause(new CustomTypeSafeMatcher<Throwable>(
        "message contains has-links=false") {
      @Override
      protected boolean matchesSafely(Throwable throwable) {
        return throwable.getMessage().contains("has-links=false");
      }
    });
    onView(withId(R.id.send_title)).perform(scrollTo(), openLinkWithText("altavista.com"));
  }

  @Test
  public void testOpenLink_NoLinkFound() {
    expectedException.expect(PerformException.class);
    expectedException.expectCause(new CustomTypeSafeMatcher<Throwable>(
        "message contains has-links=false") {
      @Override
      protected boolean matchesSafely(Throwable throwable) {
        return throwable.getMessage().contains("bacon");
      }
    });
    onView(withId(R.id.spanned)).perform(scrollTo(), openLinkWithText("bacon"));
  }
}
