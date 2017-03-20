/*
 * Copyright (C) 2016 The Android Open Source Project
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

import android.app.Activity;
import android.support.test.espresso.intent.matcher.IntentMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.contrib.ActivityResultMatchers.hasResultCode;
import static android.support.test.espresso.contrib.ActivityResultMatchers.hasResultData;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class ActivityResultTest {
    @Rule
    public ActivityTestRule<PickActivity> rule
            = new ActivityTestRule<PickActivity>(PickActivity.class);

    @Test
    public void getResultOkFromPickActivity() {
        onView(withText(R.string.button_pick_number)).perform(click());
        assertThat(rule.getActivityResult(), hasResultCode(Activity.RESULT_OK));
        assertThat(rule.getActivityResult(),
                hasResultData(IntentMatchers.hasExtraWithKey(PickActivity.EXTRA_PICKED_NUMBER)));
    }

    @Test
    public void getResultCancelFromPickActivity() {
        onView(withText(android.R.string.cancel)).perform(click());
        assertThat(rule.getActivityResult(), hasResultCode(Activity.RESULT_CANCELED));
        assertThat(rule.getActivityResult().getResultData(), is(nullValue()));
    }
}
