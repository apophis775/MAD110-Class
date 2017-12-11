package com.example.dave.ss13clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class Upgrades extends AppCompatActivity {
    TextView spaceBucks; //Currency
    Button btnBack;
    Button upgrade1;
    double bucks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bucks = getIntent().getExtras().getDouble("bucks");
        setContentView(R.layout.activity_upgrades);
        spaceBucks = (TextView)findViewById(R.id.txtWork);
        spaceBucks.setText(String.valueOf(bucks));
        btnBack = (Button)findViewById(R.id.btnBack);
        upgrade1 = (Button)findViewById(R.id.btnGreyUp);



        upgrade1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                bucks++;
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Intent returnIntent = new Intent();
                returnIntent.putExtra("bucks",bucks);
                setResult(MainActivity.RESULT_OK,returnIntent);
                finish();

                /*Intent mainScreen = new Intent(Upgrades.this, MainActivity.class);
                startActivity(mainScreen);*/
            }
        });







    }
}
