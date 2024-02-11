package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Customization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customization);

        ImageView capeOutfit = findViewById(R.id.cape);
        ImageView crownOutfit = findViewById(R.id.crown);
        ImageView necklaceOutfit = findViewById(R.id.necklace);
        ImageView maskOutfit = findViewById(R.id.mask);
        ImageView piggie = findViewById(R.id.necklacePig);
        capeOutfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piggie.setImageResource(R.drawable.cape);
            }
        });
        crownOutfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piggie.setImageResource(R.drawable.crown);
            }
        });
        maskOutfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piggie.setImageResource(R.drawable.mask);
            }
        });
        necklaceOutfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piggie.setImageResource(R.drawable.necklace);
            }
        });

        Button cToGraph = findViewById(R.id.c1);
        Button cToHome = findViewById(R.id.c2);
        Button cToCustomization = findViewById(R.id.c3);
        cToGraph.performClick();
        cToHome.performClick();
        cToCustomization.performClick();

        cToGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Customization.this, January.class));
            }
        });
        cToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Customization.this, HomePage.class));
            }
        });

    }
}
