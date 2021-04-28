package com.example.qualificationmarrigeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv2;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1=findViewById(R.id.et1_login);
        et2=findViewById(R.id.et2_login);

        tv2=findViewById(R.id.tv_signup);
        bt=findViewById(R.id.bt_signin);
    }
}