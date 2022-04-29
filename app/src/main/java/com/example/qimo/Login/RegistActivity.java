package com.example.qimo.Login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qimo.Tools.DBOpenHelper;
import com.example.qimo.MainActivity;
import com.example.qimo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @project qimo
 * @package：com.example.qimo.Login
 * @anthor xiangxia
 * @time 4/28/22 11:46 AM
 * @description 描述
 */
public class RegistActivity extends AppCompatActivity {

    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.et_password1)
    EditText etPassword1;
    @BindView(R.id.button_regist)
    Button buttonRegist;
    @BindView(R.id.button_back)
    TextView buttonBack;
    private DBOpenHelper mdbOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_regist);
        ButterKnife.bind(this);

        mdbOpenHelper = new DBOpenHelper(this);
    }

    @OnClick({R.id.button_regist, R.id.button_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_regist:
                onRegist();
                break;
            case R.id.button_back:
                finish();
                break;
        }
    }

    private void onRegist() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String password2 = etPassword1.getText().toString().trim();
        String mail = etEmail.getText().toString().trim();

        if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password) && !TextUtils.isEmpty(password2) && !TextUtils.isEmpty(mail)) {
            if (password.equals(password2)) {
                mdbOpenHelper.add(username, password, mail);
                Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
                finish();
            } else {
                Toast.makeText(this, "两次密码不同，请重新输入！", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "各项均不能为空", Toast.LENGTH_SHORT).show();
        }
    }
}
