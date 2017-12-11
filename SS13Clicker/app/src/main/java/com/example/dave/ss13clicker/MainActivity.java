package com.example.dave.ss13clicker;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;





public class MainActivity extends AppCompatActivity {

    Button btnWork; //Grey Tide, Station Wide.
    Button btnUpgrade;//Upgrade Menu
    Button btnHireAssist;//Hire assistants
    TextView spaceBucks; //Currency
    TextView rank; //Rank
    TextView assist;//Assistants
    double bucks = 0; //Currency
    String rankS = "Assistant"; //Tracks your current rank within a department
    final double base = 1; //This is the "base".  It will NEVER change.
    double rankMod = 0; //Each time you "rank" up, you receive a bonus.
    double bonus = 0; //This is a prestige bonus;  When you transfer to a new station, you start as an Assistant again, but you keep 10% of the bonus from your Rank and Department at time of transfer.  It also compounds.
    double upgrade = 0; //This is the Upgrade bonus, tracked by the tools you have.  These bonuses stay with you until you transfer to another station, then they are lost.
    double perSecondBonus = 0;
    int assistants = 0;
    CountDownTimer timer;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 1) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                bucks = data.getExtras().getDouble("bucks");
                spaceBucks.setText(String.valueOf(bucks));
                upgrade = data.getExtras().getDouble("upgrade");
            }
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Variables... Variables everywhere...
        btnWork = (Button)findViewById(R.id.btnGreyTide);
        btnUpgrade = (Button)findViewById(R.id.btnUpgrade);
        btnHireAssist = (Button)findViewById(R.id.btnHireAssist);
        spaceBucks = (TextView)findViewById(R.id.txtCurrency);
        rank = (TextView)findViewById(R.id.txtRank);
        assist = (TextView)findViewById(R.id.txtAssist);
        assist.setText(String.valueOf(assistants));


        //TIMER FOR TIMED PRODUCTION UPDATES
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






        //Initial Sets
        spaceBucks.setText(String.valueOf(bucks));
        rank.setText(rankS);


        btnHireAssist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bucks>=10) {
                    bucks -= 10; //Super Cheap, cause fairly inefficient.
                    spaceBucks.setText(String.format("%.2f", bucks));
                    assistants++;
                    assist.setText(String.valueOf(assistants));
                }
                else{
                    //TORCH ERROR MESSAGE WILL GO HERE

                }

            }
        });

        btnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucks+= base+(1*(rankMod+bonus+upgrade)); //Always adds at least 1 "work" to the total, but allows bonuses to add more.
                spaceBucks.setText(String.format("%.2f", bucks));
            }
        });



        btnUpgrade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this, Upgrades.class);
                nextScreen.putExtra("bucks", bucks);
                nextScreen.putExtra("rankMod", rankMod);
                nextScreen.putExtra("bonus", bonus);
                nextScreen.putExtra("upgrade", upgrade);
                nextScreen.putExtra("assistants", assistants);



                startActivityForResult(nextScreen,1);
            }
        });




    }
}
