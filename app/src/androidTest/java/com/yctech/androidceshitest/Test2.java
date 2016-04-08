package com.yctech.androidceshitest;

import android.test.ActivityInstrumentationTestCase2;

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
        assertNotNull("activity should be launched successfully",
                getActivity());
    }
}
