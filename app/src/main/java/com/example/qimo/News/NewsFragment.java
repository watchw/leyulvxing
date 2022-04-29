package com.example.qimo.News;

import android.os.Bundle;
import android.view.View;

import androidx.viewpager.widget.ViewPager;

import com.example.qimo.Base.BaseFragment;
import com.example.qimo.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;

public class NewsFragment extends BaseFragment {
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager001)
    ViewPager viewPager001;

    private String[] tabletitle = {
            "热点",
            "本地",
            "专题"
    };
    private TabLayout tableLayout;
    private ViewPager viewPager;
    private View nview;

    @Override
    public int bindFMLayout() {
        return R.layout.news_fragment;
    }

    @Override
    public void bindFMValue(View view, Bundle savedInstanceState) {
        SceneryFgAdapter sceneryFgAdapter = new SceneryFgAdapter(getChildFragmentManager(), tabletitle);
        viewPager001.setAdapter(sceneryFgAdapter);
        tabLayout.setupWithViewPager(viewPager001);
    }

}
