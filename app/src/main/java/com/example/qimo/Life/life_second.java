package com.example.qimo.Life;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.qimo.Home.HomeDetailActivity;
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

    private ArrayList<Life> list;
    private LifeAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_second);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        int tag = getIntent().getIntExtra("tag", 0);
        Log.e("life_second-tag", String.valueOf(tag));
        list = DataTools.getLifes(tag);

        adapter = new LifeAdapter(getBaseContext());
        adapter.setData(list);
        lifeSecondListview.setAdapter(adapter);
        Context self = this;
        lifeSecondListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("position123", String.valueOf(position));
                Intent intent = new Intent();
                intent.setClass(self, LifeDetailActivity.class);
                intent.putExtra("data", list.get(position));
                startActivity(intent);
            }
        });
    }
}
