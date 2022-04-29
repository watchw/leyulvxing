package com.example.qimo.News;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.qimo.Base.BaseFragment;
import com.example.qimo.Life.life_second;
import com.example.qimo.Model.News;
import com.example.qimo.R;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * @project qimo
 * @package：com.example.qimo.News
 * @anthor xiangxia
 * @time 4/29/22 12:05 PM
 * @description 描述
 */
public class NewsListFragment extends BaseFragment {

    @BindView(R.id.list_view)
    ListView listView;

    private NewsListListener listener;
    private ArrayList<News> list;
    private NewsListAdapter adapter;

    @Override
    public int bindFMLayout() {
        return R.layout.activity_news_list;
    }

    @Override
    public void bindFMValue(View view, Bundle savedInstanceState) {
        adapter = new NewsListAdapter(getContext());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("news_list", String.valueOf(position));
                Intent intent = new Intent(getActivity(), NewsDetailActivity.class);
                intent.putExtra("data", list.get(position));
                startActivity(intent);
            }
        });
        if (null != listener) {
            list = listener.getData();
            adapter.setData(list);

        }
    }

    public void setListener(NewsListListener listener) {
        this.listener = listener;
    }

    public interface NewsListListener {
        public ArrayList<News> getData();
    }
}
