package com.yctech.androidceshitest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("bitch", "LoginActivity");
        Toast.makeText(this, "sdadsads", Toast.LENGTH_LONG).show();
        findViewById(R.id.go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,Main2Activity.class));
                LoginActivity.this.finish();
            }
        });
    }
}
