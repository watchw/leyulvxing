package com.example.qimo.Base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.qimo.Life.LifeViewHolder;
import com.example.qimo.Model.Life;

import java.util.ArrayList;

/**
 * @project qimo
 * @package：com.example.qimo.Base
 * @anthor xiangxia
 * @time 4/29/22 12:12 PM
 * @description 描述
 */
public abstract class BaseAppAdapter<T> extends BaseAdapter {

    private ArrayList<T> list = new ArrayList<>();
    private Context mContext;

    public BaseAppAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseViewHolder viewHolder;
        if (convertView == null) {
            convertView = defaultConvertView(parent);
            viewHolder = defaultViewHolder(convertView, parent.getContext());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (BaseViewHolder) convertView.getTag();
        }
        viewHolder.setData(list.get(position));
        return convertView;
    }

    public void setData(ArrayList<T> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public abstract View defaultConvertView(ViewGroup parent);

    public abstract BaseViewHolder defaultViewHolder(View convertView, Context context);
}
