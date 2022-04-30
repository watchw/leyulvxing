package com.example.qimo.Home;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qimo.Base.BaseActivity;
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

    @Override
    public int bindContentView() {
        return R.layout.activity_home_detail;
    }

    @Override
    public void initActivity() {

    }

    @OnClick(R.id.phone_text_view)
    public void onClick() {

    }
}