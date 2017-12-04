package com.example.dave.classselectionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class MainClassList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_class_list);
        final Switch swDegreeCert = (Switch) findViewById(R.id.swDegreeCert);
        final Spinner spnDegree = (Spinner) findViewById(R.id.spnDegree);
        final Spinner spnCert = (Spinner) findViewById(R.id.spnCert);
        final TextView txtCertificate = (TextView) findViewById(R.id.txtCert);
        final TextView txtDegree = (TextView) findViewById(R.id.txtMajor);
        final Button btnNext = (Button) findViewById(R.id.btnNext);

        final EditText firstName = (EditText) findViewById(R.id.txtFirstName);
        final EditText lastName = (EditText) findViewById(R.id.txtLastName);
        final EditText phone = (EditText) findViewById(R.id.txtLastName);

        final Spinner spnMonth = (Spinner) findViewById(R.id.spnMonth);
        final EditText txtDay = (EditText) findViewById(R.id.txtDay);
        final EditText txtYear = (EditText) findViewById(R.id.txtYear);

        firstName.requestFocus();

        swDegreeCert.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if (isChecked){
                    spnDegree.setVisibility(View.VISIBLE);
                    txtDegree.setVisibility(View.VISIBLE);
                    spnCert.setVisibility(View.INVISIBLE);
                    txtCertificate.setVisibility(View.INVISIBLE);
                } else{
                    spnDegree.setVisibility(View.INVISIBLE);
                    txtDegree.setVisibility(View.INVISIBLE);
                    spnCert.setVisibility(View.VISIBLE);
                    txtCertificate.setVisibility(View.VISIBLE);
                }
            }


        });

        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (checkData()){
                    String doBirth = "";
                    doBirth = txtDay.getText() + spnMonth.getSelectedItem().toString() + txtYear.getText();

                    Intent nextScreen = new Intent(MainClassList.this, chooseClass.class);
                    nextScreen.putExtra("FirstName", firstName.getText().toString());
                    nextScreen.putExtra("LastName", lastName.getText().toString());
                    nextScreen.putExtra("Phone", phone.getText().toString());
                    nextScreen.putExtra("Birthdate", doBirth);

                    if (spnDegree.getVisibility()==View.VISIBLE){
                        nextScreen.putExtra("isDegreeCert","Degree");
                        nextScreen.putExtra("DegreeCert", spnDegree.getSelectedItem().toString());

                    }else {
                        nextScreen.putExtra("isDegreeCert","Certificate");
                        nextScreen.putExtra("DegreeCert", spnCert.getSelectedItem().toString());
                    }
                    startActivity(nextScreen);


                }
            }
        });






    }



    private boolean checkData(){
        final EditText firstName = (EditText) findViewById(R.id.txtFirstName);
        final EditText lastName = (EditText) findViewById(R.id.txtLastName);
        final EditText phone = (EditText) findViewById(R.id.txtPhone);
        final EditText txtDay = (EditText) findViewById(R.id.txtDay);
        final EditText txtYear = (EditText) findViewById(R.id.txtYear);
        if(firstName.getText().toString().isEmpty()){
            firstName.setError("Invalid First Name");
            firstName.requestFocus();
            return false;
        }
        if(lastName.getText().toString().isEmpty()){
            lastName.setError("Invalid Last Name");
            lastName.requestFocus();
            return false;
        }
        if(phone.getText().toString().isEmpty()){
            phone.setError("Invalid Phone Number");
            phone.requestFocus();
            return false;
        }
        if(txtDay.getText().toString().isEmpty()){
            txtDay.setError("Invalid Day");
            txtDay.requestFocus();
            return false;
        }
        if(txtYear.getText().toString().isEmpty()){
            txtYear.setError("Invalid Year");
            txtYear.requestFocus();
            return false;
        }
        return true;
    }
}
