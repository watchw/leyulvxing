package com.example.qimo.Life;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LifeDetailActivity extends BaseActivity {

    @BindView(R.id.title_text_view)
    TextView titleTextView;
    @BindView(R.id.star_text_view)
    TextView starTextView;
    @BindView(R.id.price_text_view)
    TextView priceTextView;
    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.time_text_view)
    TextView timeTextView;
    @BindView(R.id.keywords_text_view)
    TextView keywordsTextView;
    @BindView(R.id.detail_text_view)
    TextView detailTextView;
    @BindView(R.id.recommend_text_view)
    TextView recommendTextView;
    @BindView(R.id.phone_text_view)
    TextView phoneTextView;
    @BindView(R.id.address_text_view)
    TextView addressTextView;

    @Override
    public int bindContentView() {
        return R.layout.activity_life_detail;
    }

    @Override
    public void initActivity() {

    }

    @OnClick(R.id.phone_text_view)
    public void onClick() {
    }
}