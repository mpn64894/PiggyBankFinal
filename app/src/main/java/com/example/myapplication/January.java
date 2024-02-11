package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class January extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_january);

        Button nextMonth = findViewById(R.id.newMonth);
        Button backHome = findViewById(R.id.b2);
        ImageView graph = findViewById(R.id.imageView8);
        TextView month = findViewById(R.id.textView6);
        TextView motivation = findViewById(R.id.textView4);
        TextView literacy = findViewById(R.id.textView5);
        nextMonth.performClick();
        backHome.performClick();

        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(January.this, HomePage.class));
            }
        });

        Button customization = findViewById(R.id.b3);
        customization.performClick();
        customization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(January.this, Customization.class));
            }
        });
        nextMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) nextMonth.getText()).equals("Next")) {
                    nextMonth.setText("Back");
                    graph.setImageResource(R.drawable.february);
                    month.setText("February 2024");
                    motivation.setText("You're on a roll this month!");
                    literacy.setText("29% of Americans admit they max out their credit card limit each month! \n " +
                            "\nStay ahead of the game by spending at least under 30% of your limit.");
                } else {
                    nextMonth.setText("Next");
                    graph.setImageResource(R.drawable.january);
                    month.setText("January 2024");
                    motivation.setText("Let's get back into it!");
                    literacy.setText("Did you know? \nOver 42% of college students have a credit card debt. \n" +
                            "\nBe mindful of your spending and use of credit cards for neccessities! ");
                } // if

            } // onClick

        });
    } // onCreate
}