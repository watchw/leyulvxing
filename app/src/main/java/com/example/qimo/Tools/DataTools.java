package com.example.qimo.Tools;

import com.example.qimo.Model.Banner;
import com.example.qimo.Model.Life;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.R;

import java.util.ArrayList;
import java.util.Dictionary;

/**
 * @project qimo
 * @package：com.example.qimo.Tools
 * @anthor xiangxia
 * @time 4/28/22 2:25 PM
 * @description 描述
 */
public class DataTools {

    public static ArrayList getHomeBanner() {
        ArrayList<Banner> list = new ArrayList<Banner>();
        list.add(new Banner("磁器口", R.drawable.chiqikou));
        list.add(new Banner("长江索道", R.drawable.chongjiangsuodao));
        list.add(new Banner("洪崖洞", R.drawable.hongyadong));
        return list;
    }

    public static ArrayList getHomeRecommendation() {
        ArrayList<ScenicSpot> list = new ArrayList<ScenicSpot>();
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "磁器口";
            scenicSpot.subtitle = "磁器口古镇始建于宋代，拥有“一江两溪三山四街”的独特地貌......";
            scenicSpot.img = R.drawable.chiqikou;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "渣滓洞";
            scenicSpot.subtitle = "渣滓洞在重庆市歌乐山麓，距离白公馆2.5公里。渣滓洞原是重庆.....";
            scenicSpot.img = R.drawable.zazidong;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "长江索道";
            scenicSpot.subtitle = "长江索道，是重庆第二条跨江索道（第一条为嘉陵江索道），已......";
            scenicSpot.img = R.drawable.chongjiangsuodao;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "洪崖洞";
            scenicSpot.subtitle = "洪崖洞，位于解放碑沧白路，长江、嘉陵江两江交汇的滨江地带......";
            scenicSpot.img = R.drawable.hongyadong;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "解放碑";
            scenicSpot.subtitle = "抗战胜利纪功碑暨人民解放纪念碑，又名“抗战胜利纪功碑”......";
            scenicSpot.img = R.drawable.jiefangbei;
            list.add(scenicSpot);
        }
        return list;
    }

    public static ArrayList getPromotionBanner() {
        ArrayList<Banner> list = new ArrayList<Banner>();
        list.add(new Banner("大足石刻", R.drawable.dazushike));
        list.add(new Banner("白帝城", R.drawable.baidicheng));
        list.add(new Banner("解放碑", R.drawable.jiefangbei));
        return list;
    }

    public static ArrayList getPromotionRecommendation() {
        ArrayList<ScenicSpot> list = new ArrayList<ScenicSpot>();
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "渣滓洞";
            scenicSpot.subtitle = "渣滓洞在重庆市歌乐山麓，距离白公馆2.5公里。渣滓洞原是重庆.....";
            scenicSpot.img = R.drawable.zazidong;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "长江索道";
            scenicSpot.subtitle = "长江索道，是重庆第二条跨江索道（第一条为嘉陵江索道），已......";
            scenicSpot.img = R.drawable.chongjiangsuodao;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "洪崖洞";
            scenicSpot.subtitle = "洪崖洞，位于解放碑沧白路，长江、嘉陵江两江交汇的滨江地带......";
            scenicSpot.img = R.drawable.hongyadong;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "解放碑";
            scenicSpot.subtitle = "抗战胜利纪功碑暨人民解放纪念碑，又名“抗战胜利纪功碑”......";
            scenicSpot.img = R.drawable.jiefangbei;
            list.add(scenicSpot);
        }
        return list;
    }

    public static ArrayList<Life> getLifes(int tag) {
        ArrayList<Life> list = new ArrayList<Life>();
        if (tag == 0) {
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo1;
                life.title = "巴蜀打火锅（重庆店）";
                life.subtitle = "靖江区      火锅";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo2;
                life.title = "重庆老火锅 （重庆总店）";
                life.subtitle = "渝北区      火锅";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo1;
                life.title = "巴蜀打火锅（重庆店）";
                life.subtitle = "靖江区      火锅";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo1;
                life.title = "巴蜀打火锅（重庆店）";
                life.subtitle = "靖江区      火锅";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo1;
                life.title = "巴蜀打火锅（重庆店）";
                life.subtitle = "靖江区      火锅";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo1;
                life.title = "巴蜀打火锅（重庆店）";
                life.subtitle = "靖江区      火锅";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo1;
                life.title = "巴蜀打火锅（重庆店）";
                life.subtitle = "靖江区      火锅";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.huoguo1;
                life.title = "巴蜀打火锅（重庆店）";
                life.subtitle = "靖江区      火锅";
                list.add(life);
            }
        } else if (tag == 1) {

        }
        return list;
    }
}
