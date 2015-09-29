package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class d_exercise_h_f_logViewRunDelete extends ActivityInstrumentationTestCase2 {
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
    public d_exercise_h_f_logViewRunDelete() throws ClassNotFoundException {
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


        solo.clickOnText(java.util.regex.Pattern.quote("Run"));

        assertTrue("ExerciseDetailsActivity is not found!", solo.waitForActivity("ExerciseDetailsActivity"));

        //Assert that: 'calories' is shown
        assertTrue("'calories' is not shown!", solo.waitForText(java.util.regex.Pattern.quote("calories"), 1, 20000, true, true));

        //Assert that: 'cals/min' is shown
        assertTrue("'cals/min' is not shown!", solo.waitForText(java.util.regex.Pattern.quote("cals/min"), 1, 20000, true, true));


        solo.scrollViewToSide(solo.getView("pager"), Solo.RIGHT);


        solo.clickOnText(java.util.regex.Pattern.quote("calories burned"));
        solo.clickOnText(java.util.regex.Pattern.quote("active minutes"));

        solo.clickOnView(solo.getView("btn_discard"));

        solo.clickOnView(solo.getView(android.R.id.button1));
    }
}