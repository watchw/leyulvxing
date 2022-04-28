package com.example.qimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.qimo.Tools.DBOpenHelper;

public class user_second extends AppCompatActivity {
    private DBOpenHelper mdbOpenHelper;
    private EditText reg_username;
    private EditText reg_password;
    private EditText reg_password2;
    private EditText reg_mail;
    private Button reg_btn_sure;
    private Button reg_btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_second);

        reg_username = (EditText) findViewById(R.id.reg_username);
        reg_password = (EditText) findViewById(R.id.reg_password);
        reg_password2 = (EditText) findViewById(R.id.reg_password2);
        reg_mail = (EditText) findViewById(R.id.reg_mail);
        reg_btn_sure = (Button) findViewById(R.id.reg_btn_sure);
        reg_btn_login = (Button) findViewById(R.id.reg_btn_login);
        reg_btn_sure.setOnClickListener(new RegisterButton());
        reg_btn_login.setOnClickListener(new RegisterButton());
        mdbOpenHelper=new DBOpenHelper(this);
    }
    public class RegisterButton implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            String username = reg_username.getText().toString().trim();
            String password = reg_password.getText().toString().trim();
            String password2 = reg_password2.getText().toString().trim();
            String mail = reg_mail.getText().toString().trim();
            switch (v.getId()) {
                //注册开始，判断注册条件
                case R.id.reg_btn_sure:
                    if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password) && !TextUtils.isEmpty(password2) && !TextUtils.isEmpty(mail)) {
                        if(password.equals(password2)){
                            mdbOpenHelper.add(username,password,mail);
                            Intent intent = new Intent(user_second.this, MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(user_second.this,"注册成功",Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(user_second.this,"两次密码不同，请重新输入！",Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(user_second.this, "各项均不能为空", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.reg_btn_login:
                    Intent intent = new Intent(user_second.this, MainActivity.class);
                    startActivity(intent);

                    break;

            }
        }



    }
//    public class sixAction implements View.OnClickListener{
//
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()){
//                case R.id.reg_btn_login:
//                    Intent intent = new Intent(user_second.this, UserFragment.class);
//                    startActivity(intent);
//                    break;
//            }
//        }
//    }
}
