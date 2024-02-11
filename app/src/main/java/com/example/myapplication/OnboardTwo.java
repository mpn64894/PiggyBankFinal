package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class OnboardTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard_two);
        TextView pageTwo = findViewById(R.id.ob2);
        pageTwo.setText("Set a financial goal and track your expenses! \n ");

        Button nextPage = findViewById(R.id.button);
        nextPage.performClick();

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OnboardTwo.this, OnboardThree.class)
                );
            }
        });
    }
}