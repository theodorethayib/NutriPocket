package com.example.theo1.nutripocket;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;
import android.widget.Button;
import android.widget.Toast;

import static android.util.Log.d;

public class MainActivity extends AppCompatActivity {

    TextView prefTitle;
    TextView calorieGoal;
    ProgressBar calorieProgressBar;
    int calorieCount = 0;
    Button breakdownButton;
    TextView currentCalories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        prefTitle = (TextView) findViewById(R.id.prefRectTitle);
        calorieGoal = (TextView) findViewById(R.id.calorieGoal);
        calorieProgressBar = (ProgressBar) findViewById(R.id.calorieProgressBar);
        breakdownButton = (Button) findViewById(R.id.caloricBreakdownButton);
        currentCalories = (TextView) findViewById(R.id.currentCalories);
        currentCalories.setText("You are currently at " + calorieCount + " Calories!");
        calorieProgressBar.setProgress(calorieCount);





        breakdownButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calorieCount += 25;
                calorieProgressBar.setProgress(calorieCount);
                currentCalories.setText("You are currently at " + calorieCount + " Calories!");
            }
            });




        SharedPreferences sharedPrefs = getSharedPreferences("userInfo", MODE_PRIVATE);

        String age = sharedPrefs.getString("age", "");
        String height = sharedPrefs.getString("height", "");
        String weight = sharedPrefs.getString("weight", "");
        String gender = sharedPrefs.getString("gender", "");
        String activityLevel = sharedPrefs.getString("activityLevel", "");
        String goal = sharedPrefs.getString("goal", "");

        String bodyType = sharedPrefs.getString("bodyType", "");


        String fName = sharedPrefs.getString("firstName", "");
        String lName = sharedPrefs.getString("lastName", "");


        String[] userInfo = new String[] {age, height, weight, gender, activityLevel, goal};

        //prefTitle.setText(age);


        calculateCaloricGoal calGoal = new calculateCaloricGoal(userInfo);
        int goalAmount = calGoal.calculate();
        calorieGoal.setText("Daily Calorie Goal: " + String.valueOf(goalAmount));
        calorieProgressBar.setMax(goalAmount);

        String[] nutriuserInfo = new String[] {String.valueOf(goalAmount), bodyType};

        Toast.makeText(getApplicationContext(),"Welcome, " + fName + " " + lName + "!", Toast.LENGTH_SHORT).show();

    }
}
