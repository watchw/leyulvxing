package com.example.qimo.Mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qimo.Base.BaseFragment;
import com.example.qimo.Login.LoginActivity;
import com.example.qimo.R;
import com.example.qimo.Tools.DataTools;

import butterknife.BindView;
import butterknife.OnClick;

public class MineFragment extends BaseFragment {

    @BindView(R.id.mine_layout)
    ScrollView mineLayout;
    @BindView(R.id.login_btn)
    Button loginBtn;
    @BindView(R.id.login_layout)
    RelativeLayout loginLayout;
    @BindView(R.id.title_text_view)
    TextView titleTextView;

    @Override
    public int bindFMLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    public void bindFMValue(View view, Bundle savedInstanceState) {
        updateView();
    }

    private void updateView() {
        if (null == DataTools.user) {
            loginLayout.setVisibility(View.VISIBLE);
            mineLayout.setVisibility(View.GONE);
        } else {
            loginLayout.setVisibility(View.GONE);
            mineLayout.setVisibility(View.VISIBLE);

            titleTextView.setText(DataTools.user.getName());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updateView();
    }

    @OnClick({R.id.collection_layout, R.id.cache_layout, R.id.logout_btn, R.id.login_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.collection_layout:
                toCollection();
                break;
            case R.id.cache_layout:
                toCache();
                break;
            case R.id.logout_btn:
                toLogout();
                break;
            case R.id.login_btn:
                toLogin();
                break;
        }
    }

    private void toCollection() {

    }

    private void toCache() {
        Toast.makeText(getContext(), "缓存已清空", Toast.LENGTH_SHORT).show();
    }

    private void toLogout() {
        Toast.makeText(getContext(), "已退出登录", Toast.LENGTH_SHORT).show();
        DataTools.user = null;
        updateView();
    }

    private void toLogin() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
    }
}