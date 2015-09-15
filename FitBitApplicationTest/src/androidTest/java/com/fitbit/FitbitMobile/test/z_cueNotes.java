package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_cueNotes extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public z_cueNotes() throws ClassNotFoundException {
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
		solo.waitForActivity("LandingActivity_", 2000);
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 2649 milliseconds
		solo.sleep(2649);
        //Click on Track your exercise
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseListActivity'
		assertTrue("ExerciseListActivity is not found!", solo.waitForActivity("ExerciseListActivity"));
        //Sleep for 2139 milliseconds
		solo.sleep(2139);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("new_exercise"));
        //Wait for activity: 'com.fitbit.runtrack.ui.RecordExerciseActivity'
		assertTrue("RecordExerciseActivity is not found!", solo.waitForActivity("RecordExerciseActivity"));
        //Sleep for 1145 milliseconds
		solo.sleep(1145);
        //Click on Tracking
		solo.clickOnText(java.util.regex.Pattern.quote("Tracking"));
        //Enter the text: '8:32 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "8:32 PM");
        //Enter the text: 'Aug 16, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 16, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Sleep for 2982 milliseconds
		solo.sleep(2982);
        //Click on Cue types Distance, Time, Average Pace
		solo.clickOnView(solo.getView("cue_type_container"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1754 milliseconds
		solo.sleep(1754);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_preview"));
        //Sleep for 1750 milliseconds
		solo.sleep(1750);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_preview", 1));
        //Sleep for 3046 milliseconds
		solo.sleep(3046);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_preview", 2));
        //Sleep for 4342 milliseconds
		solo.sleep(4342);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_preview", 3));
        //Sleep for 3913 milliseconds
		solo.sleep(3913);
        //Click on ImageView
		solo.clickOnView(solo.getView("btn_preview", 4));
	}
}
