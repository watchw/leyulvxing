package com.example.qimo.Base;

import android.content.Context;
import android.view.View;

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
public abstract class BaseHolder<T> {
    private View convertView;
    private Context context;
    public T data;

    public BaseHolder(View view, Context context) {
        this.convertView = view;
        this.context = context;
//        initView();
    }

    public void setData(T data) {
        this.data = data;
//        setView();
    }

    public View getConvertView() {
        return convertView;
    }

    public Context getContext() {
        return context;
    }

//    public abstract void initView();
//    public abstract void setView();
}
