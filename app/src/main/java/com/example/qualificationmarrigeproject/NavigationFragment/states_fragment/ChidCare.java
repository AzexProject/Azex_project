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


public class ChidCare extends Fragment {

    public ChidCare() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_child_care, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rec_Child;
        rec_Child= view.findViewById(R.id.childCareRecycler);
        ArrayList<CardModel> arrayList=new ArrayList<>();

        Homeadapter adpter =new Homeadapter(arrayList,  new RecyclerListener() {
            @Override
            public void listener(int position) {
                Intent intent=new Intent(getContext(), VideoView.class);
                startActivity(intent);
            }
        });
        rec_Child.setAdapter(adpter);
        rec_Child.setLayoutManager(new LinearLayoutManager(getContext()));




    }

}
