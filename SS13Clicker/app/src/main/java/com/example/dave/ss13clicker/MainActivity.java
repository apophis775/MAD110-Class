package com.example.dave.ss13clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;





public class MainActivity extends AppCompatActivity {

    Button btnGreyTide; //Grey Tide, Station Wide.
    TextView spaceBucks; //Currency TextView
    double bucks = 0; //Currency
    double greyTiders = 1; //This is added if you have additional grey-tide upgrades purchased.
    double prestige = 1; //This bonus increase each time you "prestige" to a new station.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGreyTide = (Button)findViewById(R.id.btnGreyTide);
        spaceBucks = (TextView)findViewById(R.id.txtCurrency);

        btnGreyTide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucks+= (greyTiders*prestige);
                spaceBucks.setText(String.valueOf(bucks));
            }
        });

    }
}
