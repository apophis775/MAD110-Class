package com.example.dave.ss13clicker;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class Upgrades extends AppCompatActivity {
    TextView spaceBucks; //Currency
    Button btnBack;
    Button upgrade1;
    Button upgrade2;
    Button upgrade3;
    Button upgrade4;
    Button upgrade5;

    double bucks;
    CountDownTimer timer;
    final double base = 1;
    double rankMod = 0;
    double bonus = 0;
    double upgrade = 0;
    int assistants = 0;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bucks = getIntent().getExtras().getDouble("bucks");
        rankMod = getIntent().getExtras().getDouble("rankmod");
        bonus = getIntent().getExtras().getDouble("bonus");
        upgrade = getIntent().getExtras().getDouble("upgrade");
        assistants = getIntent().getExtras().getInt("assistants");
        setContentView(R.layout.activity_upgrades);
        spaceBucks = (TextView)findViewById(R.id.txtWork);
        spaceBucks.setText(String.format("%.2f", bucks));
        btnBack = (Button)findViewById(R.id.btnBack);
        upgrade1 = (Button)findViewById(R.id.btnUpgrade1);
        upgrade2 = (Button)findViewById(R.id.btnUpgrade2);
        upgrade3 = (Button)findViewById(R.id.btnUpgrade3);
        upgrade4 = (Button)findViewById(R.id.btnUpgrade4);
        upgrade5 = (Button)findViewById(R.id.btnUpgrade5);



        timer = new CountDownTimer(60000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                bucks+= ((base+(1*(rankMod+bonus+upgrade)))*.05)*assistants;
                spaceBucks.setText(String.format("%.2f", bucks));




            }

            @Override
            public void onFinish() {
                timer.start();
            }
        };
        timer.start();







        upgrade1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bucks>=500) {
                    upgrade += 0.2;
                    bucks -= 500;
                }
                else{
                    //TORCH ERROR MESSAGE WILL GO HERE

                }
            }
        });

        upgrade2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bucks>=900) {
                    upgrade += 0.2;
                    bucks -= 900;
                }
                else{
                    //TORCH ERROR MESSAGE WILL GO HERE

                }
            }
        });

        upgrade3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bucks>=1300) {
                    upgrade += 0.2;
                    bucks -= 1300;
                }
                else{
                    //TORCH ERROR MESSAGE WILL GO HERE

                }
            }
        });

        upgrade4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bucks>=1750) {
                    upgrade += 0.2;
                    bucks -= 1750;
                }
                else{
                    //TORCH ERROR MESSAGE WILL GO HERE

                }
            }
        });

        upgrade5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bucks>=2200) {
                    upgrade += 1.0;
                    bucks -= 2200;
                }
                else{
                    //TORCH ERROR MESSAGE WILL GO HERE

                }
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
