package com.example.qualificationmarrigeproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.qualificationmarrigeproject.states_fragment.Books_fragment;
import com.example.qualificationmarrigeproject.states_fragment.main_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    //    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.mainnav);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new main_fragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selected = null;
                switch (item.getItemId()) {
                    case R.id.main: {
                        selected = new main_fragment();
                        break;
                    }
              /*      case R.id.favorite: {
                        selected = new favorite_fragment();
                        break;
                    } */

                    case R.id.books: {
                        selected = new Books_fragment();
                        break;
                    }

                    default:
                    return true;

                }
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selected).commit();

                return true;
            }
        }) ;


    }
}

