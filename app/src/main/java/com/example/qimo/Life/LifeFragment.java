package com.example.qimo.Life;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qimo.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LifeFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.life_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

    }

    @OnClick({R.id.life_btn_canting, R.id.life_btn_jiudian, R.id.life_btn_dianying, R.id.life_btn_youleyuan, R.id.life_btn_gongyuan, R.id.life_btn_yinpin, R.id.life_btn_chaoshi, R.id.life_btn_yiyuan, R.id.life_btn_jiaxiao, R.id.life_btn_hunsha, R.id.life_btn_xuexiao, R.id.life_btn_kuaidi, R.id.life_btn_qici, R.id.life_btn_banjia, R.id.life_btn_xiyi, R.id.life_btn_hunsha2, R.id.life_btn_xuexiao2, R.id.life_btn_kuaidi2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.life_btn_canting:
                Intent intent = new Intent(getActivity(), life_second.class);
                startActivity(intent);
                break;
            case R.id.life_btn_jiudian:
                break;
            case R.id.life_btn_dianying:
                break;
            case R.id.life_btn_youleyuan:
                break;
            case R.id.life_btn_gongyuan:
                break;
            case R.id.life_btn_yinpin:
                break;
            case R.id.life_btn_chaoshi:
                break;
            case R.id.life_btn_yiyuan:
                break;
            case R.id.life_btn_jiaxiao:
                break;
            case R.id.life_btn_hunsha:
                break;
            case R.id.life_btn_xuexiao:
                break;
            case R.id.life_btn_kuaidi:
                break;
            case R.id.life_btn_qici:
                break;
            case R.id.life_btn_banjia:
                break;
            case R.id.life_btn_xiyi:
                break;
            case R.id.life_btn_hunsha2:
                break;
            case R.id.life_btn_xuexiao2:
                break;
            case R.id.life_btn_kuaidi2:
                break;
        }
    }
}
