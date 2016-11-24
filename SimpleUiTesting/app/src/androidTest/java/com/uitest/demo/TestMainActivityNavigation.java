package com.uitest.demo;

import android.support.annotation.IdRes;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by David on 11/22/2016.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestMainActivityNavigation {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToA() {
        clickView(R.id.goto_activity_a);
        shouldSee(R.id.textView_aaa);
    }

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToB() {
        clickView(R.id.goto_activity_b);
        shouldSee(R.id.textView_bbb);
    }

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToC() {
        clickView(R.id.goto_activity_c);
        shouldSee(R.id.textView_ccc);
    }


    /**
     * This function asserts that the view with given id is displayerd/seen
     * @param viewId
     */
    public static void shouldSee(@IdRes int viewId) {
        onView(withId(viewId)).check(matches(isDisplayed()));
    }

    /**
     * Click on a view, e.g. a button
     * @param viewId
     */
    public static void clickView(@IdRes int viewId) {
        onView(ViewMatchers.withId(viewId)).perform(click());
    }

}
