package com.yctech.androidceshitest;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;

public class Test1
        extends ActivityUnitTestCase<LoginActivity> {


    private Intent mStartIntent;
    private Button mButton;

    public Test1() {
        super(LoginActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mStartIntent = new Intent(Intent.ACTION_MAIN);
    }

    @MediumTest
    public void testActivity()
    {
        startActivity(mStartIntent, null, null);
        assertNotNull(getActivity());
    }

    @MediumTest
    public void testPreconditions() {
        startActivity(mStartIntent, null, null);
        mButton = (Button) getActivity().findViewById(R.id.go);

        assertNotNull(getActivity());
        assertNotNull(mButton);
    }

    @MediumTest
    public void testSubLaunch() {
        LoginActivity activity
                = startActivity(mStartIntent, null, null);
        mButton = (Button) activity.findViewById(R.id.go);

        mButton.performClick();

        assertNotNull(getStartedActivityIntent());
        assertTrue(isFinishCalled());
    }

    @MediumTest
    public void testLifeCycleCreate() {
        LoginActivity activity
                = startActivity(mStartIntent, null, null);
        getInstrumentation().callActivityOnStart(activity);
        getInstrumentation().callActivityOnResume(activity);

        getInstrumentation().callActivityOnPause(activity);

        getInstrumentation().callActivityOnStop(activity);
    }

}