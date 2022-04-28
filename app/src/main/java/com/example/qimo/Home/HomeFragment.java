package com.example.qimo.Home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.qimo.Model.Banner;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.R;
import com.example.qimo.Tools.DataTools;
import com.example.qimo.Promotion.activity_second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeFragment extends Fragment {
    @BindView(R.id.looper_pager)
    ViewPager looperPager;
    @BindView(R.id.dot_0)
    View dot0;
    @BindView(R.id.dot_1)
    View dot1;
    @BindView(R.id.dot_2)
    View dot2;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.lin_tou)
    LinearLayout linTou;
    @BindView(R.id.btn_days)
    Button btnDays;
    @BindView(R.id.btn_zhishi)
    Button btnZhishi;
    @BindView(R.id.btn_fangyan)
    Button btnFangyan;
    @BindView(R.id.btn_1)
    LinearLayout btn1;
    @BindView(R.id.btn_meihsi)
    Button btnMeihsi;
    @BindView(R.id.btn_ct)
    Button btnCt;
    @BindView(R.id.btn_chuxing)
    Button btnChuxing;
    @BindView(R.id.btn_2)
    LinearLayout btn2;
    @BindView(R.id.huodong)
    LinearLayout huodong;
    @BindView(R.id.home_listView)
    ListView homeListView;

    private ViewPagerAdapter adapter;
    private ScheduledExecutorService scheduledExecutorService;

    //轮播图
    private List<ImageView> images;
    private List<View> dots;
    private int currentItem;
    //记录上一次点的位置
    private int oldPosition = 0;

    private SimpleAdapter simpleAdapter;

    private Handler mhandler;


    private ArrayList<Banner> banners;
    private ArrayList<ScenicSpot> scenicSpots;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        banners = DataTools.getHomeBanner();
        initBanner();

        scenicSpots = DataTools.getHomeRecommendation();
        ArrayList<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < scenicSpots.size(); i++) {
            ScenicSpot scenicSpot = scenicSpots.get(i);
            Map<String, Object> map = new HashMap();
            map.put("list_img", scenicSpot.img);
            map.put("list_title", scenicSpot.title);
            map.put("list_content", scenicSpot.subtitle);
            list.add(map);
        }

        simpleAdapter = new SimpleAdapter(getActivity(),
                list
                , R.layout.home_item,
                new String[]{"list_img", "list_title", "list_content"},
                new int[]{R.id.home_img, R.id.home_title_text, R.id.home_content_text});
        homeListView.setAdapter(simpleAdapter);
        homeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("position", String.valueOf(position));
                Intent intent = new Intent();
                intent.setClass(getActivity(), activity_second.class);
                startActivity(intent);
            }
        });
    }

    @OnClick({R.id.btn_days, R.id.btn_zhishi, R.id.btn_fangyan, R.id.btn_meihsi, R.id.btn_ct, R.id.btn_chuxing})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_days:
                Intent intent = new Intent(getActivity(), home_activity_one.class);
                startActivity(intent);
//                Intent intent = new Intent(getActivity(), LoginActivity.class);
//                startActivity(intent);
                break;
            case R.id.btn_zhishi:
                Intent intent1 = new Intent(getActivity(), home_activity_two.class);
                startActivity(intent1);
                break;
            case R.id.btn_fangyan:
                Intent intent2 = new Intent(getActivity(), home_activity_three.class);
                startActivity(intent2);
                break;
            case R.id.btn_meihsi:
                Intent intent3 = new Intent(getActivity(), home_activity_four.class);
                startActivity(intent3);
                break;
            case R.id.btn_ct:
                Intent intent4 = new Intent(getActivity(), home_activity_five.class);
                startActivity(intent4);
                break;
            case R.id.btn_chuxing:
                Intent intent5 = new Intent(getActivity(), home_activity_six.class);
                startActivity(intent5);
                break;
        }
    }

    private void initBanner() {
        //显示的图片
        images = new ArrayList<ImageView>();
        for (int i = 0; i < banners.size(); i++) {
            Banner banner = banners.get(i);
            ImageView imageView = new ImageView(getActivity());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(banner.url);
            images.add(imageView);
        }
        //显示小点
        dots = new ArrayList<View>();
        dots.add(dot0);
        dots.add(dot1);
        dots.add(dot2);

        Banner banner = banners.get(0);
        title.setText(banner.title);

        adapter = new ViewPagerAdapter();
        looperPager.setAdapter(adapter);

        looperPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Banner banner = banners.get(position);
                title.setText(banner.title);
                dots.get(position).setBackgroundResource(R.drawable.dot_yes);
                dots.get(oldPosition).setBackgroundResource(R.drawable.dot_no);

                oldPosition = position;
                currentItem = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public class ViewPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return images.size();
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        @Override
        public void destroyItem(ViewGroup view, int position, Object object) {
            // TODO Auto-generated method stub
//          super.destroyItem(container, position, object);
//          view.removeView(view.getChildAt(position));
//          view.removeViewAt(position);
            view.removeView(images.get(position));
        }

        @Override
        public Object instantiateItem(ViewGroup view, int position) {
            // TODO Auto-generated method stub
            view.addView(images.get(position));
            return images.get(position);
        }

    }

    /**
     * 利用线程池定时执行动画轮播
     */
    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(
                new ViewPageTask(),
                2,
                2,
                TimeUnit.SECONDS);
    }

    /**
     * 图片轮播任务
     *
     * @author liuyazhuang
     */
    private class ViewPageTask implements Runnable {

        @Override
        public void run() {
            currentItem = (currentItem + 1) % banners.size();
            mHandler.sendEmptyMessage(0);
        }
    }

    /**
     * 接收子线程传递过来的数据
     */
    private Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            looperPager.setCurrentItem(currentItem);
        }

        ;
    };

    @Override
    public void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            scheduledExecutorService = null;
        }
    }

}
