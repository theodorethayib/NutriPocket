package com.example.theo1.nutripocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateProfileActivity extends AppCompatActivity {
    Button buttonContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        getSupportActionBar().hide();
        buttonContinue = (Button) findViewById(R.id.CP1Button);

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CreateProfileActivity.this, CreateProfile2Activity.class);
                startActivity(intent);

            }
        });
    }
}
