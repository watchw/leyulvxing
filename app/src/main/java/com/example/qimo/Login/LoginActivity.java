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

import com.example.qimo.Tools.DBOpenHelper;
import com.example.qimo.MainActivity;
import com.example.qimo.R;
import com.example.qimo.Model.User;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

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
                    break;
                } else {
                    match = false;
                }
            }
            if (match) {
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                String user_name = userName;
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("user_name", user_name);
                startActivity(intent);
            } else {
                Toast.makeText(this, "用户名或密码不正确", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "请输入你的用户名或密码！", Toast.LENGTH_SHORT).show();
        }
    }

}