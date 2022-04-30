package com.example.qimo.Home;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeDetailActivity extends BaseActivity {

    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.title_text_view)
    TextView titleTextView;
    @BindView(R.id.keywords_text_view)
    TextView keywordsTextView;
    @BindView(R.id.detail_text_view)
    TextView detailTextView;
    @BindView(R.id.time_text_view)
    TextView timeTextView;
    @BindView(R.id.ticket_text_view)
    TextView ticketTextView;
    @BindView(R.id.address_text_view)
    TextView addressTextView;
    @BindView(R.id.phone_text_view)
    TextView phoneTextView;

    private ScenicSpot scenicSpot;

    @Override
    public int bindContentView() {
        return R.layout.activity_home_detail;
    }

    @Override
    public void initActivity() {
        scenicSpot = getIntent().getParcelableExtra("data");

        imageView.setImageResource(scenicSpot.img);
        titleTextView.setText(scenicSpot.title);
        if (null != scenicSpot.detail) {
            detailTextView.setText(scenicSpot.detail);
        }
        if (null != scenicSpot.time) {
            timeTextView.setText(scenicSpot.time);
        }
        if (null != scenicSpot.address) {
            addressTextView.setText(scenicSpot.address);
        }
        if (null != scenicSpot.phone) {
            phoneTextView.setText(scenicSpot.phone);
        }

    }

    @OnClick(R.id.phone_text_view)
    public void onClick() {

    }
}