package com.example.qimo.Life;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.qimo.Model.Life;

import java.util.ArrayList;

/**
 * @ProjectName: qimo
 * @Package: com.example.qimo.Life
 * @ClassName: LifeAdapter
 * @Description: java类作用描述
 * @Author: xiang xia
 * @CreateDate: 2022/4/28 11:14 下午
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/4/28 11:14 下午
 * @UpdateRemark: 更新说明
 * @Version: 1.0.0
 */
public class LifeAdapter extends BaseAdapter {
    private ArrayList<Life> list = new ArrayList<>();
    private Context mContext;
    private LayoutInflater mInflater;

    public LifeAdapter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<Life> list) {
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
        LifeViewHolder viewHolder;
        if (convertView == null) {
            convertView = LifeViewHolder.defaultView(parent);
            viewHolder = new LifeViewHolder(convertView, parent.getContext());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (LifeViewHolder) convertView.getTag();
        }
        viewHolder.setData(list.get(position));
        return convertView;
    }
}
