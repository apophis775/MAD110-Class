package com.example.dave.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.text.DecimalFormat;

import android.view.View;
import android.widget.*;




public class MainActivity extends AppCompatActivity {
    double tip;
    String tipSelect;
    double mealCost;
    double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText cost =(EditText)findViewById(R.id.txtCost);
        final Spinner group =(Spinner)findViewById(R.id.spnTip);
        Button charges =(Button)findViewById(R.id.btnCalculate);
                charges.setOnClickListener(new View.OnClickListener(){
                    final TextView result = ((TextView)findViewById(R.id.txtFinal));
                    @Override
                    public void onClick(View view) {
                        mealCost = Double.parseDouble(cost.getText().toString());
                        DecimalFormat currency = new DecimalFormat("###,###.##");
                        tipSelect = group.getSelectedItem().toString();
                        switch(tipSelect){
                            case "5%":
                                tip = .05;
                                break;
                            case "10%":
                                tip = .1;
                                break;
                            case "15%":
                                tip = .15;
                                break;
                            case "20%":
                                tip = .2;
                                break;
                            case "25%":
                                tip = .25;
                                break;
                            default:
                                tip = 0;
                                break;

                        }
                        totalCost = mealCost*tip;
                        result.setText("Suggested "+tipSelect+" on $"+currency.format(mealCost)+" is: $"+currency.format(totalCost));

                    }

                });

    }
}
