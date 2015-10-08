package com.projects.sharvani.activitylevelsp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RetreiveSharedPreferences extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retreive_shared_preferences);
        textView = (TextView) findViewById(R.id.textView);

        //Accessing the 'Mydata' file to retrieve value stored in it
        SharedPreferences sharedPreferences = getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("USERNAME", "Username not found ");
        textView.setText("Username retreived from SharedPreferences : " + username);
    }

}
