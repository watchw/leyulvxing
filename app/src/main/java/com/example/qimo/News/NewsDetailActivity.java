package com.example.qimo.News;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.Model.News;
import com.example.qimo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsDetailActivity extends BaseActivity {

    @BindView(R.id.title_text_view)
    TextView titleTextView;
    @BindView(R.id.source_text_view)
    TextView sourceTextView;
    @BindView(R.id.time_text_view)
    TextView timeTextView;
    @BindView(R.id.detail_text_view)
    TextView detailTextView;
    @BindView(R.id.image_view)
    ImageView imageView;

    @Override
    public int bindContentView() {
        return R.layout.activity_news_detail;
    }

    @Override
    public void initActivity() {
        News news = getIntent().getParcelableExtra("data");
        titleTextView.setText(news.title);
        sourceTextView.setText(news.source);
        timeTextView.setText(news.time);
        if (news.img != -1) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(news.img);
        } else {
            imageView.setVisibility(View.GONE);
        }
        detailTextView.setText(news.detail);
    }

}