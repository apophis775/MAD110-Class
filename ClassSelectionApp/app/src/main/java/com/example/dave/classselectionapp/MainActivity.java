package com.example.dave.classselectionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String name = "Dave";
    String pass = "password";
    String entName;
    String entPass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtName = (EditText)findViewById(R.id.idLoginText);
        final EditText txtPass = (EditText)findViewById(R.id.idPasswordText);
        Button login = (Button)findViewById(R.id.btnLogin);
            login.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    entName = txtName.getText().toString();
                    entPass = txtPass.getText().toString();
                    if (entName != name) {
                        Toast.makeText(MainActivity.this, "Incorrect User",Toast.LENGTH_LONG).show();}
                    else if (entPass != pass)
                        Toast.makeText(MainActivity.this, "Incorrect Password",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, "Login Successful",Toast.LENGTH_LONG).show();
                }

            });
    }
}
