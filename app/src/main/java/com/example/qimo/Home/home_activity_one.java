package com.example.qimo.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.qimo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class home_activity_one extends AppCompatActivity {
    private String[] name = new String[]{
            "报警电话",
            "火警电话",
            "医疗急救电话",
            "道路交通事故报警台 ",
            "查号台",
            "水上求救",
            "短信报警号码",
            "非紧急救助中心",
            "职务犯罪举报 ",
            "消费者投诉热线 ",
            "价格投诉热线 ",
            "质量投诉",
            "法律援助",
            "环保投诉",
            "铁路",
            "东航",
            "厦航"
    };
    private String[] numb = new String[]{
            "110",
            "119",
            "120",
            "122",
            "114",
            "12395",
            "12110",
            "12345",
            "12309",
            "12315",
            "12358",
            "12365",
            "12351",
            "12369",
            "12306",
            "95530",
            "95557"
    };
    private SimpleAdapter simpleAdapter;
    private List<Map<String, Object>> list;
    private EditText editText;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_one);
        listView = findViewById(R.id.home_activity_one_list);
        list = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", name[i]);
            map.put("numb", numb[i]);
            list.add(map);
        }
        simpleAdapter = new SimpleAdapter(home_activity_one.this,
                list,
                R.layout.home_activity_one_item,
                new String[]{"name", "numb"},
                new int[]{R.id.name, R.id.numb});
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("position", String.valueOf(position));
            }
        });
    }
}