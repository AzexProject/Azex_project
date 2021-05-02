package com.example.qualificationmarrigeproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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

public class Register_Activity extends AppCompatActivity {
    EditText et_name , et_password , et_email , et_phone ;
    TextView tv_signed_in ;
    Button btn_register ;
    ProgressBar progressBar_register ;
        FirebaseAuth fAuth ;
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

        fAuth = FirebaseAuth.getInstance();

        if(fAuth.getCurrentUser() != null)
        {
               startActivity(new Intent(Register_Activity.this , LoginActivity.class));
               finish();
        }

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

                fAuth.createUserWithEmailAndPassword(email , password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                   @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Register_Activity.this, "User Created.", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Register_Activity.this, "Error ! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }


                    }} );


    }
});
        tv_signed_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext() , LoginActivity.class));
            }
        });
    }}

