package com.example.qualificationmarrigeproject.states_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qualificationmarrigeproject.recycler.CardModel;
import com.example.qualificationmarrigeproject.recycler.Homeadapter;
import com.example.qualificationmarrigeproject.R;
import com.example.qualificationmarrigeproject.recycler.RecyclerListener;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class main_fragment extends Fragment {


    public main_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.from(getContext()).inflate(R.layout.fragment_main, null);
        RecyclerView homeRecycler;
        homeRecycler = v.findViewById(R.id.home_recycler);
         ArrayList<CardModel> arrayList = new ArrayList<>();
        arrayList.add(new CardModel(R.drawable.engagment, "الخطوبه"));
        arrayList.add(new CardModel(R.drawable.marriage, "الزواج"));
        arrayList.add(new CardModel(R.drawable.child3, "التربية"));
     Homeadapter homeadapter = new Homeadapter(arrayList, new RecyclerListener() {

            @Override
            public void listener(int position) {
//                NavHostFragment.findNavController(main_fragment.this).navigate(R.id.action_main_to_engagementState);
//                Toast.makeText(getContext(),"NotFound",Toast.LENGTH_LONG).show();


                switch (position) {
                    case 0:{
                        NavHostFragment.findNavController(main_fragment.this)  .navigate(R.id.action_main_to_engagementState);

                        break;}
                    case 1:{
                        NavHostFragment.findNavController(main_fragment.this).navigate(R.id.action_main_to_marriageState);

                        break;}
                    case 2:{
                        NavHostFragment.findNavController(main_fragment.this). navigate(R.id.action_main_to_childCare);

                        break;}
                    default:
                        Toast.makeText(getContext(),"NotFound",Toast.LENGTH_LONG).show();
                }}



        });
        homeRecycler.setAdapter(homeadapter);
        homeRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }
}


