package com.uitest.demo;

import android.support.annotation.IdRes;
import android.support.test.espresso.matcher.ViewMatchers;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by David on 11/24/2016.
 */

public class TestHelper {
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
