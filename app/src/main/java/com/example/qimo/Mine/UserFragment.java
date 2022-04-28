package com.example.qimo.Mine;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.qimo.Tools.DBOpenHelper;
import com.example.qimo.MainActivity;
import com.example.qimo.R;
import com.example.qimo.Model.User;
import com.example.qimo.user_second;

import java.util.ArrayList;
import java.util.Map;

public class UserFragment extends Fragment {
    private DBOpenHelper mdbOpenHelper;
    private View mview;
    private EditText et_User;
    private EditText et_Psw;
    private String userName;
    private Button btn_login;
    private Button btn_register;
    private CheckBox checkbox;
    private SharedPreferences.Editor editor;

    public static UserFragment newInstance() {
        return new UserFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mview=inflater.inflate(R.layout.user_fragment, null);
        Map<String, String> userInfo = SavePath.getSaveInformation(getActivity());
        if (userInfo != null) {
            et_User.setText(userInfo.get("username"));
            et_Psw.setText(userInfo.get("password"));
        }
        et_User =(EditText)mview.findViewById(R.id.et_username);
        et_Psw =(EditText)mview.findViewById(R.id.et_password);

        checkbox = (CheckBox)mview.findViewById(R.id.checkBox);
        btn_login =(Button)mview.findViewById(R.id.button_login);
        btn_register =(Button)mview.findViewById(R.id.button_register);
        btn_login.setOnClickListener(new MyButton());
        btn_register.setOnClickListener(new MyButton());

        mdbOpenHelper=new DBOpenHelper(getActivity());
        SharedPreferences sp= getActivity().getSharedPreferences("user_mes", Context.MODE_PRIVATE);
        editor=sp.edit();
        if (sp.getBoolean("flag",false)){
                String user_read=sp.getString("user","");
                String psw_read=sp.getString("psw","");
                et_User.setText(user_read);
                et_Psw.setText(psw_read);

        }

        return mview;
    }
    public class MyButton implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            String username =et_User.getText().toString().trim();
            String password =et_Psw.getText().toString().trim();
            switch (view.getId()){
                //当点击登录按钮时
                case R.id.button_login:
                    if (!TextUtils.isEmpty(username)&&!TextUtils.isEmpty(password)){
                        ArrayList<User> data=mdbOpenHelper.getAllDate();
                        boolean match= false;
                        boolean match2=false;
                        for (int i=0;i<data.size();i++){
                            User user=data.get(i);
                            if (username.equals(user.getName())&&password.equals(user.getPassword())){
                                    userName=user.getName();
                                    match=true;
                                    if (checkbox.isChecked()){
                                        editor.putBoolean("flag",true);
                                        editor.putString("user",user.getName());
                                        editor.putString("psw",user.getPassword());
                                        editor.apply();
                                        match2=true;
                                    }else {
                                        editor.putString("user",user.getName());
                                        editor.putString("psw","");
                                        editor.clear();
                                        editor.apply();
                                        match2=false;
                                    }
                                    break;
                            }else {
                                match=false;
                            }

                        }
                        if (match){
                            if (match2){
                                Toast.makeText(getActivity(),"已记住密码",Toast.LENGTH_SHORT).show();

                            }
                            Toast.makeText(getActivity(),"登录成功",Toast.LENGTH_SHORT).show();
                            Runnable target;
                            Thread thread=new Thread(){
                                @Override
                                public void run(){
                                    try {
                                        String user_name=userName;
                                        Intent intent=new Intent(getActivity(), MainActivity.class);
                                        intent.putExtra("usea_name",user_name);
                                        startActivity(intent);
                                    }catch (Exception e){
                                        e.printStackTrace();
                                    }
                                }
                            };
                            thread.start();
                        }else {
                            Toast.makeText(getActivity(),"用户名或密码不正确",Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(getActivity(),"请输入你的用户名或密码！",Toast.LENGTH_SHORT).show();
                    }
                    break;
                //当点击注册按钮事件时
                case R.id.button_register:
                    Intent intent = new Intent(getActivity(), user_second.class);
                    startActivity(intent);
                    getActivity().finish();
                    break;

            }
        }

    }



}
