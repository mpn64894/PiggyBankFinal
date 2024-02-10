package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PageOne out of three
        TextView pageOne = findViewById(R.id.gg);
        pageOne.setText("Be the hero to your own finances! \n Save your Piggie Bank.");
    }
}