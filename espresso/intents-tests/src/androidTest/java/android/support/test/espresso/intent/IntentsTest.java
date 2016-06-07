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

package android.support.test.espresso.intent;

import android.app.Instrumentation.ActivityResult;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;

import com.google.common.collect.Lists;

import junit.framework.AssertionFailedError;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static android.support.test.espresso.intent.Intents.times;
import static android.support.test.espresso.intent.matcher.IntentMatchers.anyIntent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static org.hamcrest.CoreMatchers.allOf;
import static org.junit.Assert.assertTrue;
import static org.junit.rules.ExpectedException.none;

/**
 * Unit tests for {@Intents}.
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class IntentsTest {

  @Rule
  public ExpectedException expectedException = none();

  private Intents intento;

  private static final ResettingStubber RESETTING_STUB = new ResettingStubber() {
    @Override
    public void setActivityResultForIntent(Matcher<Intent> matcher, ActivityResult result) {}

    @Override
    public ActivityResult getActivityResultForIntent(Intent intent) {
      return null;
    }

    @Override
    public void initialize() {}

    @Override
    public boolean isInitialized() {
      return true;
    }

    @Override
    public void reset() {}
  };

  @Before
  public void setUp() throws Exception {
    intento = new Intents(RESETTING_STUB);
    intento.internalInit();
  }

  @Test
  public void validateAnyIntent() {
    intento.internalIntended(anyIntent(), times(1),
        Lists.newArrayList(buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.some.package")));
  }

  @Test
  public void validateToOnePackage() {
    intento.internalIntended(toPackage("com.google.some.package"), times(1),
        Lists.newArrayList(buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.some.package")));
  }

  @Test
  public void validateToMultiplePackagesOne() {
    intento.internalIntended(toPackage("com.google.some.package"), times(1),
        Lists.newArrayList(buildVerifiableIntent(
            Intent.ACTION_VIEW, "com.google.some.package", "com.google.android.other")));
  }

  @SuppressWarnings("unchecked") // TODO(user): remove after upgrading hamcrest to 1.3
  @Test
  public void validateToMultiplePackagesTwo() {
    intento.internalIntended(
        allOf(toPackage("com.google.some.package"), toPackage("com.google.android.other")),
            times(1),
            Lists.newArrayList(buildVerifiableIntent(
                Intent.ACTION_VIEW, "com.google.some.package", "com.google.android.other")));
  }

  @Test
  public void validateNoPackagesFail() {
    expectedException.expect(AssertionFailedError.class);
    intento.internalIntended(toPackage("com.google.some.package"), times(1),
        new ArrayList<VerifiableIntent>());
  }

  @Test
  public void validateMultiplePackagesFail() {
    expectedException.expect(AssertionFailedError.class);
    intento.internalIntended(toPackage("com.google.some.fail"), times(1),
        Lists.newArrayList(buildVerifiableIntent(
            Intent.ACTION_VIEW, "com.google.some.package", "com.google.android.other")));
  }

  @Test
  public void intended_MultipleCalls() {
    List<VerifiableIntent> intents = Lists.newArrayList(
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.A"),
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.B"),
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.C"));
    intento.internalIntended(toPackage("com.google.android.B"), times(1), intents);
    intento.internalIntended(toPackage("com.google.android.A"), times(1), intents);
    intento.internalIntended(toPackage("com.google.android.C"), times(1), intents);
  }

  @Test
  public void intended_MultipleCallsWithSameIntent() {
    List<VerifiableIntent> intents = Lists.newArrayList(
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.A"),
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.A"));
    intento.internalIntended(toPackage("com.google.android.A"), times(2), intents);
    intento.internalIntended(toPackage("com.google.android.A"), times(2), intents);
    try {
      intento.internalIntended(anyIntent(), times(1), intents);
      // Can't call fail() because it throws an AssertionFailedError, just like intended() does.
      throw new IllegalStateException("Expected to fail on previous line.");
    } catch (AssertionFailedError e) {
      // expected.
      Pattern p = Pattern.compile("Wanted to match 1 intents\\. Actually matched 2 intents\\..*"
          + "Matched intents:\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n\n"
          + "Recorded intents:\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.A.*",
          Pattern.DOTALL);
      assertTrue(String.format("Pattern\n\n%s\n\ndoesn't match\n\n%s", p, e.getMessage()),
          p.matcher(e.getMessage()).matches());
    }

    try {
      intento.internalIntended(anyIntent(), times(3), intents);
      // Can't call fail() because it throws an AssertionFailedError, just like intended() does.
      throw new IllegalStateException("Expected to fail on previous line.");
    } catch (AssertionFailedError e) {
      // expected.
      Pattern p = Pattern.compile("Wanted to match 3 intents\\. Actually matched 2 intents\\..*"
          + "Matched intents:\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n\n"
          + "Recorded intents:\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.A.*",
          Pattern.DOTALL);
      assertTrue(String.format("Pattern\n\n%s\n\ndoesn't match\n\n%s", p, e.getMessage()),
          p.matcher(e.getMessage()).matches());
    }

    intento.internalIntended(anyIntent(), times(2), intents);
  }

  @Test
  public void intended_NoIntents() {
    intento.internalIntended(anyIntent(), times(0), new ArrayList<VerifiableIntent>());
  }

  @Test
  public void assertNoUnverifiedIntents() {
    List<VerifiableIntent> intents = Lists.newArrayList(
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.A"),
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.B"),
        buildVerifiableIntent(Intent.ACTION_VIEW, "com.google.android.A"));

    // Match Intent A.
    intento.internalIntended(toPackage("com.google.android.A"), Intents.times(2), intents);

    // assertNoUnverifiedIntents() should fail because Intent B hasn't been verified.
    try {
      intento.internalIntended(anyIntent(), VerificationModes.noUnverifiedIntents(), intents);
      // Can't call fail() because it throws an AssertionFailedError, just like intended() does.
      throw new IllegalStateException("Expected to fail on previous line.");
    } catch (AssertionFailedError e) {
      // expected.
      Pattern p = Pattern.compile("Found unverified intents.\n\n"
          + "Unverified intents:\n"
          + "-[^\n]*com\\.google\\.android\\.B[^\n]*\n\n"
          + "Recorded intents:\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.B[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.A.*",
          Pattern.DOTALL);
      assertTrue(String.format("Pattern\n\n%s\n\ndoesn't match\n\n%s", p, e.getMessage()),
          p.matcher(e.getMessage()).matches());
    }

    // Try, but fail to match B.
    try {
      intento.internalIntended(toPackage("com.google.android.B"), Intents.times(2), intents);
      // Can't call fail() because it throws an AssertionFailedError, just like intended() does.
      throw new IllegalStateException("Expected to fail on previous line.");
    } catch (AssertionFailedError e) {
      // expected.
      Pattern p = Pattern.compile("Wanted to match 2 intents\\. Actually matched 1 intents\\..*"
          + "Matched intents:\n"
          + "-[^\n]*com\\.google\\.android\\.B[^\n]*\n\n"
          + "Recorded intents:\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.B[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.A.*",
          Pattern.DOTALL);
      assertTrue(String.format("Pattern\n\n%s\n\ndoesn't match\n\n%s", p, e.getMessage()),
          p.matcher(e.getMessage()).matches());
    }

    // assertNoUnverifiedIntents() should fail because Intent B still hasn't been verified. The
    // previous call to intended() should have left Intent B still unverified since it failed.
    try {
      intento.internalIntended(anyIntent(), VerificationModes.noUnverifiedIntents(), intents);
      // Can't call fail() because it throws an AssertionFailedError, just like intended() does.
      throw new IllegalStateException("Expected to fail on previous line.");
    } catch (AssertionFailedError e) {
      // expected.
      Pattern p = Pattern.compile("Found unverified intents.\n\n"
          + "Unverified intents:\n"
          + "-[^\n]*com\\.google\\.android\\.B[^\n]*\n\n"
          + "Recorded intents:\n"
          + "-[^\n]*com\\.google\\.android\\.A[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.B[^\n]*\n"
          + "-[^\n]*com\\.google\\.android\\.A.*",
          Pattern.DOTALL);
      assertTrue(String.format("Pattern\n\n%s\n\ndoesn't match\n\n%s", p, e.getMessage()),
          p.matcher(e.getMessage()).matches());
    }

    // Match Intent B.
    intento.internalIntended(toPackage("com.google.android.B"), Intents.times(1), intents);

    // Multiple calls should not fail.
    intento.internalIntended(anyIntent(), VerificationModes.noUnverifiedIntents(), intents);
    intento.internalIntended(anyIntent(), VerificationModes.noUnverifiedIntents(), intents);
  }

  private static VerifiableIntent buildVerifiableIntent(String action, String... packages) {
    return new VerifiableIntentImpl(
        new ResolvedIntentImpl(new Intent(action), buildResolveInfoList(packages)));
  }

  private static List<ResolveInfo> buildResolveInfoList(String... resolvePackage) {
    List<ResolveInfo> resolveInfoList = Lists.newArrayList();
    for (String pkg : resolvePackage) {
      ResolveInfo resolveInfo = new ResolveInfo();
      resolveInfo.activityInfo = new ActivityInfo();
      resolveInfo.activityInfo.packageName = pkg;
      resolveInfoList.add(resolveInfo);
    }
    return resolveInfoList;
  }

  @After
  public void tearDown() throws Exception {
    intento.internalRelease();
    intento = null;
  }

}
