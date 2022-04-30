package com.example.qimo.Life;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.Model.Life;
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
    @BindView(R.id.recommend_title_text_view)
    TextView recommendTitleTextView;

    private Life life;

    @Override
    public int bindContentView() {
        return R.layout.activity_life_detail;
    }

    @Override
    public void initActivity() {
        life = getIntent().getParcelableExtra("data");

        imageView.setImageResource(life.img);
        titleTextView.setText(life.title);
        if (null != life.detail) {
            detailTextView.setText(life.detail);
        }
        if (null != life.star) {
            starTextView.setText(life.star);
        }
        if (null != life.time) {
            timeTextView.setText(life.time);
        }
        if (null != life.keywords) {
            keywordsTextView.setText(life.keywords);
        }
        if (null != life.recommend) {
            recommendTextView.setText(life.recommend);
        }
        if (null != life.recommend_title) {
            recommendTitleTextView.setText(life.recommend_title);
        }
        if (null != life.phone) {
            phoneTextView.setText(life.phone);
        }
        if (null != life.address) {
            addressTextView.setText(life.address);
        }
    }

    @OnClick(R.id.phone_text_view)
    public void onClick() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}