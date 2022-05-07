package com.example.qimo.Tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

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

    /*
     * 检查手机上是否安装了指定的软件
     *
     * @param context
     *
     * @param packageName：应用包名
     *
     * @return
     */
    public static boolean isAvilible(Context context, String packageName) {
        // 获取packagemanager
        final PackageManager packageManager = context.getPackageManager();
        // 获取所有已安装程序的包信息
        List<PackageInfo> packageInfos = packageManager.getInstalledPackages(0);
        // 用于存储所有已安装程序的包名
        List<String> packageNames = new ArrayList<String>();
        // 从pinfo中将包名字逐一取出，压入pName list中
        if (packageInfos != null) {
            for (int i = 0; i < packageInfos.size(); i++) {
                String packName = packageInfos.get(i).packageName;
                packageNames.add(packName);
            }
        }
        // 判断packageNames中是否有目标程序的包名，有TRUE，没有FALSE
        return packageNames.contains(packageName);
    }


}
