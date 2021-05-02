package com.example.qualificationmarrigeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VideoView extends AppCompatActivity {
ImageButton imageButton;
Button saveNotes;
RecyclerView r;
int click=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        imageButton=findViewById(R.id.fav_image);
        saveNotes=findViewById(R.id.save_notes);
        imageButton.setImageResource(R.drawable.ic_favorite_border_black_24dp);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(click==0){ imageButton.setImageResource(R.drawable.ic_favorite_border_black_24dp);
click=1;}
else if (click==1){ imageButton.setImageResource(R.drawable.ic_favorite_black_24dp);
click=0;}

            }
        });
        saveNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        
    }
}
