package com.example.qimo.Tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.qimo.Model.User;

import java.util.ArrayList;

public class DBOpenHelper extends SQLiteOpenHelper {
    private SQLiteDatabase db;

    public DBOpenHelper(@Nullable Context context) {
        super(context,"db_test",null,1);
        db=getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS user(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
        +"name,"
        +"password,"
        +"email)"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);

    }
    public void add(String name,String password,String email){
        db.execSQL("INSERT INTO user (name,password,email) VALUES(?,?,?)",
                new Object[]{name,password,email});
    }
    public void delete(String name,String password){
        db.execSQL("DELETE FROM user WHERE name = AND password ="+name+password);
    }
    public void update(String password){
        db.execSQL("UPDATE user SET password = ?",new Object[]{password});
    }
    public ArrayList<User>getAllDate(){
        ArrayList<User> list=new ArrayList<User>();
        @SuppressLint("Recycle") Cursor cursor=db.query("user",null,null,null,null,null,"name DESC");
        while (cursor.moveToNext()){
            String name=cursor.getString(cursor.getColumnIndex("name"));
            String password=cursor.getString(cursor.getColumnIndex("password"));
            String email=cursor.getString(cursor.getColumnIndex("email"));
            list.add(new User(name,password,email));
        }
        return list;
    }
}
