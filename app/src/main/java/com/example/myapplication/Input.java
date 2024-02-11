package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        TextView amt = (TextView) findViewById(R.id.money);

        Button addOne = findViewById(R.id.one);
        addOne.performClick();
        String total = "";
        addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String total = (String) amt.getText();
                if (total.equals("0")) amt.setText("1");
                else {
                    total = total + "1";
                    amt.setText(total);
                }
            } // onClick
        });

        Button sub = findViewById(R.id.subtract);
        sub.performClick();
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String total = (String) amt.getText();
                if (!total.equals("0")) {
                    if (total.length() == 1) {
                        amt.setText("0");
                    } else {
                        total = total.substring(0, total.length() - 1);
                        amt.setText(total);
                    } // if
                } // if
            } // onClick
        });

        Button backHome = findViewById(R.id.button8);
        backHome.performClick();
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Input.this, HomePage.class));
            }
        });

        Button toCustomize = findViewById(R.id.button9);
        toCustomize.performClick();
        toCustomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Input.this, Customization.class));
            }
        });

        Button graph = findViewById(R.id.button10);
        graph.performClick();
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Input.this, January.class));
            }
        });
    }

}