package com.example.qimo.Mine;

import android.os.Bundle;
import android.widget.Toast;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AboutActivity extends BaseActivity {


    @Override
    public int bindContentView() {
        return R.layout.activity_about;
    }

    @Override
    public void initActivity() {

    }

    @OnClick(R.id.version_btn)
    public void onClick() {
        Toast.makeText(this, "已是最新版本", Toast.LENGTH_SHORT).show();
    }
}