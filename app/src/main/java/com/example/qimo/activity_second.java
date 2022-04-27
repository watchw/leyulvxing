package com.example.qimo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class activity_second extends AppCompatActivity {
    //画廊
    private ImageSwitcher imageSwitcher;
    Gallery gallery;
    private  int[] imgs={
            R.drawable.chongjiangsuodao,
            R.drawable.chongjiangsuodao2,
            R.drawable.chongjiangsuodao3,
            R.drawable.chongjiangsuodao4,
            R.drawable.chongjiangsuodao5,
            R.drawable.chongjiangsuodao6,
            R.drawable.chongjiangsuodao7
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageSwitcher=(ImageSwitcher)findViewById(R.id.ImageSwitcher1);
        imageSwitcher.setFactory(new viewFactory());
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_out));
        imageSwitcher.setImageResource(R.drawable.chongjiangsuodao);
        gallery=(Gallery)findViewById(R.id.Gallery1);
        gallery.setOnItemSelectedListener(new onItemSelectedListener());
        gallery.setSpacing(10);
        gallery.setAdapter(new baseAdapter());
    }
    class viewFactory implements ViewSwitcher.ViewFactory{
        @Override
        public View makeView(){
            ImageView imageView =new ImageView(activity_second.this);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        }
    }
    class onItemSelectedListener implements AdapterView.OnItemSelectedListener{
        @Override
        public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
            imageSwitcher.setImageResource((int)gallery.getItemIdAtPosition(position));
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0){}
    }
    class baseAdapter extends BaseAdapter {
        public int getCount(){
            return imgs.length;
        }
        public Object getItem(int position){
            return null;
        }
        public long getItemId(int position){
            return imgs[position];
        }
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageView=new ImageView(activity_second.this);
            imageView.setImageResource(imgs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new Gallery.LayoutParams(100,100));
            return imageView;
        }
    }
}
