package com.example.qualificationmarrigeproject.NavigationFragment.states_fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qualificationmarrigeproject.R;
import com.example.qualificationmarrigeproject.VideoView;
import com.example.qualificationmarrigeproject.recycler.CardModel;
import com.example.qualificationmarrigeproject.recycler.Homeadapter;
import com.example.qualificationmarrigeproject.recycler.RecyclerListener;

import java.util.ArrayList;
public class EngagementState extends Fragment {

    public EngagementState() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_engagement, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rec_engagement;
      rec_engagement= view.findViewById(R.id.engagementRecycler);
       ArrayList<CardModel> arrayList=new ArrayList<>();

        Homeadapter adpter =new Homeadapter(arrayList,  new RecyclerListener() {
            @Override
            public void listener(int position) {
                Intent intent=new Intent(getContext(), VideoView.class);
                startActivity(intent);
            }
      });
        rec_engagement.setAdapter(adpter);
        rec_engagement.setLayoutManager(new LinearLayoutManager(getContext()));


    }

}
