package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class d_exercise_h_b_logBikePast extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;

    static {
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public d_exercise_h_b_logBikePast() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 500);
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
        assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        solo.sleep(500);
        solo.clickOnView(solo.getView("tile_content", 1));

        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseListActivity'
        assertTrue("ExerciseListActivity is not found!", solo.waitForActivity("ExerciseListActivity"));
        //sleep for x seconds
        solo.sleep(500);


        //Click on Empty Text View
        solo.clickOnView(solo.getView("new_exercise"));
        //Wait for activity: 'com.fitbit.runtrack.ui.RecordExerciseActivity'
        assertTrue("RecordExerciseActivity is not found!", solo.waitForActivity("RecordExerciseActivity"));
        //sleep for x seconds
        solo.sleep(500);

        solo.clickOnText(java.util.regex.Pattern.quote("Log Previous"));


        solo.enterText(0, "bike");
        solo.clickOnText(java.util.regex.Pattern.quote("Bike"));

        solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
        solo.setDatePicker(0, 2015, 5, 8);
        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.clickOnView(solo.getView("start_time"));

        solo.setTimePicker(0, 12, 33);

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.clickOnText(java.util.regex.Pattern.quote("30:00"));
        solo.setTimePicker(0, 4, 30);
        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.clearEditText(4);
        solo.enterText(4, "10");

        assertTrue("'ImageView' is not shown!", solo.waitForView(solo.getView("speed_pace_icon")));

        solo.clickOnView(solo.getView("confirm"));




    }
}