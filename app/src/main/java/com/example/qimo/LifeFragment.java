package com.example.qimo;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LifeFragment extends Fragment {
    private View mView;
    private LifeViewModel mViewModel;
    private Button life_btn_canting;
    public static LifeFragment newInstance() {
        return new LifeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.life_fragment, null);
        life_btn_canting=(Button)mView.findViewById(R.id.life_btn_canting);
        life_btn_canting.setOnClickListener(new btnclock());
        return mView;
    }

    class btnclock implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getActivity(),life_second.class);
            startActivity(intent);
        }
    }


}
