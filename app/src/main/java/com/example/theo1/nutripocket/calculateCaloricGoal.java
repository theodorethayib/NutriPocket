//package com.example.theo1.nutripocket;
//
//import android.content.SharedPreferences;
//
//import static android.content.Context.MODE_PRIVATE;
//
///**
// * Created by theod on 10/21/2017.
// */
//
//public class calculateCaloricGoal {
//
//    int height;
//    int age;
//    int weight;
//    String gender;
//    String activityLevel;
//    String goal;
//
//    double RMR;
//
//    calculateCaloricGoal (String[] userInfo)
//    {
//        age = Integer.parseInt(userInfo[0]);
//        height = Integer.parseInt(userInfo[1]);
//        weight = Integer.parseInt(userInfo[2]);
//        gender = userInfo[3];
//        activityLevel = userInfo[4];
//        goal = userInfo[5];
//
//        final String firstLevel = "Sendentary";
//        final String secondLevel = "Light Activity";
//        final String thirdLevel = "Moderate Activity";
//        final String fourthLevel = "Heavy Activity";
//
//        int userActivity = 0;
//
//        switch (activityLevel) {
//            case firstLevel:
//                userActivity = 1.2;
//                break;
//            case secondLevel:
//                userActivity = 1.375;
//                break;
//            case thirdLevel:
//                userActivity = 1.55;
//                break;
//            case fourthLevel:
//                userActivity = 1.9;
//                break;
//        }
//
//        final String oneLevel = "Lose weight";
//        final String twoLevel = "Maintain weight";
//        final String threeLevel = "Gain weight";
//
//        int userGoal = 0;
//
//        switch (goal) {
//            case oneLevel:
//                userGoal = 1;
//                break;
//            case twoLevel:
//                userGoal = 2;
//                break;
//            case threeLevel;
//                userGoal = 3;
//                break;
//        }
//
//        final String aLevel = "Male";
//        final String bLevel = "Female";
//
//        int userGender = 0;
//
//        switch (gender) {
//            case aLevel:
//                userGender = 5;
//                break;
//            case bLevel:
//                userGender = -161;
//                break;
//        }
//
//        RMR = (9.99 * weight) + (6.25 * height) - (4.92 * age) + userGender;
//
//
//
//
//    }
//
//    public static int calculate() {
//
//        return 0;
//    }
//
//
//}
