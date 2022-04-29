package com.example.qimo.News;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.qimo.Base.BaseFragment;
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
        if (null != listener) {
            adapter.setData(listener.getData());
        }
    }

    public void setListener(NewsListListener listener) {
        this.listener = listener;
    }

    public interface NewsListListener {
        public ArrayList<News> getData();
    }
}
