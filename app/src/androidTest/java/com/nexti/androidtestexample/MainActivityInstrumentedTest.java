package com.nexti.androidtestexample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.nexti.androidtestexample", appContext.getPackageName());
    }

    @Test
    public void onAddition_isResultCorrect() {
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_3)).perform(click());
        onView(withId(R.id.cv_addition)).perform(click());
        onView(withId(R.id.cv_9)).perform(click());
        onView(withId(R.id.cv_8)).perform(click());
        onView(withId(R.id.cv_7)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("1110")));
    }

    @Test
    public void onSubtraction_isResultCorrect() {
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_3)).perform(click());
        onView(withId(R.id.cv_subtraction)).perform(click());
        onView(withId(R.id.cv_9)).perform(click());
        onView(withId(R.id.cv_8)).perform(click());
        onView(withId(R.id.cv_7)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("-864")));
    }

    @Test
    public void onNegativeSubtraction_isResultCorrect() {
        onView(withId(R.id.cv_9)).perform(click());
        onView(withId(R.id.cv_8)).perform(click());
        onView(withId(R.id.cv_7)).perform(click());
        onView(withId(R.id.cv_subtraction)).perform(click());
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_3)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("864")));
    }

    @Test
    public void onMultiplication_isResultCorrect() {
        onView(withId(R.id.cv_9)).perform(click());
        onView(withId(R.id.cv_8)).perform(click());
        onView(withId(R.id.cv_7)).perform(click());
        onView(withId(R.id.cv_multiplication)).perform(click());
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_3)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("121401")));
    }

    @Test
    public void onNegativeMultiplication_isResultCorrect() {
        onView(withId(R.id.cv_9)).perform(click());
        onView(withId(R.id.cv_8)).perform(click());
        onView(withId(R.id.cv_7)).perform(click());
        onView(withId(R.id.cv_signal)).perform(click());
        onView(withId(R.id.cv_multiplication)).perform(click());
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_3)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("-121401")));
    }

    @Test
    public void onDivision_isResultCorrect() {
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_0)).perform(click());
        onView(withId(R.id.cv_0)).perform(click());
        onView(withId(R.id.cv_division)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_5)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));
    }

    @Test
    public void onNegativeDivision_isResultCorrect() {
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_5)).perform(click());
        onView(withId(R.id.cv_division)).perform(click());
        onView(withId(R.id.cv_5)).perform(click());
        onView(withId(R.id.cv_signal)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("-25")));
    }

    @Test
    public void onDecimalDivision_isResultCorrect() {
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_0)).perform(click());
        onView(withId(R.id.cv_0)).perform(click());
        onView(withId(R.id.cv_division)).perform(click());
        onView(withId(R.id.cv_3)).perform(click());
        onView(withId(R.id.cv_equals)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("33.3333333333")));
    }

    @Test
    public void onClear_isWorking() {
        onView(withId(R.id.cv_1)).perform(click());
        onView(withId(R.id.cv_2)).perform(click());
        onView(withId(R.id.cv_4)).perform(click());
        onView(withId(R.id.cv_5)).perform(click());
        onView(withId(R.id.cv_6)).perform(click());
        onView(withId(R.id.cv_7)).perform(click());
        onView(withId(R.id.cv_clear)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }
}