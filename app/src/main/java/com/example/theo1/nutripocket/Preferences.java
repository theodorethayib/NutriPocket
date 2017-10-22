package com.example.theo1.nutripocket;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Preferences extends AppCompatActivity {

    Button cancelButton;
    Button saveButton;

    EditText fNameP;
    EditText lNameP;
    EditText ageP;
    EditText heightP;
    EditText weightP;
    Spinner genderSpinP;
    Spinner activityLevelP;
    Spinner bodyTypeP;
    Spinner goalP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        getSupportActionBar().hide();

        cancelButton = (Button) findViewById(R.id.cancelButton);
        saveButton = (Button) findViewById(R.id.saveButton);


        fNameP = (EditText) findViewById(R.id.nameFirstP);
        lNameP = (EditText) findViewById(R.id.nameLastP);
        ageP = (EditText) findViewById(R.id.ageP);
        heightP = (EditText) findViewById(R.id.heightP);
        weightP = (EditText) findViewById(R.id.weightP);
        genderSpinP = (Spinner) findViewById(R.id.genderP);
        activityLevelP = (Spinner) findViewById(R.id.activityLevelP);
        bodyTypeP = (Spinner) findViewById(R.id.bodyTypeP);
        goalP = (Spinner) findViewById(R.id.goalP);


        cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });




        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                saveUserInfo();
                finish();

            }
        });

        genderSpinP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
                return;
            }
        });

        activityLevelP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
                return;
            }
        });

        bodyTypeP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
                return;
            }
        });

        goalP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.WHITE);
                return;
            }
        });
    }




    public void saveUserInfo() {
        SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("firstName", fNameP.getText().toString());
        editor.putString("lastName", lNameP.getText().toString());
        editor.putString("age", ageP.getText().toString());
        editor.putString("height", heightP.getText().toString());
        editor.putString("weight", weightP.getText().toString());
        editor.putString("gender", genderSpinP.getSelectedItem().toString());
        editor.putString("activityLevel", activityLevelP.getSelectedItem().toString());
        editor.putString("bodyType", bodyTypeP.getSelectedItem().toString());
        editor.putString("goal", goalP.getSelectedItem().toString());
        editor.apply();
    }
}
