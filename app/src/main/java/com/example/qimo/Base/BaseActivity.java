package com.example.qimo.Base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.qimo.R;

import butterknife.ButterKnife;

/**
 * @project qimo
 * @package：com.example.qimo.Base
 * @anthor xiangxia
 * @time 4/29/22 11:56 AM
 * @description 描述
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(bindContentView());
        ButterKnife.bind(this);
        initActivity();
    }

    public abstract int bindContentView();

    public abstract void initActivity();
}
