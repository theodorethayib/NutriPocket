package com.example.theo1.nutripocket;

import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by theod on 10/21/2017.
 */

public class calculateCaloricGoal {

    int height;
    int age;
    int weight;
    Boolean gender;
    String activityLevel;
    String goal;

    calculateCaloricGoal (String[] userInfo)
    {
        age = Integer.parseInt(userInfo[0]);
        height = Integer.parseInt(userInfo[1]);
        weight = Integer.parseInt(userInfo[2]);
        gender = Boolean.parseBoolean(userInfo[3]);
        activityLevel = userInfo[4];
        goal = userInfo[5];

        final String firstLevel = "Sendentary";
        final String secondLevel = "Light Activity";
        final String thirdLevel = "Moderate Activity";
        final String fourthLevel = "Heavy Activity";

        int userActivity = 0;

        switch (activityLevel) {
            case firstLevel:
                userActivity = 1;
                break;
            case secondLevel:
                userActivity = 2;
                break;
            case thirdLevel:
                userActivity = 3;
                break;
            case fourthLevel:
                userActivity = 4;
                break;
        };

        final String oneLevel = "Lose weight";
        final String twoLevel = "Maintain weight";
        final String threeLevel = "Gain weight";


    }

    public static int calculate() {

        return 0;
    }


}
