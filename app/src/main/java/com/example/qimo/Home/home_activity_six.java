package com.example.qimo.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.qimo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class home_activity_six extends AppCompatActivity {
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> list;
    private ListView listView;
    private String[] text1=new String[]{
            "1、重庆轨道交通",
            "2、重庆公交",
            "3、重庆出租车",
            "4、重庆轮船",
            "5、过江索道"

    };
    private String[] text2=new String[]{
            "   现在重庆的轨道交通包括轻轨和地铁，重庆的轻轨不像北京、上海那样拥堵，它穿过森林、楼宇之间，沿着江边而行。",
            "   价格：公交车分普级车和中级车（空调车），普级车起价1元，空调车起价1.5元。运营时间：大多在5:30-21:00，另外也有一些小巴、空调车和环线观光车以及高峰车、夜宵车等。重庆市还有BRT快速公交车，从大渡口区香港城到渝北区重庆火车北站，部分路段采取全封闭运行。\nTIPS：在重庆坐公交时，注意公交车的站点。重庆很多地方都是单行道，下车一个站，返程时有可能要走很远到另一个站坐；有的地方一个地名也有几个公交车站，注意看车站旁的站牌。" ,
            "   价格：重庆主城区的出租车白天起步价8元/3公里，之后每公里1.8元；夜间（22:00-6:00）起步价8.9元/3公里，之后每公里2.25元。",
            "   虽然现在陆上交通非常发达，但重庆两江相汇的地理环境，决定了轮渡仍然是部份沿江居住群众首选的交通工具，主要航线14条。\n游船：每天21:00开船；票价：530-950元；全程：约70小时。",
            "   长江索道：起于渝中区长安寺，横跨长江至南岸区上新街。一根铁索连接两岸，这种独特的城市交通运输方式成为山城的特色，也为重庆增添了一辆独有的“旅游观光车”。\n票价：公交IC卡1.8元/次，现金购票：5元/次。"

    };
    private int[] img=new int[]{
            R.drawable.dittie,
            R.drawable.gongjiao,
            R.drawable.chuzuche,
            R.drawable.lunchuan,
            R.drawable.guojiangshuodao
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_six);
        listView=(ListView)findViewById(R.id.home_activity_six_list);
        list=new ArrayList<>();
        for (int i=0;i<text1.length;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("text1",text1[i]);
            map.put("text2",text2[i]);
            map.put("img",img[i]);
            list.add(map);
        }
        simpleAdapter=new SimpleAdapter(home_activity_six.this,
                list,
                R.layout.home_activity_six_item,
                new String[]{"text1","text2","img"},
                new int[]{R.id.text1,R.id.text2,R.id.img});
        listView.setAdapter(simpleAdapter);
    }
}