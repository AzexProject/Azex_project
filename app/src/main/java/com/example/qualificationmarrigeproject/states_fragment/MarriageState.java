package com.example.qualificationmarrigeproject.states_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qualificationmarrigeproject.R;


public class MarriageState extends Fragment {

    public MarriageState() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_marriage_state, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView homeRecycler;
        homeRecycler = view.findViewById(R.id.MarriageRecycler);
////        ArrayList<CardModel> arrayList = new ArrayList<>();
////        arrayList.add(new CardModel(R.drawable.engagment, "الخطوبه"));
////        arrayList.add(new CardModel(R.drawable.marriage, "الزواج"));
////        arrayList.add(new CardModel(R.drawable.child3, "التربية"));
////        Homeadapter homeadapter = new Homeadapter(arrayList, new RecyclerListener() {
////            @Override
////            public void listener(int position) {
////            /*    switch (position){
//                    case 0 :
//                        NavHostFragment.findNavController(main_fragment.this).navigate(R.id.action_main_to_engagementState);
//
//                        break;
//                    case 1 :
//                        NavHostFragment.findNavController(main_fragment.this).navigate(R.id.action_main_to_marriageState);
//
//                        break;
//                    case 2 :
//                        NavHostFragment.findNavController(main_fragment.this).navigate(R.id.action_main_to_chidCare);
//
//                        break;}
//*/
//
//
//            }
//        });
//        homeRecycler.setAdapter(homeadapter);
//        homeRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

    }
}
