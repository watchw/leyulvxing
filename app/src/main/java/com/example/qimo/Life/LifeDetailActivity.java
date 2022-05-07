package com.example.qimo.Life;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.Model.Life;
import com.example.qimo.R;
import com.example.qimo.Tools.Tools;

import java.net.URISyntaxException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LifeDetailActivity extends BaseActivity {

    @BindView(R.id.title_text_view)
    TextView titleTextView;
    @BindView(R.id.star_text_view)
    TextView starTextView;
    @BindView(R.id.price_text_view)
    TextView priceTextView;
    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.time_text_view)
    TextView timeTextView;
    @BindView(R.id.keywords_text_view)
    TextView keywordsTextView;
    @BindView(R.id.detail_text_view)
    TextView detailTextView;
    @BindView(R.id.recommend_text_view)
    TextView recommendTextView;
    @BindView(R.id.phone_text_view)
    TextView phoneTextView;
    @BindView(R.id.address_text_view)
    TextView addressTextView;
    @BindView(R.id.recommend_title_text_view)
    TextView recommendTitleTextView;

    private Life life;

    @Override
    public int bindContentView() {
        return R.layout.activity_life_detail;
    }

    @Override
    public void initActivity() {
        life = getIntent().getParcelableExtra("data");

        imageView.setImageResource(life.img);
        titleTextView.setText(life.title);
        if (null != life.detail) {
            detailTextView.setText(life.detail);
        }
        if (null != life.star) {
            starTextView.setText(life.star);
        }
        if (null != life.time) {
            timeTextView.setText(life.time);
        }
        if (null != life.keywords) {
            keywordsTextView.setText(life.keywords);
        }
        if (null != life.recommend) {
            recommendTextView.setText(life.recommend);
        }
        if (null != life.recommend_title) {
            recommendTitleTextView.setText(life.recommend_title);
        }
        if (null != life.phone) {
            phoneTextView.setText(life.phone);
        }
        if (null != life.address) {
            addressTextView.setText(life.address);
        }
    }

    @OnClick({R.id.phone_text_view, R.id.address_text_view})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.phone_text_view:
                Log.i("phone", "call");
                String number = "18166327429";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
                startActivity(intent);
                break;
            case R.id.address_text_view:
                Log.i("address", "map");
                toMap();
                break;
        }

    }


    private void toMap() {
        String mLatitude = "39.918073";
        String mLongitude = "116.399702";
        String mAreaName = "name";
        if (Tools.isAvilible(this, "com.baidu.BaiduMap")) {// 传入指定应用包名

            try {
                Intent intent = Intent.getIntent("intent://map/direction?destination=latlng:"
                        + mLatitude + ","
                        + mLongitude + "|name:"+mAreaName + // 终点
                        "&mode=driving&" + // 导航路线方式
                        "region=北京" + //
                        "&src=新疆和田#Intent;scheme=bdapp;package=com.baidu.BaiduMap;end");
                startActivity(intent); // 启动调用
            } catch (URISyntaxException e) {
                Log.e("intent", e.getMessage());
            }
        } else {// 未安装
            Toast.makeText(this, "您尚未安装百度地图", Toast.LENGTH_LONG)
                    .show();
//            Uri uri = Uri
//                    .parse("market://details?id=com.baidu.BaiduMap");
//            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//            startActivity(intent);
        }
    }

}