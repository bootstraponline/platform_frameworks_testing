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

package android.support.test.testapp;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.testapp.LongListMatchers.isFooter;
import static android.support.test.testapp.LongListMatchers.withItemContent;
import static android.support.test.testapp.LongListMatchers.withItemSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * Demonstrates the usage of
 * {@link android.support.test.espresso.Espresso#onData(org.hamcrest.Matcher)}
 * to match data within list views.
 */
@LargeTest
public class AdapterViewTest extends ActivityInstrumentationTestCase2<LongListActivity> {

  @SuppressWarnings("deprecation")
  public AdapterViewTest() {
    // This constructor was deprecated - but we want to support lower API levels.
    super("android.support.test.testapp", LongListActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testClickOnItem50() {
    // The text view "item: 50" may not exist if we haven't scrolled to it.
    // By using onData api we tell Espresso to look into the Adapter for an item matching
    // the matcher we provide it. Espresso will then bring that item into the view hierarchy
    // and we can click on it.

    onData(withItemContent("item: 50"))
      .perform(click());

    onView(withId(R.id.selection_row_value))
      .check(matches(withText("50")));
  }

  public void testClickOnSpecificChildOfRow60() {
    onData(withItemContent("item: 60"))
      .onChildView(withId(R.id.item_size)) // resource id of second column from xml layout
      .perform(click());

    onView(withId(R.id.selection_row_value))
      .check(matches(withText("60")));

    onView(withId(R.id.selection_column_value))
      .check(matches(withText("2")));
  }

  public void testClickOnFirstAndFifthItemOfLength8() {
    onData(is(withItemSize(8)))
      .atPosition(0)
      .perform(click());

    onView(withId(R.id.selection_row_value))
      .check(matches(withText("10")));

    onData(is(withItemSize(8)))
      .atPosition(4)
      .perform(click());

    onView(withId(R.id.selection_row_value))
      .check(matches(withText("14")));
  }

  @SuppressWarnings("unchecked")
  public void testClickFooter() {
    onData(isFooter())
      .perform(click());

    onView(withId(R.id.selection_row_value))
      .check(matches(withText("100")));
  }

  @SuppressWarnings("unchecked")
  public void testDataItemNotInAdapter(){
    onView(withId(R.id.list))
      .check(matches(not(withAdaptedData(withItemContent("item: 168")))));
  }

  private static Matcher<View> withAdaptedData(final Matcher<Object> dataMatcher) {
    return new TypeSafeMatcher<View>() {

      @Override
      public void describeTo(Description description) {
        description.appendText("with class name: ");
        dataMatcher.describeTo(description);
      }

      @Override
      public boolean matchesSafely(View view) {
        if (!(view instanceof AdapterView)) {
          return false;
        }
        @SuppressWarnings("rawtypes")
        Adapter adapter = ((AdapterView) view).getAdapter();
        for (int i = 0; i < adapter.getCount(); i++) {
          if (dataMatcher.matches(adapter.getItem(i))) {
            return true;
          }
        }
        return false;
      }
    };
  }
}
