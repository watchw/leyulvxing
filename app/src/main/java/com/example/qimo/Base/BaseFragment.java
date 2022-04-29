package com.example.qimo.Base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;

/**
 * @project qimo
 * @package：com.example.qimo.Base
 * @anthor xiangxia
 * @time 4/29/22 11:45 AM
 * @description 描述
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(bindFMLayout(), container, false);
        FrameLayout.LayoutParams flp =
                new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                        FrameLayout.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(flp);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);
        bindFMValue(view, savedInstanceState);
    }

    public abstract int bindFMLayout();
    public abstract void bindFMValue(View view, Bundle savedInstanceState);
}
