package com.projects.sharvani.activitylevelsp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SharedPreferencesExample extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_example);
        textView= (TextView) findViewById(R.id.textView);
        SharedPreferences preferences=getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("USERNAME", "User123");
        editor.commit();
        textView.setText("The text entered into SharedPreferences : User123");
    }
    public void next(View view) {

        startActivity(new Intent(getApplicationContext(),RetreiveSharedPreferences.class));
    }

}
