package com.example.dave.ss13clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;





public class MainActivity extends AppCompatActivity {

    Button btnWork; //Grey Tide, Station Wide.
    TextView spaceBucks; //Currency TextView
    double bucks = 0; //Currency
    double prestige = 1; //This bonus increase each time you "prestige" to a new station.
    String rank = "Assistant"; //Tracks your current rank within a department
    String dept = "Intern"; //tracks your current department
    final double base = 1; //This is the "base".  It will NEVER change.
    double rankMod = 0; //Each time you "rank" up, you receive a bonus.
    double deptMod = 0; //When you move to a new department, you receive a bonus to work, but your Rank resets.
    double bonus = 0; //This is a prestige bonus;  When you transfer to a new station, you start as an Assistant again, but you keep 10% of the bonus from your Rank and Department at time of transfer.  It also compounds.
    double upgrade = 0; //This is the Upgrade bonus, tracked by the tools you have.  These bonuses stay with you until you transfer to another station, then they are lost.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWork = (Button)findViewById(R.id.btnGreyTide);
        spaceBucks = (TextView)findViewById(R.id.txtCurrency);


        btnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucks+= base+(1*(rankMod+deptMod+bonus+upgrade)); //Always adds at least 1 "work" to the total, but allows bonuses to add more.
                spaceBucks.setText(String.valueOf(bucks));
            }
        });

    }
}
