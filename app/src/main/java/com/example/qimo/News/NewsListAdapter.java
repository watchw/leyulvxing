package com.example.qimo.News;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.qimo.Base.BaseAppAdapter;
import com.example.qimo.Base.BaseViewHolder;
import com.example.qimo.Life.LifeViewHolder;
import com.example.qimo.Model.News;

/**
 * @project qimo
 * @package：com.example.qimo.News
 * @anthor xiangxia
 * @time 4/29/22 12:10 PM
 * @description 描述
 */
public class NewsListAdapter extends BaseAppAdapter<News> {

    public NewsListAdapter(Context context) {
        super(context);
    }

    @Override
    public View defaultConvertView(ViewGroup parent) {
        return NewsListViewHolder.defaultView(parent);
    }

    @Override
    public BaseViewHolder defaultViewHolder(View convertView, Context context) {
        return new NewsListViewHolder(convertView, context);
    }
}
