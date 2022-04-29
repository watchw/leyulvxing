package com.example.qimo.Promotion;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qimo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class activity_second extends AppCompatActivity {

    @BindView(R.id.top_img)
    ImageView topImg;
    @BindView(R.id.title_text_view)
    TextView titleTextView;
    @BindView(R.id.date_text_view)
    TextView dateTextView;
    @BindView(R.id.address_text_view)
    TextView addressTextView;
    @BindView(R.id.gallery1)
    Gallery gallery1;
    @BindView(R.id.imageSwitcher1)
    ImageSwitcher imageSwitcher1;
    @BindView(R.id.t1)
    TableLayout t1;
    @BindView(R.id.recommend_text_view)
    TextView recommendTextView;
    @BindView(R.id.activity_title_text_view)
    TextView activityTitleTextView;
    @BindView(R.id.activity_detail_text_view)
    TextView activityDetailTextView;

    private int[] imgs = {
            R.drawable.chongjiangsuodao,
            R.drawable.chongjiangsuodao2,
            R.drawable.chongjiangsuodao3,
            R.drawable.chongjiangsuodao4,
            R.drawable.chongjiangsuodao5,
            R.drawable.chongjiangsuodao6,
            R.drawable.chongjiangsuodao7
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        imageSwitcher1.setFactory(new viewFactory());
        imageSwitcher1.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher1.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        imageSwitcher1.setImageResource(R.drawable.chongjiangsuodao);

        gallery1.setOnItemSelectedListener(new onItemSelectedListener());
        gallery1.setSpacing(10);
        gallery1.setAdapter(new baseAdapter());
    }

    @OnClick(R.id.collection_btn)
    public void onClick() {
        Toast.makeText(this, "收藏成功", Toast.LENGTH_SHORT).show();
    }

    class viewFactory implements ViewSwitcher.ViewFactory {
        @Override
        public View makeView() {
            ImageView imageView = new ImageView(activity_second.this);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        }
    }

    class onItemSelectedListener implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            imageSwitcher1.setImageResource((int) gallery1.getItemIdAtPosition(position));
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

    class baseAdapter extends BaseAdapter {
        public int getCount() {
            return imgs.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return imgs[position];
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(activity_second.this);
            imageView.setImageResource(imgs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
            return imageView;
        }
    }
}
