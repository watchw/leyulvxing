package com.example.qimo.Collection;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qimo.Base.BaseViewHolder;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.R;
import com.example.qimo.Tools.Tools;

import androidx.annotation.NonNull;
import butterknife.BindView;

/**
 * @ProjectName: qimo
 * @Package: com.example.qimo.Promotion
 * @ClassName: CollectionViewHolder
 * @Description: java类作用描述
 * @Author: xiang xia
 * @CreateDate: 2022/5/7 20:15
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/5/7 20:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0.0
 */
public class CollectionViewHolder extends BaseViewHolder<ScenicSpot> {

    @BindView(R.id.home_img)
    ImageView homeImg;
    @BindView(R.id.home_title_text)
    TextView homeTitleText;
    @BindView(R.id.home_content_text)
    TextView homeContentText;

    public static View defaultView(@NonNull ViewGroup parent) {
        View view = Tools.defaultView(parent, R.layout.home_item);
        return view;
    }

    public CollectionViewHolder(View view, Context context) {
        super(view, context);
    }

    @Override
    public void initView() {

    }

    @Override
    public void updateView() {
        homeImg.setImageResource(model.img);
        homeTitleText.setText(model.title);
        homeContentText.setText(model.subtitle);
    }
}
