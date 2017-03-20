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

package android.support.test.espresso;

import static android.support.test.InstrumentationRegistry.getContext;
import static com.google.common.base.Throwables.propagate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.rules.ExpectedException.none;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitor;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import android.support.test.espresso.matcher.RootMatchers;
import com.google.common.util.concurrent.MoreExecutors;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/** Unit tests for {@link ViewInteraction}. */
@SmallTest
@RunWith(AndroidJUnit4.class)
public class ViewInteractionTest {
  @Mock
  private ViewFinder mockViewFinder;
  @Mock
  private ViewAssertion mockAssertion;
  @Mock
  private ViewAction mockAction;
  @Mock
  private UiController mockUiController;


  private FailureHandler failureHandler;
  private Executor testExecutor = MoreExecutors.directExecutor();

  private ActivityLifecycleMonitor realLifecycleMonitor;
  private ViewInteraction testInteraction;
  private View rootView;
  private View targetView;
  private Matcher<View> viewMatcher;
  private Matcher<View> actionConstraint;
  private AtomicReference<Matcher<Root>> rootMatcherRef;

  @Rule
  public ExpectedException expectedException = none();

  @Before
  public void setUp() throws Exception {
    initMocks(this);
    realLifecycleMonitor = ActivityLifecycleMonitorRegistry.getInstance();
    rootView = new View(getContext());
    targetView = new View(getContext());
    viewMatcher = is(targetView);
    actionConstraint = notNullValue(View.class);
    rootMatcherRef = new AtomicReference<>(RootMatchers.DEFAULT);
    when(mockAction.getDescription()).thenReturn("A Mock!");
    failureHandler = new FailureHandler() {
      @Override
      public void handle(Throwable error, Matcher<View> viewMatcher) {
        propagate(error);
      }
    };
  }

  @After
  public void tearDown() throws Exception {
    ActivityLifecycleMonitorRegistry.registerInstance(realLifecycleMonitor);
  }

  @Test
  public void performViewViolatesConstraints() {
    actionConstraint = not(viewMatcher);
    when(mockViewFinder.getView()).thenReturn(targetView);
    initInteraction();
    expectedException.expect(PerformException.class);
    testInteraction.perform(mockAction);
  }

  @Test
  public void performPropagatesException() {
    RuntimeException exceptionToRaise = new RuntimeException();
    when(mockViewFinder.getView()).thenReturn(targetView);
    doThrow(exceptionToRaise)
        .when(mockAction)
        .perform(mockUiController, targetView);
    initInteraction();
    try {
      testInteraction.perform(mockAction);
      fail("Should propagate exception stored in view operation!");
    } catch (RuntimeException re) {
      verify(mockAction).perform(mockUiController, targetView);
      assertThat(exceptionToRaise, is(re));
    }
  }

  @Test
  public void checkPropagatesException() {
    RuntimeException exceptionToRaise = new RuntimeException();
    when(mockViewFinder.getView()).thenReturn(targetView);
    doThrow(exceptionToRaise)
      .when(mockAssertion)
      .check(targetView, null);

    initInteraction();
    try {
      testInteraction.check(mockAssertion);
      fail("Should propagate exception stored in view operation!");
    } catch (RuntimeException re) {
      verify(mockAssertion).check(targetView, null);
      assertThat(exceptionToRaise, is(re));
    }
  }

  @Test
  public void performTwiceUpdatesPreviouslyMatched() {
    View firstView = new View(getContext());
    View secondView = new View(getContext());
    when(mockViewFinder.getView()).thenReturn(firstView);
    initInteraction();
    testInteraction.perform(mockAction);
    verify(mockAction).perform(mockUiController, firstView);

    when(mockViewFinder.getView()).thenReturn(secondView);
    testInteraction.perform(mockAction);
    verify(mockAction).perform(mockUiController, secondView);

    testInteraction.check(mockAssertion);
    verify(mockAssertion).check(secondView, null);

  }

  @Test
  public void performAndCheck() {
    when(mockViewFinder.getView()).thenReturn(targetView);
    initInteraction();
    testInteraction.perform(mockAction);
    verify(mockAction).perform(mockUiController, targetView);

    testInteraction.check(mockAssertion);
    verify(mockAssertion).check(targetView, null);
  }

  @Test
  public void checkTest() {
    when(mockViewFinder.getView()).thenReturn(targetView);
    initInteraction();
    testInteraction.check(mockAssertion);
    verify(mockAssertion).check(targetView, null);
  }

  @Test
  public void inRootUpdatesRef() {
    initInteraction();
    Matcher<Root> testMatcher = nullValue(Root.class);
    testInteraction.inRoot(testMatcher);
    assertEquals(testMatcher, rootMatcherRef.get());
  }

  @Test
  public void inRoot_NullHandling() {
    initInteraction();
    expectedException.expect(NullPointerException.class);
    testInteraction.inRoot(null);
  }

  @Test
  public void check_ViewCannotBeFound() {
    NoMatchingViewException noViewException = new NoMatchingViewException.Builder()
        .withViewMatcher(viewMatcher)
        .withRootView(rootView)
        .build();

    when(mockViewFinder.getView()).thenThrow(noViewException);
    initInteraction();
    testInteraction.check(mockAssertion);
    verify(mockAssertion).check(null, noViewException);
  }

  @Test
  public void failureHandler() {
    RuntimeException exceptionToRaise = new RuntimeException();
    when(mockViewFinder.getView()).thenReturn(targetView);
    doThrow(exceptionToRaise)
        .when(mockAction)
        .perform(mockUiController, targetView);
    initInteraction();
    FailureHandler customFailureHandler = Mockito.mock(FailureHandler.class);
    testInteraction.withFailureHandler(customFailureHandler).perform(mockAction);
    verify(mockAction).perform(mockUiController, targetView);
    verify(customFailureHandler).handle(exceptionToRaise, viewMatcher);
  }

  private void initInteraction() {
    when(mockAction.getConstraints()).thenReturn(actionConstraint);

    testInteraction = new ViewInteraction(mockUiController,
        mockViewFinder,
        testExecutor,
        failureHandler,
        viewMatcher,
        rootMatcherRef);
  }
}
