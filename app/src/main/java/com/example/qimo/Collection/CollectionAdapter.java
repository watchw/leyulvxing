package com.example.qimo.Collection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.qimo.Model.ScenicSpot;

import java.util.ArrayList;

/**
 * @ProjectName: qimo
 * @Package: com.example.qimo.Collection
 * @ClassName: CollectionAdapter
 * @Description: java类作用描述
 * @Author: xiang xia
 * @CreateDate: 2022/5/7 20:13
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/5/7 20:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0.0
 */
public class CollectionAdapter extends BaseAdapter {
    private ArrayList<ScenicSpot> list = new ArrayList<>();
    private Context mContext;
    private LayoutInflater mInflater;

    public CollectionAdapter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<ScenicSpot> list) {
        this.list = list;
        notifyDataSetChanged();
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
        CollectionViewHolder viewHolder;
        if (convertView == null) {
            convertView = CollectionViewHolder.defaultView(parent);
            viewHolder = new CollectionViewHolder(convertView, parent.getContext());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (CollectionViewHolder) convertView.getTag();
        }
        viewHolder.setData(list.get(position));
        return convertView;
    }
}
