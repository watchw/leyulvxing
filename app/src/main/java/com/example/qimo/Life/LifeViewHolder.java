package com.example.qimo.Life;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.qimo.Base.BaseViewHolder;
import com.example.qimo.Model.Life;
import com.example.qimo.R;
import com.example.qimo.Tools.Tools;

import butterknife.BindView;

/**
 * @ProjectName: qimo
 * @Package: com.example.qimo.Life
 * @ClassName: Life1Holder
 * @Description: java类作用描述
 * @Author: xiang xia
 * @CreateDate: 2022/4/28 11:20 下午
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/4/28 11:20 下午
 * @UpdateRemark: 更新说明
 * @Version: 1.0.0
 */
public class LifeViewHolder extends BaseViewHolder<Life> {

    @BindView(R.id.life_second_img)
    ImageView lifeSecondImg;
    @BindView(R.id.life_second_text_title)
    TextView lifeSecondTextTitle;
    @BindView(R.id.life_second_text_content)
    TextView lifeSecondTextContent;

    public static View defaultView(@NonNull ViewGroup parent) {
        View view = Tools.defaultView(parent, R.layout.life_second_item);
        return view;
    }

    public LifeViewHolder(View view, Context context) {
        super(view, context);
    }

    @Override
    public void initView() {

    }

    @Override
    public void updateView() {
        lifeSecondImg.setImageResource(model.img);
        lifeSecondTextTitle.setText(model.title);
        lifeSecondTextContent.setText(model.subtitle);
    }
}
