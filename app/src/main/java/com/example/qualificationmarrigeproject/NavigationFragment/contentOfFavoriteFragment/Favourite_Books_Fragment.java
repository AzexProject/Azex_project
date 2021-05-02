package com.example.qualificationmarrigeproject.NavigationFragment.contentOfFavoriteFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qualificationmarrigeproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Favourite_Books_Fragment extends Fragment {

    public Favourite_Books_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourite__books_, container, false);
    }
}
