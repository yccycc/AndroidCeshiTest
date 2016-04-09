package com.yctech.androidceshitest;

import android.os.Handler;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;


public class Test2 extends ActivityInstrumentationTestCase2<LoginActivity> {

    public Test2(Class<LoginActivity> activityClass) {
        super(activityClass);
    }

    public Test2(String pkg, Class<LoginActivity> activityClass) {
        super(pkg, activityClass);
    }
    public Test2() {
        super(LoginActivity.class);
    }

    public void testActivityTestCaseSetUpProperly() {
        Log.i("bitch", Thread.currentThread().toString());
        Handler handler = new Handler(getActivity().getMainLooper()) ;
        handler.post(new Runnable() {
            @Override
            public void run() {
                getActivity().findViewById(R.id.go).performClick();
            }
        });
        assertNotNull("activity should be launched successfully",
                getActivity());
    }
}
