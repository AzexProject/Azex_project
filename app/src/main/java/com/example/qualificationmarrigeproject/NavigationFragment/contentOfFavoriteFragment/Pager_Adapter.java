package com.example.qualificationmarrigeproject.NavigationFragment.contentOfFavoriteFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class Pager_Adapter  extends FragmentStatePagerAdapter {

    ArrayList<Mytab> tabs = new ArrayList<>();

    public Pager_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTabName();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabs.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    public void addTab(Mytab tab) {
        tabs.add(tab);
    }


}
