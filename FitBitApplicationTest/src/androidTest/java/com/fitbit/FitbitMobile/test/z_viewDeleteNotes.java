package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_viewDeleteNotes extends ActivityInstrumentationTestCase2 {
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
    public z_viewDeleteNotes() throws ClassNotFoundException {
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
        //Sleep for 2329 milliseconds
		solo.sleep(2329);
        //Click on Track your exercise 1:30:00 min Cleaning  300 calories burned
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseListActivity'
		assertTrue("ExerciseListActivity is not found!", solo.waitForActivity("ExerciseListActivity"));
        //Sleep for 3562 milliseconds
		solo.sleep(3562);
        //Scroll to Jun 8 Bike 10.00 miles 4:30:00
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 0);
        //Click on Jun 8 Bike 10.00 miles 4:30:00
		solo.clickOnView(solo.getView("container", 4));
        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseDetailsActivity'
		assertTrue("ExerciseDetailsActivity is not found!", solo.waitForActivity("ExerciseDetailsActivity"));
        //Sleep for 2986 milliseconds
		solo.sleep(2986);
        //Scroll View to the right side
		solo.scrollViewToSide(solo.getView("pager"), Solo.RIGHT);
        //Sleep for 13155 milliseconds
		solo.sleep(13155);
        //Click on Calories
		solo.clickOnText(java.util.regex.Pattern.quote("Calories"));
        //Sleep for 1167 milliseconds
		solo.sleep(1167);
        //Assert that: 'calories' is shown
		assertTrue("'calories' is not shown!", solo.waitForText(java.util.regex.Pattern.quote("calories"), 1, 20000, true, true));
        //Sleep for 650 milliseconds
		solo.sleep(650);
        //Assert that: 'calories' is shown
		assertTrue("'calories' is not shown!", solo.waitForText(java.util.regex.Pattern.quote("calories"), 1, 20000, true, true));
        //Sleep for 2256 milliseconds
		solo.sleep(2256);
        //Assert that: 'cals/min' is shown
		assertTrue("'cals/min' is not shown!", solo.waitForText(java.util.regex.Pattern.quote("cals/min"), 1, 20000, true, true));
        //Sleep for 7013 milliseconds
		solo.sleep(7013);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("btn_discard"));
        //Sleep for 7204 milliseconds
		solo.sleep(7204);
        //Click on Delete
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep for 6012 milliseconds
		solo.sleep(6012);
        //Click on Today Cleaning 1:30:00 300 calories
		solo.clickOnView(solo.getView("container", 2));
        //Wait for activity: 'com.fitbit.runtrack.ui.ExerciseDetailsActivity'
		assertTrue("ExerciseDetailsActivity is not found!", solo.waitForActivity("ExerciseDetailsActivity"));
	}
}
