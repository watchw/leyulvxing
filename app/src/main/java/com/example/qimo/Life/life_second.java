package com.example.qimo.Life;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.qimo.Model.Life;
import com.example.qimo.R;
import com.example.qimo.Tools.DataTools;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class life_second extends AppCompatActivity {
    @BindView(R.id.life_second_listview)
    ListView lifeSecondListview;
    @BindView(R.id.search_view)
    SearchView searchView;

    private int tag;
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
        tag = getIntent().getIntExtra("tag", 0);
        Log.e("life_second-tag", String.valueOf(tag));
        list = DataTools.getLifes(tag);

        adapter = new LifeAdapter(getBaseContext());
        adapter.setData(list);
        lifeSecondListview.setAdapter(adapter);
        Context self = this;
        lifeSecondListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(self, LifeDetailActivity.class);
                intent.putExtra("data", list.get(position));
                startActivity(intent);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                //点击软键盘搜索的时候执行
                Log.i("dd", "ddddd123");
                ArrayList<Life> list2 = new ArrayList<Life>();
                for(int i=0;i<list.size();i++){
                    Life life = list.get(i);
                    if(life.title.indexOf(s)!=-1){
                        list2.add(life);
                    }else if (life.subtitle.indexOf(s)!=-1){
                        list2.add(life);
                    }
                }
                adapter.setData(list2);
                lifeSecondListview.setAdapter(adapter);

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                //搜索框文本发生改变的时候执行
                if(s.equals("")){
                    adapter.setData(list);
                    lifeSecondListview.setAdapter(adapter);
                }
                return false;
            }
        });
    }
}
