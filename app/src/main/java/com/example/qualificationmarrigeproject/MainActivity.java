package com.example.qualificationmarrigeproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.mainnav);
        bottomNavigationView.setOnNavigationItemReselectedListener(nav_listener);}
        BottomNavigationView.OnNavigationItemReselectedListener nav_listener=new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                Fragment sele=null;
                switch (menuItem.getItemId()){
                    case R.id.main:
                        sele=new main_fragment();
                        break;
                    case R.id.favorite:
                        sele=new favorite_fragment();
                        break;
                    case R.id.books:
                        sele=new Books_fragment();
                        break;
                }
                FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragment,sele);
                ft.commit();

            }
        };
    }

