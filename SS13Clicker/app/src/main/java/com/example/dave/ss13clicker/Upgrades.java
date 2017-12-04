package com.example.dave.ss13clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;

public class Upgrades extends AppCompatActivity {
    TextView spaceBucks; //Currency





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        double bucks = getIntent().getExtras().getDouble("bucks");
        setContentView(R.layout.activity_upgrades);
        spaceBucks = (TextView)findViewById(R.id.txtWork);
        spaceBucks.setText(String.valueOf(bucks));
    }
}
