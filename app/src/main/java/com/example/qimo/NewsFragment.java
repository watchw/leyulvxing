package com.example.qimo;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

public class NewsFragment extends Fragment {
    private String[] tabletitle={
            "热点",
            "本地",
            "专题"
    };
    private TabLayout tableLayout;
    private ViewPager viewPager;
    private View nview;
    public static NewsFragment newInstance() {
        return new NewsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        nview=inflater.inflate(R.layout.news_fragment, null);
        viewPager=(ViewPager)nview.findViewById(R.id.viewPager001);
        tableLayout=(TabLayout) nview.findViewById(R.id.tab_layout);
        SceneryFgAdapter sceneryFgAdapter = new SceneryFgAdapter(getChildFragmentManager(), tabletitle);
        viewPager.setAdapter(sceneryFgAdapter);
        //tablayout绑定viewpager
        tableLayout.setupWithViewPager(viewPager);
        return nview;
    }


}
