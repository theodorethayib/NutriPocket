package com.example.theo1.nutripocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CreateProfile2Activity extends AppCompatActivity {

    Button CP2Info;
    Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile2);
        getSupportActionBar().hide();

        CP2Info = (Button) findViewById(R.id.CP2Info);

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
}
