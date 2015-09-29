package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class d_exercise_e_b_durationExceedDefault extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;

    static {
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public d_exercise_e_b_durationExceedDefault() throws ClassNotFoundException {
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


        solo.enterText(0, "yoga");
        solo.clickOnText(java.util.regex.Pattern.quote("Yoga"));

        solo.clickOnText(java.util.regex.Pattern.quote("30:00"));
        solo.setTimePicker(0, 23, 59);
        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.clickOnView(solo.getView("confirm"));
        solo.clickOnView(solo.getView(android.R.id.button1));

    }
}