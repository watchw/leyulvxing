package com.example.qimo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class home_activity_three extends AppCompatActivity {
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> list;
    private ListView listView;
    private String[] text1=new String[]{
            "   1、最日常的且最常用的:",
            "   2、形容词系列:",
            "   3、身体部位系列",
            "   4、动词系列:"

    };
    private String[] text2=new String[]{
            "       啥子(指什么)、婆娘(老婆的意思)、哈哈儿(立刻、马上的意思)、安逸(就是满意、舒服的感觉)、耍朋友(即指谈恋爱)、记倒(记得、记住的意思)、打望(就东张西看，比如看美女、帅哥就是打望)、男娃儿(指男孩)、嫩个(这么，这样)、雄起(加油、打气的意思)、要得(一般指回答好)等等。",
            "       啪唧唧的(指很软)、高耸耸的，肥咚咚的(又高有胖)、神戳戳(发神经)、火瞟瞟的(形容灼伤般的疼)、念栋栋(粘稠的)、逛的(光溜溜的)、亮瓦瓦(很亮，比如形容灯亮)、长的乖(长得漂亮)等等。",
            "       手倒管儿(指手肘)、哈老壳(脑袋)、客西头儿(膝盖)、瞎孔(指胳肢窝)、罗兜/座登儿(都指臀部的，前者多用于人，而后者多用于猪)。",
            "       共过来(挤过来)、款到老(碰到了)、达扑爬(摔跤、摔倒了、打王逛(指精神不集中)、扒到(紧挨着)、卡过来(跨过来)、翻羊角砖儿(翻跟斗)、拈菜(指吃饭夹菜)、打扑汗(打呼噜、打舅鼾)、嗨得(吃得多)、告哈儿(试一下)、舌老(指东西丢失了)、琛过来/痴过来(伸过来)、马起脸(板脸，形容不高兴)、爪瞌睡(打瞌睡)、爪球(踢球)、杀铁(打扫、整理、做清洁、收拾的意思)。\n"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_three);
        listView=(ListView)findViewById(R.id.home_activity_three_list);
        list=new ArrayList<>();
        for (int i=0;i<text1.length;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("text1",text1[i]);
            map.put("text2",text2[i]);
            list.add(map);
        }
        simpleAdapter=new SimpleAdapter(home_activity_three.this,
                list,
                R.layout.home_activity_three_item,
                new String[]{"text1","text2"},
                new int[]{R.id.text1,R.id.text2});
        listView.setAdapter(simpleAdapter);
    }
}