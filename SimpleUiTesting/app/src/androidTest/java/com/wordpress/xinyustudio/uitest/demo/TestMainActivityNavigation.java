package com.wordpress.xinyustudio.uitest.demo;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

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
        // press the button "Activity A"
        onView(ViewMatchers.withId(R.id.goto_activity_a)).perform(click());

        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.textView_aaa)).check(matches(isDisplayed()));
    }

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToB() {
        // press the button "Activity A"
        onView(ViewMatchers.withId(R.id.goto_activity_b)).perform(click());

        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.textView_bbb)).check(matches(isDisplayed()));
    }

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToC() {
        // press the button "Activity A"
        onView(ViewMatchers.withId(R.id.goto_activity_c)).perform(click());

        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.textView_ccc)).check(matches(isDisplayed()));
    }

}
