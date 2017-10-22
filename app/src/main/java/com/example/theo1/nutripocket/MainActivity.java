package com.example.theo1.nutripocket;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.util.Log.d;

public class MainActivity extends AppCompatActivity {

    TextView prefTitle;
    TextView calorieGoal;
    ProgressBar calorieProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        prefTitle = (TextView) findViewById(R.id.prefRectTitle);
        calorieGoal = (TextView) findViewById(R.id.calorieGoal);
        calorieProgressBar = (ProgressBar) findViewById(R.id.calorieProgressBar);


        SharedPreferences sharedPrefs = getSharedPreferences("userInfo", MODE_PRIVATE);

        String age = sharedPrefs.getString("age", "");
        String height = sharedPrefs.getString("height", "");
        String weight = sharedPrefs.getString("weight", "");
        String gender = sharedPrefs.getString("gender", "");
        String activityLevel = sharedPrefs.getString("activityLevel", "");
        String goal = sharedPrefs.getString("goal", "");


        String[] userInfo = new String[] {age, height, weight, gender, activityLevel, goal};

        //prefTitle.setText(age);


        calculateCaloricGoal calGoal = new calculateCaloricGoal(userInfo);
        int goalAmount = calGoal.calculate();
        calorieGoal.setText("Daily Calorie Goal: " + String.valueOf(goalAmount));
   }
}
