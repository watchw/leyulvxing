package com.example.qimo.Collection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.qimo.Base.BaseActivity;
import com.example.qimo.Life.LifeAdapter;
import com.example.qimo.Life.LifeDetailActivity;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.Promotion.activity_second;
import com.example.qimo.R;
import com.example.qimo.Tools.DataTools;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CollectionActivity extends BaseActivity {

    @BindView(R.id.list_view)
    ListView listView;

    private ArrayList<ScenicSpot> list;
    private CollectionAdapter adapter;

    @Override
    public int bindContentView() {
        return R.layout.activity_collection;
    }

    @Override
    public void initActivity() {
        list = DataTools.getCollectionPromotionRecommendation();
        adapter = new CollectionAdapter(this);
        adapter.setData(list);
        listView.setAdapter(adapter);

        Context self = this;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(self, activity_second.class);
                intent.putExtra("data", list.get(position));
                startActivity(intent);
            }
        });
    }

}