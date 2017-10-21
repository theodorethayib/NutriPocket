package com.example.theo1.nutripocket;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;


public class CreateProfile2Activity extends AppCompatActivity {

    Button CP2Info;
    Button buttonContinue;
    Spinner activityLevel;
    Spinner goal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile2);
        getSupportActionBar().hide();

        CP2Info = (Button) findViewById(R.id.CP2Info);
        activityLevel = (Spinner) findViewById(R.id.activityLevel);
        goal = (Spinner) findViewById(R.id.goal);

        CP2Info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CreateProfile2Activity.this, activityLevelDescriptionsActivity.class);
                startActivity(intent);

            }
        });

        buttonContinue = (Button) findViewById(R.id.CP2Continue);

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CreateProfile2Activity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
    public void saveUserInfo(View view) {
        SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("activityLevel", activityLevel.getSelectedItem().toString());
        editor.putString("goal", goal.getSelectedItem().toString());
        editor.apply();
    }
}

