package com.example.qimo.Promotion;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.qimo.Model.Banner;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.R;
import com.example.qimo.Tools.DataTools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityFragment extends Fragment {
    @BindView(R.id.spinner)
    Spinner spinner;
    @BindView(R.id.spinner2)
    Spinner spinner2;
    @BindView(R.id.top)
    LinearLayout top;
    @BindView(R.id.looper_pager_2)
    ViewPager looperPager2;
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
    @BindView(R.id.activity_listView)
    ListView activityListView;

    private ViewPagerAdapter adapter;
    private ScheduledExecutorService scheduledExecutorService;
    //轮播图
    private List<ImageView> images;
    private List<View> dots;
    private int currentItem;
    //记录上一次点的位置
    private int oldPosition = 0;

    private Handler mhandler;

    private SimpleAdapter simpleAdapter;

    public static ActivityFragment newInstance() {
        return new ActivityFragment();
    }

    private ArrayList<Banner> banners;
    private ArrayList<ScenicSpot> scenicSpots;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.i("spinner", String.valueOf(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.i("spinner2", String.valueOf(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        banners = DataTools.getPromotionBanner();
        initBanner();

        scenicSpots = DataTools.getPromotionRecommendation();
        initList();
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
        looperPager2.setAdapter(adapter);

        looperPager2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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

    private void initList() {
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
        activityListView.setAdapter(simpleAdapter);
        activityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("position", String.valueOf(position));
                if (position == 0){
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), activity_three.class);
                    startActivity(intent);
                }
                else if (position == 1){
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), activity_second.class);
                    startActivity(intent);
                }
                else if (position == 2){
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), activity_four.class);
                    startActivity(intent);
                }
                else if (position == 3){
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), activity_five.class);
                    startActivity(intent);
                }


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
            looperPager2.setCurrentItem(currentItem);
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
