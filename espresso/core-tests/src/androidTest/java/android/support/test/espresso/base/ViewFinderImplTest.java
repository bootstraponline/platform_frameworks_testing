/*
 * Copyright (C) 2015 The Android Open Source Project
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

package android.support.test.espresso.base;

import android.content.Context;
import android.support.test.annotation.UiThreadTest;
import android.support.test.espresso.AmbiguousViewMatcherException;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewFinder;
import android.support.test.rule.UiThreadTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import javax.inject.Provider;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.fail;
import static org.junit.rules.ExpectedException.none;

/** Unit tests for {@link ViewFinderImpl}. */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class ViewFinderImplTest {

  private Provider<View> testViewProvider;
  private RelativeLayout testView;
  private View child1;
  private View child2;
  private View child3;
  private View child4;
  private View nestedChild;
  private Context mTargetContext;

  @Rule
  public UiThreadTestRule uiThreadTestRule = new UiThreadTestRule();

  @Rule
  public ExpectedException expectedException = none();

  @Before
  public void setUp() throws Exception {
    mTargetContext = getInstrumentation().getTargetContext();
    testView = new RelativeLayout(mTargetContext);
    child1 = new TextView(mTargetContext);
    child1.setId(1);
    child2 = new TextView(mTargetContext);
    child2.setId(2);
    child3 = new TextView(mTargetContext);
    child3.setId(3);
    child4 = new TextView(mTargetContext);
    child4.setId(4);
    nestedChild = new TextView(mTargetContext);
    nestedChild.setId(5);
    RelativeLayout nestingLayout = new RelativeLayout(mTargetContext);
    nestingLayout.addView(nestedChild);
    testView.addView(child1);
    testView.addView(child2);
    testView.addView(nestingLayout);
    testView.addView(child3);
    testView.addView(child4);
    testViewProvider = new Provider<View>() {
      @Override
      public View get() {
        return testView;
      }

      @Override
      public String toString() {
        return "of(" + testView + ")";
      }
    };
  }

  
  @Test
  @UiThreadTest
  public void getViewPresent() {
    ViewFinder finder = new ViewFinderImpl(sameInstance(nestedChild), testViewProvider);
    assertThat(finder.getView(), sameInstance(nestedChild));
  }

  @Test
  @UiThreadTest
  public void getView_missing() {
    ViewFinder finder = new ViewFinderImpl(nullValue(View.class), testViewProvider);
    expectedException.expect(NoMatchingViewException.class);
    finder.getView();
  }

  
  @Test
  @UiThreadTest
  public void getView_multiple() {
    ViewFinder finder = new ViewFinderImpl(notNullValue(View.class), testViewProvider);
    expectedException.expect(AmbiguousViewMatcherException.class);
    finder.getView();
  }

  @Test
  public void find_offUiThread() {
    ViewFinder finder = new ViewFinderImpl(sameInstance(nestedChild), testViewProvider);
    expectedException.expect(IllegalStateException.class);
    finder.getView();
  }

}
