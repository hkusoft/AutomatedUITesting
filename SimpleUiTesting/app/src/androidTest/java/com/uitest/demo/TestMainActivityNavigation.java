package com.uitest.demo;

import android.os.SystemClock;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by David on 11/22/2016.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestMainActivityNavigation {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    private static long dealyInMillis = 2000L;

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToA() {
        TestHelper.clickView(R.id.goto_activity_a);
        TestHelper.shouldSee(R.id.textView_aaa);

        if(BuildConfig.DEBUG)
            SystemClock.sleep(dealyInMillis);
    }

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToB() {
        TestHelper.clickView(R.id.goto_activity_b);
        TestHelper.shouldSee(R.id.textView_bbb);
        if(BuildConfig.DEBUG)
            SystemClock.sleep(dealyInMillis);
    }

    /**
     * This function tests button click on "Activity A", then UI should go to the corresponding activity
     */
    @Test
    public void TestNavigateToC() {
        TestHelper.clickView(R.id.goto_activity_c);
        TestHelper.shouldSee(R.id.textView_ccc);
        if(BuildConfig.DEBUG)
            SystemClock.sleep(dealyInMillis);
    }
}
