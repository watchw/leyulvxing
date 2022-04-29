package com.example.qimo.Base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.ButterKnife;

/**
 * @ProjectName: qimo
 * @Package: com.example.qimo.Base
 * @ClassName: BaseHolder
 * @Description: java类作用描述
 * @Author: xiang xia
 * @CreateDate: 2022/4/28 11:32 下午
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/4/28 11:32 下午
 * @UpdateRemark: 更新说明
 * @Version: 1.0.0
 */
public abstract class BaseViewHolder<T> {
    private View convertView;
    private Context context;
    public T model;

    public BaseViewHolder(@NonNull View itemView, @NonNull Context context) {
        ButterKnife.bind(this, itemView);
        this.convertView = itemView;
        this.context = context;
        initView();
    }

    public void setData(T t) {
        this.model = t;
        if (null == context || null == model) {
            return;
        }
        updateView();
    }

    public View getConvertView() {
        return convertView;
    }

    public Context getContext() {
        return context;
    }

    public abstract void initView();
    public abstract void updateView();
}
