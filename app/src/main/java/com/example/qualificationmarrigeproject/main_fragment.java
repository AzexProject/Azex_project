package com.example.qualificationmarrigeproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qualificationmarrigeproject.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class main_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public main_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView homeRecycler;
homeRecycler=v.findViewById(R.id.home_recycler);
        ArrayList<CardModel>arrayList=new ArrayList<>();
        arrayList.add(new CardModel(R.drawable.engagment,"الخطوبه"));
        arrayList.add(new CardModel(R.drawable.marriage,"الزواج"));
        arrayList.add(new CardModel(R.drawable.child1,"التربية"));
        Homeadapter homeadapter=new Homeadapter(arrayList);
        homeRecycler.setAdapter(homeadapter);
        homeRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }
}
