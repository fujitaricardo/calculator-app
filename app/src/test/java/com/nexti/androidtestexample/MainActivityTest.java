package com.nexti.androidtestexample;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void onAddition_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_addition).performClick();
            activity.findViewById(R.id.cv_9).performClick();
            activity.findViewById(R.id.cv_8).performClick();
            activity.findViewById(R.id.cv_7).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "1110");
        }
    }

    @Test
    public void onSubtraction_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_subtraction).performClick();
            activity.findViewById(R.id.cv_9).performClick();
            activity.findViewById(R.id.cv_8).performClick();
            activity.findViewById(R.id.cv_7).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "-864");
        }
    }

    @Test
    public void onNegativeSubtraction_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_9).performClick();
            activity.findViewById(R.id.cv_8).performClick();
            activity.findViewById(R.id.cv_7).performClick();
            activity.findViewById(R.id.cv_subtraction).performClick();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "864");
        }
    }

    @Test
    public void onMultiplication_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_multiplication).performClick();
            activity.findViewById(R.id.cv_9).performClick();
            activity.findViewById(R.id.cv_8).performClick();
            activity.findViewById(R.id.cv_7).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "121401");
        }
    }

    @Test
    public void onNegativeMultiplication_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_multiplication).performClick();
            activity.findViewById(R.id.cv_9).performClick();
            activity.findViewById(R.id.cv_8).performClick();
            activity.findViewById(R.id.cv_signal).performClick();
            activity.findViewById(R.id.cv_7).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "-121401");
        }
    }

    @Test
    public void onDivision_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_0).performClick();
            activity.findViewById(R.id.cv_0).performClick();
            activity.findViewById(R.id.cv_division).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_5).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "4");
        }
    }

    @Test
    public void onNegativeDivision_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_5).performClick();
            activity.findViewById(R.id.cv_division).performClick();
            activity.findViewById(R.id.cv_5).performClick();
            activity.findViewById(R.id.cv_signal).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "-25");
        }
    }

    @Test
    public void onDecimalDivision_isResultCorrect() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_0).performClick();
            activity.findViewById(R.id.cv_0).performClick();
            activity.findViewById(R.id.cv_division).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_equals).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "33.3333333333");
        }
    }

    @Test
    public void onClear_isWorking() {
        try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
            controller.setup();
            MainActivity activity = controller.get();
            activity.findViewById(R.id.cv_1).performClick();
            activity.findViewById(R.id.cv_2).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_addition).performClick();
            activity.findViewById(R.id.cv_3).performClick();
            activity.findViewById(R.id.cv_clear).performClick();
            assertEquals(((TextView) activity.findViewById(R.id.tv_result)).getText(), "0");
        }
    }
}
