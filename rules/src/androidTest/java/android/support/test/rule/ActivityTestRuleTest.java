/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.rule;

import android.app.Activity;
import android.app.Instrumentation;
import android.app.Instrumentation.ActivityResult;
import android.content.Context;
import android.content.Intent;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.MonitoringInstrumentation;
import android.support.test.runner.intercepting.SingleActivityFactory;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.model.Statement;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.runner.JUnitCore.runClasses;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ActivityTestRuleTest {

    private static final ActivityFixture mMockActivity = mock(ActivityFixture.class);

    public class ActivityFixture extends Activity {}

    public static class ActivityLifecycleTest {

        private static StringBuilder log = new StringBuilder();

        @Rule
        public ActivityTestRule<ActivityFixture> mActivityRule =
                new ActivityTestRule<ActivityFixture>(ActivityFixture.class) {
                    @Override
                    protected void beforeActivityLaunched() {
                        log.append("beforeActivityLaunched ");
                    }

                    @Override
                    public ActivityFixture launchActivity(Intent startIntent) {
                        log.append("launchActivity ");
                        return null;
                    }

                    @Override
                    protected void afterActivityLaunched() {
                        log.append("afterActivityLaunched ");
                    }

                    @Override
                    protected void afterActivityFinished() {
                        log.append("afterActivityFinished ");
                    }

                    @Override
                    void finishActivity() {
                        log.append("finishActivity ");
                    }
                };

        @Before
        public void before() {
            log.append("before ");
        }

        @Test
        public void fails() {
            log.append("test ");
            fail("This is a dummy test");
        }

        @After
        public void after() {
            log.append("after ");
        }
    }

    @Test
    public void activityLifecycleTest() {
        Result result = runClasses(ActivityLifecycleTest.class);
        assertEquals(1, result.getFailureCount());
        assertThat(result.getFailures().get(0).getMessage(), is("This is a dummy test"));
        assertThat(ActivityLifecycleTest.log.toString(),
                is("launchActivity before test after "
                        + "finishActivity afterActivityFinished "));
    }

    public static class FailureOfActivityLaunchTest {

        @Rule
        public ActivityTestRule<ActivityFixture> mActivityRule =
                new ActivityTestRule<>(ActivityFixture.class);

        @Test
        public void emptyTest() {
        }
    }

    @Test
    public void failureOfActivityLaunch() {
        Result result = runClasses(FailureOfActivityLaunchTest.class);
        assertEquals(1, result.getFailureCount());
        assertEquals(RuntimeException.class, result.getFailures().get(0).getException().getClass());
        assertThat(result.getFailures().get(0).getMessage(), is("Could not launch activity"));
    }

    public static class SuccessfulLaunchTest {

        @Rule
        public ActivityTestRule<ActivityFixture> mActivityRule =
                new ActivityTestRule<ActivityFixture>(ActivityFixture.class) {
                    @Override
                    public ActivityFixture launchActivity(Intent startIntent) {
                        return mMockActivity;
                    }
                };

        @Test
        public void verifyTheLaunchedActivityIsReturned() {
            ActivityFixture activity = mActivityRule.getActivity();
            assertNotNull(activity);
        }
    }

    @Test
    public void successfulLaunch() {
        Result result = runClasses(SuccessfulLaunchTest.class);
        assertEquals(0, result.getFailureCount());
    }

    public static class MockedInstrumentationTest {

        @Mock
        Instrumentation mInstrumentation;

        @Mock
        Context mTargetContext;

        protected boolean mBeforeActivityLaunched = false;
        protected boolean mAfterActivityLaunched = false;
        protected boolean mAfterActivityFinished = false;

        @Rule
        public ActivityTestRule<ActivityFixture> mActivityRule =
                new ActivityTestRule<ActivityFixture>(ActivityFixture.class, false, false) {

                    @Override
                    protected void beforeActivityLaunched() {
                        super.beforeActivityLaunched();
                        mBeforeActivityLaunched = true;
                    }

                    @Override
                    protected void afterActivityLaunched() {
                        mAfterActivityLaunched = true;
                        super.afterActivityLaunched();
                    }

                    @Override
                    protected void afterActivityFinished() {
                        mAfterActivityFinished = true;
                        super.afterActivityFinished();
                    }

                };

        @Before
        public void injectMockInstrumentation() {
            MockitoAnnotations.initMocks(this);
            mActivityRule.setInstrumentation(mInstrumentation);
            when(mInstrumentation.startActivitySync(argThat(is(any(Intent.class)))))
                    .thenReturn(mMockActivity);
            when(mInstrumentation.getTargetContext()).thenReturn(mTargetContext);
            when(mTargetContext.getPackageName()).thenReturn("com.android.testing.rocks");
        }
    }

    public static class LaunchActivityLifecycleTest extends MockedInstrumentationTest {

        @Test
        public void launchActivityCallsLifecycleMethods() {
            assertNull(mActivityRule.getActivity());
            assertFalse(mBeforeActivityLaunched);

            mActivityRule.launchActivity(null);

            assertNotNull(mActivityRule.getActivity());
            assertTrue(mBeforeActivityLaunched);
            assertTrue(mAfterActivityLaunched);
        }

    }

    @Test
    public void launchActivityLifcycle() {
        Result result = runClasses(LaunchActivityLifecycleTest.class);
        assertEquals(0, result.getFailureCount());
    }

    public static class ActivityDoesNotLaunchedWhenLazyLaunchFlagSetTest
            extends MockedInstrumentationTest {
        @Test
        public void lazilyLaunchedActivity_ExcercisesLifecycleCorrectly() {
            assertNull(mActivityRule.getActivity());
            assertFalse(mBeforeActivityLaunched);

            mActivityRule.launchActivity(null);

            assertNotNull(mActivityRule.getActivity());
            assertTrue(mBeforeActivityLaunched);
            assertTrue(mAfterActivityLaunched);
            assertFalse(mAfterActivityFinished);
        }
    }

    @Test
    public void activity_DoesNotLaunch_WhenLazyLaunchFlagSet() {
        Result result = runClasses(ActivityDoesNotLaunchedWhenLazyLaunchFlagSetTest.class);
        assertEquals(0, result.getFailureCount());
    }

    public static class CustomIntentPerTest extends MockedInstrumentationTest {

        @Test
        public void customIntent_Set_IsUsedToStartActivity() {
            assertNull(mActivityRule.getActivity());

            final Intent actionPick = new Intent(Intent.ACTION_PICK);
            mActivityRule.launchActivity(actionPick);

            assertNotNull(mActivityRule.getActivity());
            verify(mInstrumentation).startActivitySync(actionPick);
        }

        @Test
        public void customIntent_NotSet_UsesDefaultIntentToStartActivity() {
            assertNull(mActivityRule.getActivity());

            mActivityRule.launchActivity(null);

            assertNotNull(mActivityRule.getActivity());
        }

        @Test
        public void customIntent_SetToNull_DoesNotThrow() {
            assertNull(mActivityRule.getActivity());
            assertNotNull(mActivityRule.launchActivity(null));
        }

    }

    @Test
    public void customIntentPerTest() {
        Result result = runClasses(CustomIntentPerTest.class);
        assertEquals(0, result.getFailureCount());
    }

    @Test
    public void shouldAskInstrumentationToInterceptActivityUsingGivenFactoryAndResetItAfterTest()
            throws Throwable {
        SingleActivityFactory<ActivityFixture> singleActivityFactory =
                new SingleActivityFactory<ActivityFixture>(ActivityFixture.class) {
                    @Override
                    public ActivityFixture create(Intent intent) {
                        return mMockActivity;
                    }
                };
        ActivityTestRule<ActivityFixture> activityTestRule = new ActivityTestRule<>(
                singleActivityFactory, true, false);
        MonitoringInstrumentation instrumentation = mock(MonitoringInstrumentation.class);
        when(instrumentation.getTargetContext()).thenReturn(getTargetContext());
        activityTestRule.setInstrumentation(instrumentation);
        Statement baseStatement = mock(Statement.class);
        activityTestRule.apply(baseStatement, mock(Description.class)).evaluate();

        InOrder inOrder = Mockito.inOrder(instrumentation, baseStatement);
        inOrder.verify(instrumentation).interceptActivityUsing(singleActivityFactory);
        inOrder.verify(baseStatement).evaluate();
        inOrder.verify(instrumentation).useDefaultInterceptingActivityFactory();
    }

    public static class SuccessfulGetActivityResultTest {
        @Rule
        public ActivityTestRule<Activity> mRule = new ActivityTestRule<>(Activity.class);
        @Test
        public void shouldReturnActivityResult() {
            Intent startIntent = new Intent(getTargetContext(), Activity.class);
            Activity activity = mRule.launchActivity(startIntent);
            activity.setResult(Activity.RESULT_OK,
                    new Intent(Intent.ACTION_VIEW));
            activity.finish();

            ActivityResult activityResult = mRule.getActivityResult();
            assertNotNull(activityResult);
            assertEquals(Activity.RESULT_OK, activityResult.getResultCode());
            assertEquals(Intent.ACTION_VIEW, activityResult.getResultData().getAction());
        }
    }

    @Test
    public void successfulGetActivityResult() {
        Result result = runClasses(SuccessfulGetActivityResultTest.class);
        assertEquals(0, result.getFailureCount());
    }

    public static class FailureGetActivityResultTest {
        @Rule
        public ActivityTestRule<Activity> mRule = new ActivityTestRule<>(Activity.class);
        @Test
        public void shouldfailWhenNotFinishing() {
            Intent startIntent = new Intent(getTargetContext(), Activity.class);
            Activity activity = mRule.launchActivity(startIntent);
            activity.setResult(Activity.RESULT_OK,
                    new Intent(Intent.ACTION_VIEW));
            mRule.getActivityResult();
        }
    }

    @Test
    public void failureGetActivityResult() {
        Result result = runClasses(FailureGetActivityResultTest.class);
        assertEquals(1, result.getFailureCount());
        assertEquals(IllegalStateException.class,
                result.getFailures().get(0).getException().getClass());
    }

}
