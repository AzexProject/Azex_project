package com.example.qualificationmarrigeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
   EditText et_email_login, et_password_login;
    TextView tv_signup ;
    Button btn_signin ;
    ProgressBar progressBar_login ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_email_login = findViewById(R.id.et_email_login);
        et_password_login = findViewById(R.id.et_password_login);
        progressBar_login = findViewById(R.id.progressBar_login);
        tv_signup = findViewById(R.id.tv_signup);
        btn_signin = findViewById(R.id.bt_signin);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_email_login.getText().toString().trim();
                String password = et_password_login.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    et_email_login.setError("Email is Requried.");
                    return ;
                }
                if(TextUtils.isEmpty(password)){
                    et_password_login.setError("Password is Requried.");
                    return ;
                }
                if(password.length() < 6){
                    et_password_login.setError("Password Must be >= 6 Characters");
                    return ;
                }
                progressBar_login.setVisibility(View.VISIBLE);

            }
        });
    }
}

/*
Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
 */