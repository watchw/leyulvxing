package com.example.qimo.Tools;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

/**
 * @project qimo
 * @package：com.example.qimo.Tools
 * @anthor xiangxia
 * @time 4/29/22 10:12 AM
 * @description 描述
 */
public class Tools {

    public static View defaultView(@NonNull ViewGroup parent, int resource) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return view;
    }
}
