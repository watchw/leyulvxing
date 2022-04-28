package com.example.qimo.Life;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.qimo.Model.Life;
import com.example.qimo.R;
import com.example.qimo.Tools.DataTools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class life_second extends AppCompatActivity {
    @BindView(R.id.life_second_listview)
    ListView lifeSecondListview;

    private SimpleAdapter simpleAdapter;

    private int[] img_canting = {
            R.drawable.huoguo1,
            R.drawable.huoguo2
    };
    private String[] text_title = new String[]{
            "巴蜀打火锅（重庆店）",
            "重庆老火锅 （重庆总店）"
    };
    private String[] text_content = {
            "靖江区      火锅",
            "渝北区      火锅"
    };

    private List<Map<String,Object>> list;

//    private ArrayList<Life> list;
//    private LifeAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_second);
        ButterKnife.bind(this);

        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("img", img_canting[i % 2]);
            map.put("title", text_title[i % 2]);
            map.put("content", text_content[i % 2]);
            list.add(map);
        }
        simpleAdapter = new SimpleAdapter(life_second.this,
                list,
                R.layout.life_second_item,
                new String[]{"img", "title", "content"},
                new int[]{R.id.life_second_img, R.id.life_second_text_title, R.id.life_second_text_content});
        lifeSecondListview.setAdapter(simpleAdapter);
        lifeSecondListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("position", String.valueOf(position));
            }
        });

//        list = DataTools.getLifes(0);
//        initView();
    }

    private void initView() {
//        adapter = new LifeAdapter(getBaseContext());
//        adapter.setData(list);
//        lifeSecondListview.setAdapter(adapter);
//        lifeSecondListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("position", String.valueOf(position));
//            }
//        });
    }
}
