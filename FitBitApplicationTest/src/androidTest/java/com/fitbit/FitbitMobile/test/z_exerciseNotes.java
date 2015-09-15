package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_exerciseNotes extends ActivityInstrumentationTestCase2 {
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
    public z_exerciseNotes() throws ClassNotFoundException {
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
        //Sleep for 12680 milliseconds
		solo.sleep(12680);
        //Click on Track your exercise
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseListActivity'
		assertTrue("ExerciseListActivity is not found!", solo.waitForActivity("ExerciseListActivity"));
        //Sleep for 3622 milliseconds
		solo.sleep(3622);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("new_exercise"));
        //Wait for activity: 'com.fitbit.runtrack.ui.RecordExerciseActivity'
		assertTrue("RecordExerciseActivity is not found!", solo.waitForActivity("RecordExerciseActivity"));
        //Sleep for 2405 milliseconds
		solo.sleep(2405);
        //Click on Run
		solo.clickOnView(solo.getView(android.R.id.text1));
        //Enter the text: 'Run'
		solo.clearEditText((android.widget.EditText) solo.getView("exercise_type"));
		solo.enterText((android.widget.EditText) solo.getView("exercise_type"), "Run");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '0'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "0");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 1425 milliseconds
		solo.sleep(1425);
        //Click on Aug 15, 2015
		solo.clickOnView(solo.getView("start_date"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 15897 milliseconds
		solo.sleep(15897);
        //Click on Done
		solo.clickOnView(solo.getView("button"));
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 934 milliseconds
		solo.sleep(934);
        //Click on 10:08 PM
		solo.clickOnView(solo.getView("start_time"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1773 milliseconds
		solo.sleep(1773);
        //Click on Cancel
		solo.clickOnView(solo.getView(android.R.id.button2));
        //Sleep for 1061 milliseconds
		solo.sleep(1061);
        //Click on Aug 15, 2015
		solo.clickOnView(solo.getView("start_date"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 6658 milliseconds
		solo.sleep(6658);
        //Click on Done
		solo.clickOnView(solo.getView("button"));
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 1900 milliseconds
		solo.sleep(1900);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("distance_value"));
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 7770 milliseconds
		solo.sleep(7770);
        //Click on 328
		solo.clickOnView(solo.getView("calories_burned_value"));
        //Sleep for 4212 milliseconds
		solo.sleep(4212);
        //Click on Reset
		solo.clickOnView(solo.getView("reset_calories"));
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 1939 milliseconds
		solo.sleep(1939);
        //Click on Run
		solo.clickOnView(solo.getView("exercise_type"));
        //Sleep for 1565 milliseconds
		solo.sleep(1565);
        //Enter the text: 'y'
		solo.clearEditText((android.widget.EditText) solo.getView("exercise_type"));
		solo.enterText((android.widget.EditText) solo.getView("exercise_type"), "y");
        //Sleep for 1219 milliseconds
		solo.sleep(1219);
        //Click on Yoga
		solo.clickOnView(solo.getView(android.R.id.text1));
        //Enter the text: 'Yoga'
		solo.clearEditText((android.widget.EditText) solo.getView("exercise_type"));
		solo.enterText((android.widget.EditText) solo.getView("exercise_type"), "Yoga");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '92'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "92");
        //Sleep for 8324 milliseconds
		solo.sleep(8324);
        //Click on Precise
		solo.clickOnView(solo.getView("manual_estimate_calorie"));
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '92'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "92");
        //Sleep for 4771 milliseconds
		solo.sleep(4771);
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '98'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "98");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '122'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "122");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '133'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "133");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '135'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "135");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '136'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "136");
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("range"), 89);
        //Sleep for 1977 milliseconds
		solo.sleep(1977);
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '45'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "45");
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("range"), 9);
        //Sleep for 1469 milliseconds
		solo.sleep(1469);
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '135'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "135");
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("range"), 88);
        //Sleep for 816 milliseconds
		solo.sleep(816);
        //Click on Reset
		solo.clickOnView(solo.getView("reset_calories"));
        //Enter the text: '92'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "92");
        //Enter the text: '10:08 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "10:08 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '92'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "92");
        //Sleep for 5036 milliseconds
		solo.sleep(5036);
        //Assert that: 'High Intensity' is shown
		assertTrue("'High Intensity' is not shown!", solo.waitForView(solo.getView("high")));
	}
}
