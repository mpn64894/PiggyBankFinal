package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pageOne of three
        TextView pageOne = findViewById(R.id.gg);
        pageOne.setText("Be the hero to your finances! \n Save your Piggie Bank");
        Button onboard = findViewById(R.id.button2);
        onboard.setText("Next");
        onboard.performClick();
        onboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OnboardTwo.class));
            } // onClick
        });
        //pageTwo
    }
}