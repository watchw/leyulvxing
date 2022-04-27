package com.example.qimo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class life_second extends AppCompatActivity {
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> list;
    private ListView listView;
    private int[] img_canting={
            R.drawable.huoguo1,
            R.drawable.huoguo2
    };
    private String[] text_title=new String[]{
            "巴蜀打火锅（重庆店）",
            "重庆老火锅 （重庆总店）"
    };
    private String[] text_content={
            "靖江区      火锅",
            "渝北区      火锅"
    };
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_second);
        listView=(ListView)findViewById(R.id.life_second_listview);
        list=new ArrayList<>();
        for (int i=0;i<10;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("img",img_canting[i%2]);
            map.put("title",text_title[i%2]);
            map.put("content",text_content[i%2]);
            list.add(map);
        }
        simpleAdapter=new SimpleAdapter(life_second.this,
                list,
                R.layout.life_second_item,
                new String[]{"img","title","content"},
                new int[]{R.id.life_second_img,R.id.life_second_text_title,R.id.life_second_text_content});
        listView.setAdapter(simpleAdapter);
    }
}
