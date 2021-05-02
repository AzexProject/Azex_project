package com.example.qualificationmarrigeproject.NavigationFragment.contentOfFavoriteFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.qualificationmarrigeproject.R;
import com.example.qualificationmarrigeproject.recycler.CardModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class Favorite_fragment extends Fragment {

    TabLayout tabLayout ;
    ViewPager viewPager ;
    Pager_Adapter  pager_adapter ;
    ArrayList<CardModel> cards ;
   Favourite_Books_Fragment favourite_books ;
    Favourite__Videos_Fragment favourite_videos;

    public Favorite_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabLayout = view.findViewById(R.id.tabLayout_main);
        viewPager = view.findViewById(R.id.main_view_pager);
        favourite_books = new Favourite_Books_Fragment();
        favourite_videos = new Favourite__Videos_Fragment();
        cards = new ArrayList<>();
        cards.add(new CardModel(R.drawable.ic_home_black_24dp, "tetf"));

        pager_adapter = new Pager_Adapter(getParentFragmentManager());
        pager_adapter.addTab(new Mytab("Videos", favourite_videos));
        pager_adapter.addTab(new Mytab("Books", favourite_books));
        viewPager.setAdapter(pager_adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
