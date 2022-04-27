package com.example.qimo;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SceneryFgAdapter extends FragmentPagerAdapter {
    private String[] tabtiltle;
    public SceneryFgAdapter(FragmentManager tm, String[] tabtiltle) {
        super(tm);
        this.tabtiltle  = tabtiltle;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new Fragment_one();
                break;
            case 1:
                fragment=new Fragment_two();
                break;
            case 2:
                fragment=new Fragment_three();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
    //获得tab标签
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabtiltle[position];
    }
}
