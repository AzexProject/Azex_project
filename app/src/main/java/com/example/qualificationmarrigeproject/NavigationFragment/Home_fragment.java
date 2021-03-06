package com.example.qualificationmarrigeproject.NavigationFragment;

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
 * <p>
 * create an instance of this fragment.
 */
public class Home_fragment extends Fragment {


    public Home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.from(getContext()).inflate(R.layout.fragment_main, null);
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
                NavController navController=NavHostFragment.findNavController(Home_fragment.this);
             if(navController!=null){

                    switch (position) {
                        case 0: {
                            navController.navigate(R.id.action_main_to_engagementState);

                            break;
                        }
                        case 1: {
                            navController.navigate(R.id.action_main_to_marriageState);

                            break;
                        }
                        case 2: {
                            navController.navigate(R.id.action_main_to_childCare);

                            break;
                        }
                        default:
                            Toast.makeText(getContext(), "NotFound", Toast.LENGTH_LONG).show();
                    }
                }


            }
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


