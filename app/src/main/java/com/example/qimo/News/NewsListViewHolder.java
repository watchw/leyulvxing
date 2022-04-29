package com.example.qimo.News;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.qimo.Base.BaseViewHolder;
import com.example.qimo.Model.News;
import com.example.qimo.R;
import com.example.qimo.Tools.Tools;

import butterknife.BindView;

/**
 * @project qimo
 * @package：com.example.qimo.News
 * @anthor xiangxia
 * @time 4/29/22 12:20 PM
 * @description 描述
 */
public class NewsListViewHolder extends BaseViewHolder<News> {

    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.title_text_view)
    TextView titleTextView;
    @BindView(R.id.source_text_view)
    TextView sourceTextView;
    @BindView(R.id.time_text_view)
    TextView timeTextView;
    @BindView(R.id.content_layout)
    RelativeLayout contentLayout;

    public static View defaultView(@NonNull ViewGroup parent) {
        View view = Tools.defaultView(parent, R.layout.new_list_item);
        return view;
    }

    public NewsListViewHolder(View view, Context context) {
        super(view, context);
    }

    @Override
    public void initView() {

    }

    @Override
    public void updateView() {
        if (model.img == -1) {
            imageView.setVisibility(View.GONE);
        } else {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(model.img);
        }
        titleTextView.setText(model.title);
        sourceTextView.setText(model.source);
        timeTextView.setText(model.time);
    }
}
