/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.espresso.intent.rule;

import android.app.Activity;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.intent.IntentStubberRegistry;
import android.test.suitebuilder.annotation.MediumTest;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.Statement;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * IntentsRule tests
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class IntentsRuleTest {

  Description mDescriptionStub = Description
          .createTestDescription(IntentsRuleTest.class, "someTest");

  @Test
  public void applyRule_InitsAndReleasesIntents() {
    IntentsTestRule<StubActivity> intentsTestRule = new IntentsTestRule<>(StubActivity.class);
    assertThat(IntentStubberRegistry.isLoaded(), is(false));

    // Check that the Intent Stubber is registered when base is evaluated
    Statement base = new Statement() {
      @Override
      public void evaluate() throws Throwable {
        assertThat(IntentStubberRegistry.isLoaded(), is(true));
      }
    };

    // Apply the TestRule
    intentsTestRule.apply(base, mDescriptionStub);

    // Check that Intents was released.
    assertThat(IntentStubberRegistry.isLoaded(), is(false));
  }

  @Test
  public void withNoLaunchConstructor_WillNotBeInitializedAfterCreation() {
    new IntentsTestRule<>(StubActivity.class, false, false);

    assertThat(IntentStubberRegistry.isLoaded(), is(false));
  }

  @Test
  public void withNoLaunchConstructor_WillNotInitWithoutExplicitCallToLaunchActivity() {
    IntentsTestRule<StubActivity> intentsTestRule = new IntentsTestRule<>(StubActivity.class, false, false);

    Statement base = new Statement() {
      @Override
      public void evaluate() throws Throwable {
        assertThat(IntentStubberRegistry.isLoaded(), is(false));
      }
    };

    intentsTestRule.apply(base, mDescriptionStub);
  }

  @Test
  public void withNoLaunchConstructor_WillInitWithExplicitCallToLaunchActivity() {
    final IntentsTestRule<StubActivity> intentsTestRule =
            new IntentsTestRule<>(StubActivity.class, false, false);

    Statement base = new Statement() {
      @Override
      public void evaluate() throws Throwable {
        launchStubActivityWithRule(intentsTestRule);
        assertThat(IntentStubberRegistry.isLoaded(), is(true));
      }
    };

    intentsTestRule.apply(base, mDescriptionStub);
  }

  @Test
  public void withNoLaunchConstructor_WillReleaseWithExplicitCallToLaunchActivity() {
    final IntentsTestRule<StubActivity> intentsTestRule =
            new IntentsTestRule<>(StubActivity.class, false, false);

    Statement base = new Statement() {
      @Override
      public void evaluate() throws Throwable {
        launchStubActivityWithRule(intentsTestRule);
      }
    };

    intentsTestRule.apply(base, mDescriptionStub);

    assertThat(IntentStubberRegistry.isLoaded(), is(false));
  }

  private void launchStubActivityWithRule(IntentsTestRule<StubActivity> intentsTestRule) {
    Intent intent = new Intent(InstrumentationRegistry.getTargetContext(), StubActivity.class);
    intentsTestRule.launchActivity(intent);
  }

  public static class StubActivity extends Activity {

  }

}
