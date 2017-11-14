package com.example.dave.currencyconvert;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double conversionRate = 113.63;
    double amountEntered = 0.0;
    double total = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText currency = (EditText) findViewById(R.id.txtCurrency);
        final RadioButton dolToYen = (RadioButton) findViewById(R.id.radDollarsToYen);
        final RadioButton yenToDol = (RadioButton) findViewById(R.id.radYenToDollars);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button convert = (Button)findViewById(R.id.btnConvert);

        convert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                amountEntered = Double.parseDouble(currency.getText().toString());
                DecimalFormat currency = new DecimalFormat("###,###.##");
                if(dolToYen.isChecked()){
                    total = amountEntered*conversionRate;
                    result.setText("Yen: "+currency.format(total));
                    if (total > 1136030){
                        Toast.makeText(MainActivity.this, "Amount over $10,000",Toast.LENGTH_LONG).show();
                    }
                }
                if(yenToDol.isChecked()){
                    total = amountEntered/conversionRate;
                    result.setText("$"+currency.format(total));
                    if (total > 10000){
                        Toast.makeText(MainActivity.this, "Amount over $10,000",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
}
