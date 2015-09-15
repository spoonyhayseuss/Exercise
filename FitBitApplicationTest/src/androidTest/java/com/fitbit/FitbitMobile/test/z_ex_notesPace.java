package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_ex_notesPace extends ActivityInstrumentationTestCase2 {
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
    public z_ex_notesPace() throws ClassNotFoundException {
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
        //Sleep for 2277 milliseconds
		solo.sleep(2277);
        //Click on Track your exercise
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseListActivity'
		assertTrue("ExerciseListActivity is not found!", solo.waitForActivity("ExerciseListActivity"));
        //Sleep for 1606 milliseconds
		solo.sleep(1606);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("new_exercise"));
        //Wait for activity: 'com.fitbit.runtrack.ui.RecordExerciseActivity'
		assertTrue("RecordExerciseActivity is not found!", solo.waitForActivity("RecordExerciseActivity"));
        //Sleep for 1522 milliseconds
		solo.sleep(1522);
        //Click on Run
		solo.clickOnView(solo.getView(android.R.id.text1));
        //Enter the text: 'Run'
		solo.clearEditText((android.widget.EditText) solo.getView("exercise_type"));
		solo.enterText((android.widget.EditText) solo.getView("exercise_type"), "Run");
        //Enter the text: '11:01 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "11:01 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '11:01 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "11:01 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '0'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "0");
        //Enter the text: '11:01 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "11:01 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 1343 milliseconds
		solo.sleep(1343);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("distance_value"));
        //Enter the text: '11:01 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "11:01 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '328'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "328");
        //Sleep for 1171 milliseconds
		solo.sleep(1171);
        //Enter the text: '3'
		solo.clearEditText((android.widget.EditText) solo.getView("distance_value"));
		solo.enterText((android.widget.EditText) solo.getView("distance_value"), "3");
        //Enter the text: '11:01 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "11:01 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '346'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "346");
        //Sleep for 16047 milliseconds
		solo.sleep(16047);
        //Click on Reset
		solo.clickOnView(solo.getView("reset_calories"));
        //Enter the text: '346'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "346");
        //Enter the text: '11:01 PM'
		solo.clearEditText((android.widget.EditText) solo.getView("start_time"));
		solo.enterText((android.widget.EditText) solo.getView("start_time"), "11:01 PM");
        //Enter the text: 'Aug 15, 2015'
		solo.clearEditText((android.widget.EditText) solo.getView("start_date"));
		solo.enterText((android.widget.EditText) solo.getView("start_date"), "Aug 15, 2015");
        //Enter the text: '30:00'
		solo.clearEditText((android.widget.EditText) solo.getView("duration"));
		solo.enterText((android.widget.EditText) solo.getView("duration"), "30:00");
        //Enter the text: '346'
		solo.clearEditText((android.widget.EditText) solo.getView("calories_burned_value"));
		solo.enterText((android.widget.EditText) solo.getView("calories_burned_value"), "346");
        //Sleep for 29220 milliseconds
		solo.sleep(29220);
        //Click on distance_value
		solo.clickOnView(solo.getView("distance_value"));
        //Sleep for 7171 milliseconds
		solo.sleep(7171);
        //Assert that: 'ImageView' is shown
		assertTrue("'ImageView' is not shown!", solo.waitForView(solo.getView("speed_pace_icon")));
        //Assert that: 'ImageView' is shown
		assertTrue("'ImageView' is not shown!", solo.waitForView(solo.getView("speed_pace_icon")));
        //Assert that: 'ImageView' is shown
		assertTrue("'ImageView' is not shown!", solo.waitForView(solo.getView("speed_pace_icon")));
        //Assert that: 'ImageView' is shown
		assertTrue("'ImageView' is not shown!", solo.waitForView(solo.getView("speed_pace_icon")));
        //Assert that: 'ImageView' is shown
		assertTrue("'ImageView' is not shown!", solo.waitForView(solo.getView("speed_pace_icon")));
	}
}
