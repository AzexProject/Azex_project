package com.example.qualificationmarrigeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Register_Activity extends AppCompatActivity {
    EditText et_name , et_password , et_email , et_phone ;
    TextView tv_signed_in ;
    Button btn_register ;
    ProgressBar progressBar_register ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_name = findViewById(R.id.et_name);
        et_password = findViewById(R.id.et_password);
        et_email = findViewById(R.id.et_email);
        et_phone = findViewById(R.id.et_phone);
        tv_signed_in = findViewById(R.id.tv_signed_in);
        progressBar_register = findViewById(R.id.progressBar_login);
        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = et_email.getText().toString().trim();
                String password = et_password.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    et_email.setError("Email is Requried.");
                    return ;
                }
                if(TextUtils.isEmpty(password)){
                    et_password.setError("Password is Requried.");
                    return ;

                }
                if(password.length() < 6){
                    et_password.setError("Password Must be >= 6 Characters");
                    return ;
                }
                progressBar_register.setVisibility(View.VISIBLE);
            }
        });
    }
}


