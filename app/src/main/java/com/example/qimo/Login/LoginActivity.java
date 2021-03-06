package com.example.qimo.Login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.Tools.DBOpenHelper;
import com.example.qimo.MainActivity;
import com.example.qimo.R;
import com.example.qimo.Model.User;
import com.example.qimo.Tools.DataTools;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.checkBox)
    CheckBox checkBox;
    @BindView(R.id.button_register)
    TextView buttonRegister;
    @BindView(R.id.button_login)
    Button buttonLogin;

    private String userName;
    private DBOpenHelper mdbOpenHelper;
    private SharedPreferences.Editor editor;

    @Override
    public int bindContentView() {
        return R.layout.activity_login;
    }

    @Override
    public void initActivity() {
        mdbOpenHelper = new DBOpenHelper(this);
        SharedPreferences sp = this.getSharedPreferences("user_mes", Context.MODE_PRIVATE);
        editor = sp.edit();
        if (sp.getBoolean("flag", false)) {
            String user_read = sp.getString("user", "");
            String psw_read = sp.getString("psw", "");
            etUsername.setText(user_read);
            etPassword.setText(psw_read);
        }
    }

    @OnClick({R.id.checkBox, R.id.button_register, R.id.button_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.checkBox:
                break;
            case R.id.button_register:
                Intent intent = new Intent();
                intent.setClass(this, RegistActivity.class);
                startActivity(intent);
                break;
            case R.id.button_login:
                onLogin();
                break;
        }
    }

    private void onLogin() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) {
            ArrayList<User> data = mdbOpenHelper.getAllDate();
            boolean match = false;
            boolean match2 = false;
            for (int i = 0; i < data.size(); i++) {
                User user = data.get(i);
                if (username.equals(user.getName()) && password.equals(user.getPassword())) {
                    userName = user.getName();
                    match = true;
                    if (checkBox.isChecked()) {
                        editor.putBoolean("flag", true);
                        editor.putString("user", user.getName());
                        editor.putString("psw", user.getPassword());
                        editor.apply();
                        match2 = true;
                    } else {
                        editor.putString("user", user.getName());
                        editor.putString("psw", "");
                        editor.clear();
                        editor.apply();
                        match2 = false;
                    }
                    DataTools.user = user;
                    break;
                } else {
                    match = false;
                }
            }
            if (match) {
                Toast.makeText(this, "????????????", Toast.LENGTH_SHORT).show();
                finish();
            } else {
                Toast.makeText(this, "???????????????????????????", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "????????????????????????????????????", Toast.LENGTH_SHORT).show();
        }
    }

}