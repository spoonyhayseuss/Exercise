package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class z_exerciseNotesAssert extends ActivityInstrumentationTestCase2 {
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
    public z_exerciseNotesAssert() throws ClassNotFoundException {
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
        //Sleep for 2217 milliseconds
		solo.sleep(2217);
        //Click on Track your exercise
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseListActivity'
		assertTrue("ExerciseListActivity is not found!", solo.waitForActivity("ExerciseListActivity"));
        //Sleep for 1755 milliseconds
		solo.sleep(1755);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("new_exercise"));
        //Wait for activity: 'com.fitbit.runtrack.ui.RecordExerciseActivity'
		assertTrue("RecordExerciseActivity is not found!", solo.waitForActivity("RecordExerciseActivity"));
        //Sleep for 1360 milliseconds
		solo.sleep(1360);
        //Click on Run
		solo.clickOnView(solo.getView(android.R.id.text1));
        //Enter the text: 'Run'
		solo.clearEditText((android.widget.EditText) solo.getView("exercise_type"));
		solo.enterText((android.widget.EditText) solo.getView("exercise_type"), "Run");
        //Enter the text: '10:24 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:24 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '10:24 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:24 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '0'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "0");
        //Enter the text: '10:24 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:24 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 1370 milliseconds
		solo.sleep(1370);
        //Click on Aug 15, 2015
		solo.clickOnView(solo.getView("start_date"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1662 milliseconds
		solo.sleep(1662);
        //Click on SimpleMonthView
		//solo.clickOnView(solo.getView(android.widget.SimpleMonthView.class, 0));
        //Sleep for 515 milliseconds
		solo.sleep(515);
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep for 957 milliseconds
		solo.sleep(957);
        //Assert that: 'The time and duration specified is in the future' is shown
		assertTrue("'The time and duration specified is in the future' is not shown!", solo.waitForView(solo.getView(android.R.id.message)));
        //Sleep for 517 milliseconds
		solo.sleep(517);
        //Assert that: 'The time and duration specified is in the future' is shown
		assertTrue("'The time and duration specified is in the future' is not shown!", solo.waitForView(solo.getView(android.R.id.message)));
        //Assert that: 'The time and duration specified is in the future' is shown
		assertTrue("'The time and duration specified is in the future' is not shown!", solo.waitForView(solo.getView(android.R.id.message)));
	}
}
