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
                toNext(0);
                break;
            case R.id.life_btn_jiudian:
                toNext(1);
                break;
            case R.id.life_btn_dianying:
                toNext(2);
                break;
            case R.id.life_btn_youleyuan:
                toNext(3);
                break;
            case R.id.life_btn_gongyuan:
                toNext(4);
                break;
            case R.id.life_btn_yinpin:
                toNext(5);
                break;
            case R.id.life_btn_chaoshi:
                toNext(6);
                break;
            case R.id.life_btn_yiyuan:
                toNext(7);
                break;
            case R.id.life_btn_jiaxiao:
                toNext(8);
                break;
            case R.id.life_btn_hunsha:
                toNext(9);
                break;
            case R.id.life_btn_xuexiao:
                toNext(10);
                break;
            case R.id.life_btn_kuaidi:
                toNext(11);
                break;
            case R.id.life_btn_qici:
                toNext(12);
                break;
            case R.id.life_btn_banjia:
                toNext(13);
                break;
            case R.id.life_btn_xiyi:
                toNext(14);
                break;
            case R.id.life_btn_hunsha2:
                toNext(15);
                break;
            case R.id.life_btn_xuexiao2:
                toNext(16);
                break;
            case R.id.life_btn_kuaidi2:
                toNext(17);
                break;
        }
    }

    private void toNext(int tag) {
        Intent intent = new Intent(getActivity(), life_second.class);
        intent.putExtra("tag", tag);
        startActivity(intent);
    }
}
