package com.example.qimo.Temp;

import android.os.Bundle;

import com.example.qimo.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class testActivity extends AppCompatActivity {
    //轮播图
    private ViewPager mLoopPager;
    private LooperPagerAdapter mLooperPagerAdapter;
    private static List<Integer> sPics = new ArrayList<>();
    static {
        sPics.add(R.drawable.chiqikou);
        sPics.add(R.drawable.chongjiangsuodao);
        sPics.add(R.drawable.hongyadong);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_fragment);
        initView();
    }
    //轮播图
    private void initView() {
        //找到view Pager空间
        mLoopPager=(ViewPager) this.findViewById(R.id.looper_pager);
        //设置适配器
        mLooperPagerAdapter=new LooperPagerAdapter();
        mLooperPagerAdapter.setData(sPics);
        mLoopPager.setAdapter(mLooperPagerAdapter);

    }
}
