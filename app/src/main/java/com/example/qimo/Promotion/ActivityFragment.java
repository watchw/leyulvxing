package com.example.qimo.Promotion;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.qimo.ActivityViewModel;
import com.example.qimo.R;
import com.example.qimo.activity_second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ActivityFragment extends Fragment {

    private ActivityViewModel mViewModel;

    private TextView title;
    private ViewPagerAdapter adapter;
    private ScheduledExecutorService scheduledExecutorService;
    //轮播图
    private List<ImageView> images;
    private List<View> dots;
    private ViewPager mViewPager;
    private int currentItem;
    //记录上一次点的位置
    private int oldPosition = 0;
    //图片
    private int[] imgid = new int[]{
            R.drawable.dazushike,
            R.drawable.baidicheng,
            R.drawable.jiefangbei
    };
    //图片标题
    private String[] titles=new String[]{
            "大足石刻",
            "白帝城",
            "解放碑"
    };
    private Handler mhandler;
    //listview
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> list;
    private ListView listView;
    private int[] list_img={
            R.drawable.chongjiangsuodao,
            R.drawable.hongyadong,
            R.drawable.jiefangbei,
            R.drawable.chiqikou,
            R.drawable.zazidong
    };
    private String[] list_title=new String[]{
            "长江索道",
            "洪崖洞",
            "解放碑",
            "磁器口",
            "渣滓洞"
    };
    private String[] list_content=new String[]{
            "长江索道，是重庆第二条跨江索道（第一条为嘉陵江索道），已......",
            "洪崖洞，位于解放碑沧白路，长江、嘉陵江两江交汇的滨江地带......",
            "   抗战胜利纪功碑暨人民解放纪念碑，又名“抗战胜利纪功碑”......",
            " 磁器口古镇始建于宋代，拥有“一江两溪三山四街”的独特地貌......",
            "渣滓洞在重庆市歌乐山麓，距离白公馆2.5公里。渣滓洞原是重庆......",
    };
    public static ActivityFragment newInstance() {
        return new ActivityFragment();
    }
    private View mView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.activity_fragment, null);
        //轮播图
        initview();
        //listView
        listView=(ListView)mView.findViewById(R.id.activity_listView);
        list=new ArrayList<>();
        for (int i=0; i<list_title.length; i++){
            Map<String,Object> map=new HashMap();
            map.put("list_img",list_img[i]);
            map.put("list_title",list_title[i]);
            map.put("list_content",list_content[i]);
            list.add(map);
        }
        simpleAdapter=new SimpleAdapter(getActivity(),
                list
                ,R.layout.home_item,
                new String[]{"list_img","list_title","list_content"},
                new int[]{R.id.home_img,R.id.home_title_text, R.id.home_content_text});
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new mClick());

        return mView;

    }

    class mClick implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    Intent intent=new Intent();
                    intent.setClass(getActivity(), activity_second.class);
                    startActivity(intent);
                    break;
            }
        }
    }

    private void initview(){
        mViewPager=(ViewPager)mView.findViewById(R.id.looper_pager_2);
        //显示的图片
        images=new ArrayList<ImageView>();
        for (int i=0;i<imgid.length;i++){
            ImageView imageView=new ImageView(getActivity());
            imageView.setImageResource(imgid[i]);
            images.add(imageView);
        }
        //显示小点
        dots=new ArrayList<View>();
        dots.add(mView.findViewById(R.id.dot_0));
        dots.add(mView.findViewById(R.id.dot_1));
        dots.add(mView.findViewById(R.id.dot_2));

        title=(TextView)mView.findViewById(R.id.title);
        title.setText(titles[0]);

        adapter=new ViewPagerAdapter();
        mViewPager.setAdapter(adapter);

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                title.setText(titles[position]);
                dots.get(position).setBackgroundResource(R.drawable.dot_yes);
                dots.get(oldPosition).setBackgroundResource(R.drawable.dot_no);

                oldPosition=position;
                currentItem=position;
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
     * @author liuyazhuang
     *
     */
    private class ViewPageTask implements Runnable{

        @Override
        public void run() {
            currentItem = (currentItem + 1) % imgid.length;
            mHandler.sendEmptyMessage(0);
        }
    }

    /**
     * 接收子线程传递过来的数据
     */
    private Handler mHandler = new Handler(){
        public void handleMessage(android.os.Message msg) {
            mViewPager.setCurrentItem(currentItem);
        };
    };
    @Override
    public void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        if(scheduledExecutorService != null){
            scheduledExecutorService.shutdown();
            scheduledExecutorService = null;
        }
    }

}
