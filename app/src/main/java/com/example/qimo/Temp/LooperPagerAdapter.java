package com.example.qimo.Temp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class LooperPagerAdapter extends PagerAdapter {
    private List<Integer> mPics =null;

    @Override
    public int getCount() {
        if (mPics != null){
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        int real_positon=position%mPics.size();
        ImageView imageView=new ImageView(container.getContext());
        imageView.setImageResource(mPics.get(real_positon));
        //设置完数据以后，就添加到容器里
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    public void setData(List<Integer> sColor) {
        this.mPics =sColor;
    }
    public int getDataRealSize(){
        if (mPics!=null){
            return mPics.size();
        }
        return 0;
    }
}
