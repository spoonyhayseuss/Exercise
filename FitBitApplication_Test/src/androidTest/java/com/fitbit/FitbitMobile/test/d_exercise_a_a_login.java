package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class d_exercise_a_a_login extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public d_exercise_a_a_login() throws ClassNotFoundException {
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
        //Sleep
		solo.sleep(500);
        //Click on Log in
		solo.clickOnView(solo.getView("btn_log_in"));
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep
		solo.sleep(500);
        //Enter the text: 'awitherspoon@fitbit.com'
		solo.clearEditText((android.widget.EditText) solo.getView("login_email"));
		solo.enterText((android.widget.EditText) solo.getView("login_email"), "noraa5@fbqa.com");
        //Sleep
		solo.sleep(500);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("login_password"));
        //Sleep
		solo.sleep(500);
        //Enter
		solo.clearEditText((android.widget.EditText) solo.getView("login_password"));
		solo.enterText((android.widget.EditText) solo.getView("login_password"), "noraa");
        //Sleep
		solo.sleep(500);
        //Click on Log in
		solo.clickOnView(solo.getView("login_button"));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
	}
}
