package com.puri.appshortcutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent i = getIntent();
        String message = i.getDataString();

        Toast.makeText(getApplicationContext(),"Shortcut from :"+message,Toast.LENGTH_LONG).show();
    }
}
