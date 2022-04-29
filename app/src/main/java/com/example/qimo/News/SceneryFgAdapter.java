package com.example.qimo.News;

import com.example.qimo.Fragment_one;
import com.example.qimo.Fragment_three;
import com.example.qimo.Fragment_two;
import com.example.qimo.Model.News;
import com.example.qimo.Tools.DataTools;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class SceneryFgAdapter extends FragmentPagerAdapter {
    private String[] tabtiltle;

    public SceneryFgAdapter(FragmentManager tm, String[] tabtiltle) {
        super(tm);
        this.tabtiltle = tabtiltle;
    }

    @Override
    public Fragment getItem(int position) {
        NewsListFragment fragment = new NewsListFragment();
        fragment.setListener(new NewsListFragment.NewsListListener() {
            @Override
            public ArrayList<News> getData() {
                return DataTools.getNewsList(position);
            }
        });
        return fragment;
    }

    @Override
    public int getCount() {
        return tabtiltle.length;
    }

    //获得tab标签
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabtiltle[position];
    }
}
