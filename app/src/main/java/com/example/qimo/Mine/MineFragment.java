package com.example.qimo.Mine;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qimo.Base.BaseFragment;
import com.example.qimo.Collection.CollectionActivity;
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

    @OnClick({R.id.collection_layout, R.id.cache_layout, R.id.logout_btn, R.id.login_btn, R.id.about_layout})
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
            case R.id.about_layout:
                toAbout();
                break;
        }
    }

    private void toCollection() {
        Intent intent = new Intent(getActivity(), CollectionActivity.class);
        startActivity(intent);
    }

    private void toCache() {
        Toast.makeText(getContext(), "???????????????", Toast.LENGTH_SHORT).show();
    }

    private void toLogout() {
        AlertDialog dialog = new AlertDialog.Builder(getContext())
                .setTitle("??????")
                .setMessage("?????????????????????")
                //????????????????????????
                .setNegativeButton("??????", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("??????", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        DataTools.user = null;
                        updateView();
                    }
                }).create();
        dialog.show();


    }

    private void toLogin() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
    }

    private void toAbout() {
        Intent intent = new Intent(getActivity(), AboutActivity.class);
        startActivity(intent);
    }
}