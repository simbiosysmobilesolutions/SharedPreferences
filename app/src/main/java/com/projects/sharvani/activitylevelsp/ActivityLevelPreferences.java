package com.projects.sharvani.activitylevelsp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLevelPreferences extends AppCompatActivity {
TextView displayTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTextView= (TextView) findViewById(R.id.textView);
        //getting SharedPreferences  private to Activity
        SharedPreferences userName = getPreferences(MODE_PRIVATE);
        //SharedPreferences.Editor is the Interface used for modifying values in a SharedPreferences object
        //edit() creates a new Editor for modifying Preferences
        SharedPreferences.Editor prefEditor = userName.edit();
        prefEditor.putString("USERNAME", "Guest123");
        prefEditor.commit();

        //Fetching data from ActivityLevel Preferences
        SharedPreferences getUserNamePref = getPreferences(MODE_PRIVATE);
        String u_name = getUserNamePref.getString("USERNAME", "Username");
        Toast.makeText(ActivityLevelPreferences.this, "User Name is: "+u_name, Toast.LENGTH_SHORT).show();
        displayTextView.setText("UserName value in the Activity-Level Preferences is : "+u_name);
    }
    public void next(View view) {

        startActivity(new Intent(getApplicationContext(),SharedPreferencesExample.class));
    }
}
