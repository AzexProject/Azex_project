package com.example.qualificationmarrigeproject.NavigationFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.qualificationmarrigeproject.R;


/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class Books_fragment extends Fragment {


    public Books_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books, container, false);
    }
}
