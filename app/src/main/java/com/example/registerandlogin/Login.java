package com.example.registerandlogin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText etUsername, etPassword;
    TextView bRegisterHere;

    //This is how many incorrect login attempts you have
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bLogin = findViewById(R.id.bLogin);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        bRegisterHere = findViewById(R.id.bRegisterHere);
        bLogin.setOnClickListener(this);
        bRegisterHere.setOnClickListener(this);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(etUsername.getText().toString(), etPassword.getText().toString());
            }
        });
    }

    //If logging in with incorrect username and password more than 5 times, button will disable
    private void validate (String userName, String userPassword) {
        if ((userName.equals("Admin")) && (userPassword.equals("12345"))) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }else{
            counter--;
            if(counter ==0) {
                bLogin.setEnabled(false);
            }

        }
    }
    //this will bring to the registration page
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:

                break;

            case R.id.bRegisterHere:
                startActivity(new Intent(this, Register.class));
                break;




        }
    }

}