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

public class home_activity_two extends AppCompatActivity {
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> list;
    private ListView listView;
    String[] text=new String[]{
            "1. 世界上叫 “雾都”的城市很多，但重庆才是名副其实的“雾都”。",
            "2. 我国的四大火炉（重庆、武汉、长沙、南昌），重庆居首。又热又潮湿，很酸爽！",
            "3. 1935年2月10日，四川省政府在重庆成立，由于抗战(陪都重庆)，1935年7月13日，省政府迁往成都。",
            "4. 三毛出生于重庆南岸黄桷垭。",
            "5. 超高层住宅小区，重庆居全国首位。",
            "6. 重庆北站南广场和北广场，你以为拐个弯就到了吗? 设计真的很……",
            "7. 世界上跨度最大的拱桥是”重庆朝天门长江大桥“，主跨长552米。",
            "8. 重庆皇冠大扶梯是中国第一、亚洲第二长的一级提升坡地大扶梯。（全程运行2分30秒）",
            "9. 我国第一大卧佛是重庆潼南马龙山卧佛",
            "10. 李商隐在夜雨寄北中写到“君问归期未有期，巴山夜雨涨秋池。何当共剪西窗烛，却话巴山夜雨时。” 巴山是今天重庆北碚的缙云山。"
    };
    int[] img=new int[]{
            R.drawable.cq1,
            R.drawable.cq2,
            R.drawable.cq3,
            R.drawable.cq4,
            R.drawable.cq5,
            R.drawable.cq6,
            R.drawable.cq7,
            R.drawable.cq8,
            R.drawable.cq9,
            R.drawable.cq10,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_two);
        listView=(ListView)findViewById(R.id.home_activity_two_list);
        list=new ArrayList<>();
        for (int i=0;i<text.length;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("text",text[i]);
            map.put("img",img[i]);
            list.add(map);
        }
        simpleAdapter=new SimpleAdapter(home_activity_two.this,
                list,
                R.layout.home_activity_two_item,
                new String[]{"text","img"},
                new int[]{R.id.text,R.id.img});
        listView.setAdapter(simpleAdapter);

    }
}