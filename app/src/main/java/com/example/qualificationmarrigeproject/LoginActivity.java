package com.example.qualificationmarrigeproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
   EditText et_email_login, et_password_login;
    TextView tv_signup ;
    Button btn_signin ;
    ProgressBar progressBar_login ;
    FirebaseAuth fAuth ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_email_login = findViewById(R.id.et_email_login);
        et_password_login = findViewById(R.id.et_password_login);
        progressBar_login = findViewById(R.id.progressBar_login);
        tv_signup = findViewById(R.id.tv_signup);
        fAuth = FirebaseAuth.getInstance();
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
             fAuth.signInWithEmailAndPassword(email , password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                 @Override
                 public void onComplete(@NonNull Task<AuthResult> task) {
                     if (task.isSuccessful()) {
                         Toast.makeText(LoginActivity.this, " Logged in Successfully", Toast.LENGTH_SHORT).show();
                     } else {
                         Toast.makeText(LoginActivity.this, "Error ! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                     }


                 }
             }) ;


            }
        });
    }
}

/*
Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
 */