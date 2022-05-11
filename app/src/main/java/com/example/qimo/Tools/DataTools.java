package com.example.qimo.Tools;

import com.example.qimo.Model.Banner;
import com.example.qimo.Model.Life;
import com.example.qimo.Model.News;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.Model.User;
import com.example.qimo.R;

import java.util.ArrayList;

/**
 * @project qimo
 * @package：com.example.qimo.Tools
 * @anthor xiangxia
 * @time 4/28/22 2:25 PM
 * @description 描述
 */
public class DataTools {

    public static User user = null;

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
            scenicSpot.detail="      来磁器口古镇，这个当年热闹的水陆码头，踩踩青石板路，品尝当地的美食小吃，找个茶馆坐坐，感受下老重庆的风土人情。因为距离市区很近，如今的古镇也是市民休闲娱乐的好去处。\n" +
                    "      根据指示牌游玩即可\n" +
                    "      古镇有十几条街巷，两旁边都是明清风格的建筑，古镇不大，根据指示牌步行游览完全没有问题。虽然游客眼前的一切，都是近年来重新翻新的，不过这并不影响你在这里感受“老重庆”。\n" +
                    "      镇上有不少景点\n" +
                    "      钟家院、通家院等是古镇中典型的川东山地民居，值得一看。镇上的宝轮寺，有千年历史，可以敬香祈福。街边还有不少茶馆，找一家坐坐，当年的水手、袍哥大爷等都喜爱出入此间。喝茶的同时，有机会欣赏到当地的民间艺术，如：川剧坐唱、四川清音等。\n" +
                    "      当地知名小吃：陈麻花\n" +
                    "      古镇内能够品尝到很多当地的美食和小吃。毛血旺、千张皮和椒盐花生是镇上的“美食三绝”。更出名的是“陈麻花”，镇上有很多家“陈麻花”，哪家正宗？可以看看哪家门店前排队排的长。\n" +
                    "      古镇距离歌乐山的白公馆、渣滓洞不算远，可以一并游玩。";
            scenicSpot.subtitle="4A级景区  巴渝古镇  古村落";
            scenicSpot.time="全年 10：00-20：00";
            scenicSpot.address="地址：重庆市沙坪坝区磁器口古镇";
            scenicSpot.phone="023-65010003";
            scenicSpot.img = R.drawable.detail_ciqikou;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.title = "龚滩古镇";
            scenicSpot.detail="      龚滩古镇坐落于乌江之畔，因滩而起，因盐而兴，距今已有1800余年历史，是国家历史文化名镇，被誉为“中国十大古村镇”。\n" +
                    "      沿江而建的吊脚楼群被誉为“绝壁上的音符”，乌江百里画廊尽收眼底，江对岸壁立千仞、鬼斧神工。\n" +
                    "      从龚滩古镇沿乌江溯水而上，经土坨子峡、白芨峡，直至荔枝峡，是乌江百里画廊的精华，清代诗人梅若翁有诗赞曰“蜀中山水奇，应推此第一。”\n" +
                    "      古镇不大，闲逛的话两三小时也就逛遍了。逛累了可以去老街，这里集中古镇的很多美食，吃吃香菌丸子、老腊肉炒山蕨巴、猪蹄风萝卜、凉豆腐、豆花等古镇美食。古镇也有多家客栈，如果喜欢古镇的悠闲，不妨小住两天，也是不错的选择。" ;
            scenicSpot.subtitle="4A级景区  巴渝古镇  古村落";
            scenicSpot.time="2/18-12/31 08：00-22：00";
            scenicSpot.address="地址: 重庆市酉阳县龚滩古镇207号";
            scenicSpot.phone="023-75706888,023-75677000,023-75582277";
            scenicSpot.img = R.drawable.detail_gongtanguzhen;
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.img=R.drawable.detail_youyangtaohuayuan;
            scenicSpot.title="酉阳桃花源";
            scenicSpot.subtitle="5A级景区  桃花源  山城的山  4.7分";
            scenicSpot.detail="      酉阳桃花源景区现为国家AAAAA旅游景区、国家森林公园，位于渝、鄂、湘、黔四省市结合部的武陵山区腹地，距重庆市主城360公里，总面积50平方公里。集岩溶地质奇观、秦晋农耕文化、土家民俗文化、自然生态文化于一体，浓缩了中国武陵山区美的原生态自然田园风光，传承着土家族、苗族悠久的人文历史与灿烂的民族文化。是现代人们远离尘世喧嚣、步入秦晋田园、探寻地质奇观、回归绿色天堂的理想旅游目的地。先后入选“十大文化休闲旅游品牌景区”、“中国具国际影响力旅游品牌”和央视“舒适景区排行榜”。\n" +
                    "        景区由世外桃源、太古洞、酉州古城、桃花源森林公园、桃花源广场、桃花源风情小镇、二酉山世外桃源文化主题公园、桃源大舞台八部分组成。因自古武陵山地区“蛮不出洞、汉不入境”的皇命戒律，景区在武陵大山中沉睡了1600余年。据《酉阳直隶州总志》记载：“核其形，与渊明所记桃花源者，毫厘不爽。”另据《四川通志》记载：“酉阳汉属武陵郡之迁陵地，渔郎所问之津，安知不在于此？”国内外专家、学者从地理、路线、景物、历史、距离和环境等六个方面论证，一致认定这里就是陶渊明笔下的《桃花源记》原型。\n" +
                    "        景区有优美的自然田园风光，悠久的人文历史，灿烂的民族文化，浓郁的民族风情。保留和传承的土家摆手舞、酉阳民歌、木叶情歌、西兰卡普等民俗文化独特完整。古桃源桃林夹岸、芳草鲜美、落英缤纷，土地平旷、阡陌纵横、良田美池、村落点布。伏羲洞规模庞大，溶洞内沉积物千姿百态，被“中国天坑之父”朱学稳称赞为“地下石林、世界奇观”。";
            scenicSpot.time="3/1-10/30 08:00-17:30;11/1-2/28 08:00-17:00";
            scenicSpot.address="地址：重庆市酉阳土家族苗族自治县境内县桃花源路232号";
            scenicSpot.phone="023-75559222,400-872-9008,023-75766888";
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.img=R.drawable.detail_hongyadong;
            scenicSpot.title="洪崖洞";
            scenicSpot.subtitle="4A级景区  立体式步行街  红火夜景  4.6分";
            scenicSpot.detail="      洪崖洞民俗风貌区是逛山城老街、观赏两江风光、品尝当地美食的好去处。洪崖洞商业街位于渝中区沧白路，长江、嘉陵江两江交汇的滨江地带，以具有巴渝传统建筑特色的“吊脚楼”为主体，依山就势，沿江而建。\n" +
                    "      夜景美爆了\n" +
                    "      洪崖洞民俗风貌区由纸盐河酒吧街、天成巷巴渝风情街、盛宴美食街及异域风情城市阳台四部分组成，以具有巴渝传统建筑特色的吊脚楼为主体，依山就势，通过分层筑台、吊脚、错叠、临崖等山地建筑手法，把这一片建筑汇聚在一起，夜晚时候灯火通明，堪称山城一景。\n" +
                    "      美食、购物、观景\n" +
                    "      走进洪崖洞民俗风貌区两边都是密集的吊脚楼。从脚下的沿江路到顶层的沧白路有11层之多。各层内容不同，有餐馆、有小吃街、有酒吧咖啡厅，也有土特产商铺。顶层是异域风情城市阳台，可乘坐电梯直达。站在观景平台上，可远观两江交汇，风光无限。\n" ;
            scenicSpot.time="全年 11：00-23：00";
            scenicSpot.address="地址：重庆市渝中区滨江路88号（嘉陵江畔）";
            scenicSpot.phone="023-63039995,023-63039853";
            list.add(scenicSpot);
        }
        if (true) {
            ScenicSpot scenicSpot = new ScenicSpot();
            scenicSpot.img=R.drawable.detail_simianshan;
            scenicSpot.title="四面山";
            scenicSpot.subtitle="5A级景区  爱情天梯  山城的山   4.5分";
            scenicSpot.detail="      四面山景区位于重庆西南部，距重庆主城、四川泸州、贵州遵义均100余公里，处于渝川黔旅游金三角核心地带，是距离重庆主城很近的国家5A级旅游景区和度假区，仅1.5小时即可抵达，距江津城区60余公里，属云贵高原大娄山北翼余脉，系地质学上的倒置山。景区于1988年被确定为“重庆市级自然保护区”， 2014年被评为“重庆首批市级旅游度假区”“影响世界的中国文化旅游名景”，2015年被评为“国家5A级旅游景区”“国家生态旅游示范区”“中国森林氧吧”。2017年被评为“国家体育产业示范单位”，2019年被评为“中国（重庆）气候旅游目的地”，2020年被评为“中国气候康养地”。\n" +
                    "      景区幅员面积213.37平方公里，主要有望乡台、土地岩、龙潭湖、洪海、珍珠湖、水口寺、会龙庄、爱情天梯等核心景区，128个景点，自然景观独特、生态环境优美、旅游资源丰富，极具游憩价值，是休闲度假的旅游目的地。因其好山好水、富硒富氧而备受关注，被国际生态学会专家誉为全球植被丰、水质佳、空气纯的地区之一。\n";
            scenicSpot.time="全年 08:00-18:00";
            scenicSpot.address="地址：重庆市江津区四面山镇";
            scenicSpot.phone="023-47666888,023-47666559";
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

    public static ArrayList<ScenicSpot> getCollectionPromotionRecommendation() {
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

    public static ArrayList<Life> getSearchLifes(int tag) {
        ArrayList<Life> list = new ArrayList<Life>();
        if (tag == 0) {
            if (true) {
                Life life = new Life();
                life.img = R.drawable.pingjieguoguo;
                life.title = "萍姐火锅·公路夜市";
                life.subtitle = "观音桥      重庆火锅";
                life.detail="        萍姐火锅是由亚特餐饮打造的火锅品牌，作为近几年以来快速崛起的餐饮新势力，将重庆火锅传统的商业模式，从定位、产品、媒介、流星、空间、内容等进行了跨时代的全方位升级，核心爆品战略、全网媒介互通、网红IP打造等。让传统的重庆火锅元素结合当下的商业诉求，提升到了新的高度，焕发出不一样的生机与活力，旗下品牌卤校长火锅、全网流量过十亿，品牌总店数超200+，占据全国火锅商业市场半壁江山，成为了新一代重庆火锅的标杆品牌。亚特餐饮将不懈追求，努力奋进，致力于重庆火锅文化发扬光大，全力将重庆火锅带出一个新的天地。";
                life.star="4.4";
                life.time="11:30-14:00, 16:00-00:00";
                life.keywords="有卫生间  空调开放  免费WiFi 可手机充电 可自助点餐";
                life.recommend="耙鸡爪¥23  凤尾发鱿鱼¥22  萍姐火锅  白桃乌龙拿铁¥16\n" +
                        "耙肥肠¥28  鲜椒牛肉¥26  麻辣牛肉¥26  耙牛肉";
                life.recommend_title="菜品推荐:";
                life.phone="023 6752 8886";
                life.address="地址：重庆市江北区观音桥北城天街HM正对面天天尚街2楼";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yudashi;
                life.title = "渝大狮毛肚火锅（南坪总店）";
                life.subtitle = "南坪      重庆火锅";
                life.detail="        1918年 “渝⼤狮”前身“巴⼈⽔⼋块”在重庆刘家台码头诞⽣。1997 年， “巴⼈⽔⼋块”后⼈继承祖业，成⽴“巴⼈⽕锅城”。2010年，“巴⼈⽕锅城”正式更名“红今渝”。2016年“红今渝”再次更名为“渝⼤狮”，⾃此开启⽕爆模式！\n" +
                        "        渝⼤狮还原唐朝酒楼，⻔匾式招牌，内设京剧或书法表演等，古⾊古⾹古韵。意重、氛烈、志狂、质上、价中、菜丰、堂美、味浓。所谓 “正宗王者味，百年⽼⽕锅”！ 正统渝派⽼⽕锅，独特的意境菜创新。⼝感地道、菜品精致、服务优良，给顾客极致的⽕锅体验。⻓年登美团、⼤众点评热⻔榜、环境榜、⼈⽓榜、好评榜第⼀名。";
                life.star="4.9";
                life.time="11:00-03:00";
                life.keywords="有卫生间  付费停车  免费WiFi 有包厢 空调开放";
                life.recommend="步步高升¥32  麻辣牛肉¥25  冰川海鸭肠  鲜鸭血¥6 \n" +
                        "自磨黑豆腐¥8  鲜椒牛肉¥26  精品鲜猪黄喉¥26  自助西瓜";
                life.recommend_title="菜品推荐:";
                life.phone=" 023-62829995";
                life.address="地址：重庆市南岸区南坪东路15号2楼";
                list.add(life);
            }
        }
        return list;
    }

    public static ArrayList<Life> getLifes(int tag) {
        ArrayList<Life> list = new ArrayList<Life>();
        if (tag == 0) {
            if (true) {
                Life life = new Life();
                life.img = R.drawable.pingjieguoguo;
                life.title = "萍姐火锅·公路夜市";
                life.subtitle = "观音桥      重庆火锅";
                life.detail="        萍姐火锅是由亚特餐饮打造的火锅品牌，作为近几年以来快速崛起的餐饮新势力，将重庆火锅传统的商业模式，从定位、产品、媒介、流星、空间、内容等进行了跨时代的全方位升级，核心爆品战略、全网媒介互通、网红IP打造等。让传统的重庆火锅元素结合当下的商业诉求，提升到了新的高度，焕发出不一样的生机与活力，旗下品牌卤校长火锅、全网流量过十亿，品牌总店数超200+，占据全国火锅商业市场半壁江山，成为了新一代重庆火锅的标杆品牌。亚特餐饮将不懈追求，努力奋进，致力于重庆火锅文化发扬光大，全力将重庆火锅带出一个新的天地。";
                life.star="4.4";
                life.time="11:30-14:00, 16:00-00:00";
                life.keywords="有卫生间  空调开放  免费WiFi 可手机充电 可自助点餐";
                life.recommend="耙鸡爪¥23  凤尾发鱿鱼¥22  萍姐火锅  白桃乌龙拿铁¥16\n" +
                        "耙肥肠¥28  鲜椒牛肉¥26  麻辣牛肉¥26  耙牛肉";
                life.recommend_title="菜品推荐:";
                life.phone="023 6752 8886";
                life.address="地址：重庆市江北区观音桥北城天街HM正对面天天尚街2楼";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yudashi;
                life.title = "渝大狮毛肚火锅（南坪总店）";
                life.subtitle = "南坪      重庆火锅";
                life.detail="        1918年 “渝⼤狮”前身“巴⼈⽔⼋块”在重庆刘家台码头诞⽣。1997 年， “巴⼈⽔⼋块”后⼈继承祖业，成⽴“巴⼈⽕锅城”。2010年，“巴⼈⽕锅城”正式更名“红今渝”。2016年“红今渝”再次更名为“渝⼤狮”，⾃此开启⽕爆模式！\n" +
                        "        渝⼤狮还原唐朝酒楼，⻔匾式招牌，内设京剧或书法表演等，古⾊古⾹古韵。意重、氛烈、志狂、质上、价中、菜丰、堂美、味浓。所谓 “正宗王者味，百年⽼⽕锅”！ 正统渝派⽼⽕锅，独特的意境菜创新。⼝感地道、菜品精致、服务优良，给顾客极致的⽕锅体验。⻓年登美团、⼤众点评热⻔榜、环境榜、⼈⽓榜、好评榜第⼀名。";
                life.star="4.9";
                life.time="11:00-03:00";
                life.keywords="有卫生间  付费停车  免费WiFi 有包厢 空调开放";
                life.recommend="步步高升¥32  麻辣牛肉¥25  冰川海鸭肠  鲜鸭血¥6 \n" +
                        "自磨黑豆腐¥8  鲜椒牛肉¥26  精品鲜猪黄喉¥26  自助西瓜";
                life.recommend_title="菜品推荐:";
                life.phone=" 023-62829995";
                life.address="地址：重庆市南岸区南坪东路15号2楼";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.laoganjia;
                life.title = "老甘家小龙虾江湖菜";
                life.subtitle = "观音桥      小龙虾";
                life.detail="        说到小龙虾，老甘家绝对是重庆的一块金字招牌。作为重庆小龙虾品牌的头牌，老甘家人气爆棚，每到饭点餐厅门口都是熙熙攘攘排队的人群，其火爆程度可见一斑。\\n\n" +
                        "        作为重庆小龙虾江湖菜的扛把子，老甘家成立于 2015年，由“百味甘记餐饮管理有限公司”甘浩先生发起创立，主营小龙虾、江湖菜。老甘家自成立以来,秉承“用真材实料，做最好吃的菜品”，精选食材，匠心烹饪。\n" +
                        "        老甘家的小龙虾可是从湖里捞出来的每100斤虾里挑选出的1斤极品虾，百里挑一的工程，个大鲜美，肥硕有黄，皮薄肉嫩，XLLLL大码龙虾。同时，老甘家小龙虾还拥有专业的技术研发团队，定期研发新品，层出不穷创意十足的新品总能引起广大食客的关注和青睐。\n" +
                        "        镇店之菜一招牌蒜蓉虾可以说一吃惊艳。大蒜是小龙虾的绝配，选用高品质小龙虾，只用大量的蒜、洋葱等烹煮，更能体现美味的龙虾香鲜滋味，让人爱不释口。除了小龙虾，老甘家小龙虾的江湖菜也是可圈可点。辣子田螺、碳烤内蒙羊肉、冷吃牛肉、招牌蒜蓉花甲、秋秋妹耙凤爪等都是好评如潮的特色江湖菜，可谓是“闭着眼睛点，道道不踩坑”！";
                life.star="4.4";
                life.time="11:30-14:30, 16:30-02:00";
                life.keywords="有卫生间  有包房  免费WiFi 空调开放";
                life.recommend="香辣爬爬虾¥99.8  招牌蒜蓉虾  秋秋妹耙凤爪\n" +
                        "海鲜盛宴  招牌蒜蓉花甲  清蒸小龙虾  椒盐爬爬虾¥99.8";
                life.recommend_title="菜品推荐:";
                life.phone="023-62880118";
                life.address="地址：江北区洋河中路91号（望海花市与邦兴花园十字路口建设银行对面）";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.luxiaozhang;
                life.title = "卤校长老火锅";
                life.subtitle = "观音桥      重庆火锅";
                life.detail="        本着一口麻辣味三口甜品配的核心理念，卤校长将70年传统老卤手艺与深厚的火锅底蕴相结合，再搭配纯手工鲜造甜品，开创了现捞热卤加免费甜品的独特商业模式，三年以来吸粉无数，掀起阵阵风潮，年年登顶重庆本地排队王，日均单店排队千人以上。全国近三百家门店更是多店蝉联登顶本地必吃榜、热门榜，并多次入围本品类全国品牌前十。品牌着力打造全网流量矩阵，总和流量30亿＋，赋能全国合作伙伴，日渐成为川渝火锅的领潮势力，新兴品牌代表者。现在的卤校长不仅成为了重庆的一张名片，更是成为了全国火锅创新模式引领者";
                life.star="4.5";
                life.time="11:00-00:00";
                life.keywords="空调开放  免费WiFi 有大桌 可自助点餐";
                life.recommend="辣卤耙鸡爪¥18  辣卤耙肥肠¥28  红糖冰汤圆  红汤锅底¥38\n" +
                        "杨枝甘露  鲜虾滑¥28  辣卤耙牛筋¥18  辣卤猪蹄¥18";
                life.recommend_title="菜品推荐:";
                life.phone="023-67746683";
                life.address="地址：江北区建新西路4号扩展大厦1层";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.zhuguangyu;
                life.title = "朱光玉火锅馆·大坪扛把子";
                life.subtitle = "大坪      重庆火锅";
                life.detail="        朱光玉火锅馆创立的初衷\n" +
                        "        是为了让重庆老火锅能有更好的体验感,\n" +
                        "        朱光玉除了延续重庆老火锅的传统,还原了重庆老火锅早期的出锅方式,现调、现打、现出，\n" +
                        "在菜品方面朱光玉更是进行了大刀阔斧的创新，比如,我们把朝天门的滑肉搬进了火锅店，\n" +
                        "每一份都现点,现滑,现出,我们把江南名菜东坡烧肉搬进了火锅店,先烧后焖再煮,在朱光玉一切皆可烫。\n" +
                        "        我们希望让世人看到重庆火锅的无限可能!\n" +
                        "        希望能做到让更多人爱上重庆火锅!";
                life.star="4.7";
                life.time="11:00-00:00";
                life.keywords="付费停车  空调开放  免费WiFi 有大桌";
                life.recommend="藤椒牛舌¥36  虎皮凤爪¥29  啵啵鱼豆花  黄金虾滑¥28\n" +
                        "暴打柠檬茶¥9.9  椰子灰牛乳冰¥12.8  手摇掌中宝";
                life.recommend_title="菜品推荐:";
                life.phone="023-63032772";
                life.address="地址：渝中区时代大道大坪龙湖时代天街D馆9号门斜对面";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.diandude;
                life.title = "点都德（龙湖时代店）";
                life.subtitle = "龙湖时代天街      粤式茶点";
                life.detail="        点都德成立于1933年，国内知名的大型连锁式综合茶楼，早茶文化经典传承者，以美味的点心出品、良好的服务环境而备受消费者青睐\n" +
                        "        点都德一心一意做茶市，透过一壶一杯一碟勾勒出浓浓的老广州风情。近年来，企业不断扩充经营网络，现时先后在各地开设多家大型茶楼直营门店，每月接待人数超过80万人次。公司旗下各店糅合精巧的西关建筑设计风格，并注入点心创新的元素，不但为茶楼经营重新定义，更凭其独特风格成为本土一大标志性品牌。\n" ;
                life.star="4.3";
                life.time="09：00-22：00";
                life.keywords="有卫生间  可手机充电 有大桌 有宝宝椅";
                life.recommend="金莎海虾红米肠  招牌虾皇饺  百合蒸凤爪  荔湾艇仔粥\n" +
                        "沙爹蒸金钱肚  特色蒸排骨  乳鸽  明虾蟹子烧卖";
                life.recommend_title="菜品推荐:";
                life.phone="023-68817177";
                life.address="地址：渝中区大坪正街龙湖时代天街A馆1楼3号门旁边L1、L2商铺";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.houhuoguo;
                life.title = "后火锅（总店）";
                life.subtitle = "南坪      重庆火锅";
                life.detail="        萍姐火锅是由亚特餐饮打造的火锅品牌，作为近几年以来快速崛起的餐饮新势力，将重庆火锅传统的商业模式，从定位、产品、媒介、流星、空间、内容等进行了跨时代的全方位升级，核心爆品战略、全网媒介互通、网红IP打造等。让传统的重庆火锅元素结合当下的商业诉求，提升到了新的高度，焕发出不一样的生机与活力，旗下品牌卤校长火锅、全网流量过十亿，品牌总店数超200+，占据全国火锅商业市场半壁江山，成为了新一代重庆火锅的标杆品牌。亚特餐饮将不懈追求，努力奋进，致力于重庆火锅文化发扬光大，全力将重庆火锅带出一个新的天地。";
                life.star="4.2";
                life.time="11:00-14:30, 16:30-23:30";
                life.keywords="有卫生间  空调开放  免费WiFi 付费停车 有包厢";
                life.recommend="红烧肉¥26  烧鸡脚¥16  烧牛蹄筋¥20  红糖冰汤圆¥6\n" +
                        "双椒牛肉¥20  烧菜  鲜毛肚¥38  手打鱼籽虾滑¥20";
                life.recommend_title="菜品推荐:";
                life.phone="023-62495152";
                life.address="地址：南岸区南坪新街4号口步行660m";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yangjilongfu1;
                life.title = "杨记隆府（解放碑总店）";
                life.subtitle = "解放碑      川菜";
                life.detail="        曾几何时，那些流行于民间的地菜重庆人称之为——江湖菜\n" +
                        "        江湖菜发源往往偏远，驻于入城交通要道，是长途奔劳小憩打尖的去处。旅途劳顿加上饥肠辘辘，吃着一顿麻辣鲜香的美味，自会广为流传。\n" +
                        "        杨记隆府由明末官僚杨鸣凤的后人所创。明万历年间，重庆巴县人杨鸣凤，殿试中进士(榜眼)，入京师翰林院为官。杨鸣凤一生酷爱珍馐美味，亦好客酬友，常于家中作川东风味家乡菜，亲自督点，炮龙蒸凤，他的后人为承传他的荣耀与美食技艺，于民国三十一年(公元一九四二年)创立了一家叫杨记隆府的酒楼，将家传手艺流传于世，并以重金礼聘巴渝名厨，得其烹饪技艺，将家传菜与江湖菜相结合而自成一派,声震川渝两地，是名流商贾、军政大员宴宾的首选之地，据传须提前三天预订，最盛时订位要等一个月。\n" +
                        "        如今的杨记隆府随时间的沉淀，更显愈久弥新，定让你不虚此行……";
                life.star="4.5";
                life.time="11:00-22:00";
                life.keywords="有卫生间  空调开放  免费WiFi 有包厢";
                life.recommend="民国辣子鸡¥88  杨记招牌鱼  传统毛血旺  红糖阴米粥\n" +
                        "民国霸王兔  大麻圆¥38  酥炸米酒¥32  生煎菜心";
                life.recommend_title="菜品推荐:";
                life.phone="+86-23-6771 6666";
                life.address="地址：渝中区临江支路32号附7号";
                list.add(life);
            }
        } else if (tag == 1) {
            if (true) {
                Life life = new Life();
                life.img = R.drawable.jd1;
                life.title = "重庆江北希尔顿逸林酒店";
                life.subtitle = "江北区";
                life.detail="        屡获殊荣的重庆江北希尔顿逸林酒店是一栋拥有30层楼的摩天大楼，位于江北观音桥商业中心，提供带平板有线电视和iPod基座的设施齐全的客房、spa服务、健身中心、舞厅和7个多功能会议室，距离观音桥地铁站（3号线）有不到5分钟的步行路程。" +
                        "重庆江北希尔顿逸林酒店毗邻著名的北城天街，距离重庆火车站和解放碑购物中心有15分钟的车程，距离江北国际机场有20分钟的车程。" +
                        "典雅的客房配有熨烫设施、迷你吧和沏茶/咖啡设施。部分客房提供舒适的浴缸，入住的客人可使用行政酒廊。" +
                        "客人可在SPA的桑拿浴室或热水浴池内放松休息，也可在健身中心的室内游泳池畅游。" +
                        "酒店内的餐厅供应各种精选的当地中餐。酒吧供应清爽的饮料。";
                life.star="4.2";
                life.time="全天";
                life.keywords="花园  浴缸  空调  24小时前天  禁烟客房";
                life.recommend="亚洲风味、 美式、 自助餐";
                life.recommend_title="早餐信息:";
                life.phone="023-62495152";
                life.address="地址：重庆, 江北区, 江北区洋河一路68号协信中心B栋";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.jd2;
                life.title = "重庆JW万豪酒店";
                life.subtitle = "渝中区";
                life.detail="重庆JW万豪酒店提供一个室内游泳池、Spa中心、健身中心和3间餐厅。公共区域配备了WiFi，客人可以使用免费停车场。" +
                        "酒店距离解放碑有10分钟步行路程，距离临江门地铁站有5分钟步行路程，距离重庆江北国际机场有35分钟车程。" +
                        "每间客房都配有平板卫星电视、iPod基座和迷你吧，还提供电热水壶。私人浴室配备了浴缸和吹风机。" +
                        "客人可以在健身中心保持日常锻炼或在游泳池游泳，度过美好的休闲时光。为方便客人，酒店可应要求提供洗衣服务。" +
                        "客人可以在酒店内的餐厅和酒吧享受独特的美食体验。" +
                        "根据我们网站上的真实住客点评，这里是重庆的人气地区之一。";
                life.star="4.6";
                life.time="全天";
                life.keywords="市景  花园  免费无线网络  免费停车  浴缸";
                life.recommend="欧陆式、 美式、 自助餐";
                life.recommend_title="早餐信息:";
                life.phone="+862363799999";
                life.address="地址：重庆, 渝中区, 渝中区民生路235号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.jd3;
                life.title = "重庆解放碑威斯汀酒店";
                life.subtitle = "渝中区";
                life.detail="重庆解放碑威斯汀酒店位于重庆市，设有spa康体中心，距离重庆人民解放纪念碑仅有2分钟步行路程，配有免费无线网络连接" +
                        "重庆解放碑威斯汀酒店距离小什字地铁站（1号线）有5分钟步行路程，距离朝天门有6分钟车程，距离重庆火车北站大约需要15分钟。距离重庆江北国际机场有30分钟车程。" +
                        "酒店的每间客房都为您提供空调、iPod基座、卫星电视和电热水壶。私人浴室配有淋浴、浴缸和吹风机。" +
                        "重庆解放碑威斯汀酒店设有会议设施和旅游咨询台，提供票务服务，配有免费停车场。" +
                        "酒店设有2间餐厅，提供国际美味和中餐美食。";
                life.star="4.8";
                life.time="全天";
                life.keywords="市景  免费停车  免费无线网络  空调  浴缸";
                life.recommend="欧陆式、 美式、 自助餐";
                life.recommend_title="早餐信息:";
                life.phone="+86-23-63806666";
                life.address="地址：重庆, 渝中区, 重庆市渝中区新华路 222 号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.jd4;
                life.title = "重庆解放碑皇冠假日酒店";
                life.subtitle = "渝中区";
                life.detail="重庆解放碑皇冠假日酒店（原洲际酒店）位于重庆解放碑步行街，配有先进的健身器材和室内游泳池，距离解放碑繁华的市中心以及餐饮、休闲和文化活动中心仅有几分钟的步行路程，客人可以步行前往国泰艺术中心、罗汉寺、长江索道和洪雅洞等景点。" +
                        "重庆解放碑皇冠假日酒店（原洲际酒店）距离1号、2号和6号地铁线有5分钟步行路程，距离重庆火车北站有20分钟车程，距离江北国际机场有25分钟车程。" +
                        "重庆解放碑皇冠假日酒店（原洲际酒店）的所有客房均配有豪华寝具、带花洒淋浴的独立浴室、有线电视、熨烫设施、迷你吧、冰箱、沏茶/咖啡设施以及免费WiFi。" +
                        "Spa康体中心提供按摩护理服务和桑拿浴室。旅游咨询台和订票服务可为旅行计划提供帮助。酒店还提供外币兑换服务和洗衣服务。大宴会厅配有多媒体和最先进的音响系统；13间会议室可举办各种会议和活动。" +
                        "酒店还拥有中餐厅和西餐厅，在舒适典雅的环境中提供各种菜肴。";
                life.star="4.7";
                life.time="全天";
                life.keywords="厨房  市景  洗衣机  免费停车  浴缸";
                life.recommend="自助餐";
                life.recommend_title="早餐信息:";
                life.phone="023-89066888";
                life.address="地址：重庆, 渝中区, 渝中区民族路101号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.jd6;
                life.title = "重庆凯宾斯基酒店";
                life.subtitle = "南岸区";
                life.detail="重庆凯宾斯基酒店坐落在重庆市区的一座标志性建筑中，距离重庆国际会展中心有5分钟的步行路程。重庆凯宾斯基酒店提" +
                        "供豪华客房和各种休闲选择，包括热水浴池、室内游泳池、健身中心和覆盖所有区域的免费WiFi。酒店提供覆盖各处的免费WiFi。" +
                        "重庆凯宾斯基酒店距离重庆火车站有8分钟车程，距离重庆市中心繁华的解放碑步行街有10分钟车程，距离重庆江北国际机场有" +
                        "30分钟的车程，距离工贸轻轨站（3号线）有6分钟的步行路程。" +
                        "所有客房均以宜人的中色调装饰，配有免费有线网络连接、iPod基座、熨烫设施、平板电视以及迷你吧。独立浴室提供浴缸和淋浴设施。" +
                        "酒店设有西餐厅和中餐厅。酒店内的中餐厅供应各种粤菜、淮扬菜和四川菜。";
                life.star="4.7";
                life.time="全天";
                life.keywords="阳台  空调  24小时前台  免费停车  浴缸";
                life.recommend="欧陆式、 意式、 亚洲风味、 美式、 自助餐";
                life.recommend_title="早餐信息:";
                life.phone="+86 23 8688 8888";
                life.address="地址：重庆, 南岸区, 重庆市南岸区江南大道2号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.jd7;
                life.title = "重庆富力艾美酒店";
                life.subtitle = "南坪区";
                life.detail="重庆富力艾美酒店位于南坪万达广场，临近南坪地铁站3号线，距离长江有15分钟的步行路程，距离解放碑CBD仅10分钟" +
                        "车程。距离菜园坝火车站3公里车程，距离重庆北站15公里车程。重庆国际机场距离酒店有30公里车程。" +
                        "客房拥有宽敞的内部空间，享有现代化的家具陈设装饰，均配有私人保险箱和有线电视。" +
                        "酒店拥有面积达 1,093 平米的宴会厅，是举办会议或活动的独特场所。总面积达1,694平米的九间会议室和多功能厅、创意新" +
                        "颖的主题、菜单和多功能空间布置均超乎您的想像。" +
                        "酒店有一个大堂吧和三个餐厅，客人在北纬29度大堂吧享用开胃酒和意式咖啡放松身心，新食谱西餐厅则提供各种国际美食。乐" +
                        "美中餐厅提供川粤美味。客人还可以在曙亚洲餐厅享用日本料理。" +
                        "客人可以享受健身房和室内恒温游泳池以及室内停车场。礼宾部的工作人员可帮客人安排旅游行程。酒店也提供湿洗和干洗服务。";
                life.star="4.7";
                life.time="全天";
                life.keywords="市景 免费无线网络连接  免费停车 浴缸 空调";
                life.recommend="欧陆式、 自助餐";
                life.recommend_title="早餐信息:";
                life.phone="+86-23-86388888";
                life.address="地址：重庆, 南岸区, 南岸区江南大道 10 号";
                list.add(life);
            }
        }else if (tag == 2){
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yy1;
                life.title = "万达影城（北碚万达广场IMAX店）";
                life.subtitle = "北碚区";
                life.detail="万达电影城位于重庆北碚区北碚城南北温泉街道冯时行路300号万达广场4层，建筑面积达7000多平方米，共设立11个豪" +
                        "华厅：包括河南首家IMAX影厅，以及5个金属银幕3D厅，1个超豪华VIP影厅，共计座位1544个。重庆万达电影城拥有重庆首家" +
                        "的IMAX影厅。IMAX影厅共351个座位，22m*11.76m的IMAX专有高增益银幕，无论是IMAX或者是IMAX 3D技术，都会将观众的" +
                        "视野极大化，令您置身于电影之中。此外影城还配置了5个具有金属银幕的3D厅，专业的RealD放映设备，1个超豪华VIP影厅，力" +
                        "求打造“最好的银幕群”。\n" +
                        "万达电影院线是亚洲排名第一的院线，拥有现代高端连锁影城超过70家，银幕超过600块；2010年完成总收入17亿元，稳居中国" +
                        "第一的市场份额。万达电影以打造电影终端连锁服务品牌的核心竞争力为目标，“连锁经营能力、创新营销能力、服务品牌能力”是" +
                        "万达电影核心竞争力的三大基本要素。万达院线计划到2012年开业120家影城，拥有银幕1100块，年总收入35亿元，占全国20%以" +
                        "上的市场份额，成为排名全球前列的电影院线。";
                life.star="4.6";
                life.time="11：30-14：00;17：30-21：00";
                life.keywords="影院";
                life.recommend="环境很好  体验很棒  服务热情  音响效果好\n" +
                        "停车方便  座位舒服  人气旺  性价比高";
                life.recommend_title="网友评价:";
                life.phone="17347807619";
                life.address="地址：重庆北碚区北碚城南北温泉街道冯时行路300号万达广场4层";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yy2;
                life.title = "UME影城（解放碑店）";
                life.subtitle = "渝中区";
                life.detail="始于2002年北京，是CMC华人文化集团、华人文化电影院线成员企业，秉承“因为专业，所以领先”的经营理念，在硬件设" +
                        "备上采用IMAX、UMEDMAX、中国巨幕、LUXE、4DX、杜比全景声、激光放映、DTS:X临境音等时下新技术\n" +
                        "UME是一间电影专业集团管理公司。其英文含义U--Ultimate（终极），M--Movie（电影），E--Experience（欣赏/体验）" +
                        "。 UME国际影城完全按国际上最先进的视听技术和装潢设计，定位在五星级档次，瞄准了高中档消费层的娱乐要求，同时也锁定了" +
                        "外国人的消费群体。 UME影城有代表当今电影工业最高放映技术的数码放映厅，更多地注入了高科技含量，电影厅都采用了国际最先进的视听设备。\n" +
                        "在17年的管理经营中，UME影城一直秉承“因为专业，所以领先”的经营理念，在硬件设备上采用时下新技术：IMAX、UMEDMAX、" +
                        "中国巨幕、LUXE、4DX、CINITY、杜比全景声、激光放映、DTS:X临境音等等；在软件服务上以人为本，从细节入手为观众提供无" +
                        "微不至的尊贵体验。";
                life.star="4.9";
                life.time="10：00-24：00";
                life.keywords="影院";
                life.recommend="作为舒服  交通便利  高大上  地段好\n" +
                        "画面不错  停车方便  爆米花赞  眼镜不错";
                life.recommend_title="网友评价:";
                life.phone="023-63719966";
                life.address="地址：重庆市渝中区解放碑绞场口86-91号得意世界C座6-7楼";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yy3;
                life.title = "金逸影城（重庆大悦城IMA店）";
                life.subtitle = "渝北区";
                life.detail="金逸影视投资集团有限公司成立于2004年3月1日，一直致力于豪华多厅影城建设与经营，已在全国主要大中城市及经" +
                        "济较为发达的二级城市投建了北京、上海、天津、广州、深圳、东莞、南京、杭州、苏州、无锡、宁波、嘉兴、沈阳、抚顺、" +
                        "大连、重庆、武汉、长沙、福州、泉州、厦门、湛江、中山、济南、青岛、威海、镇江、常州、南通、盐城、桂林、南宁、太" +
                        "原、呼和浩特等几十家现代化豪华多厅影城，共99个符合国际先进技术标准的电影厅，总坐席超过17500座。\n" +
                        "影城总建筑面积5400多平方米，设有7个一流的专业影厅，2个豪华VIP厅，共可容纳1600多观众。整个影城气势恢宏，时尚" +
                        "典雅，融娱乐、休闲、购物于一体。在设计上独具风格，不仅安装了超大的整壁式清晰银幕，超宽带头枕的沙发式座椅，同时还" +
                        "采用了45度阶梯设计进一步提高了视觉效果；特有的残疾人专用座椅及坡道，也使影城设计更具人性化。";
                life.star="4.8";
                life.time="10：00-22：00";
                life.keywords="影院";
                life.recommend="人群旺  体验很棒  价格实惠  环境很好\n" +
                        "性价比高  服务热情";
                life.recommend_title="网友评价:";
                life.phone="023-61369687";
                life.address="地址：重庆市渝北区中央公园仙桃街道秋成大道99号大悦城购物中心L514号店铺";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yy4;
                life.title = "我们的电影屋";
                life.subtitle = "江北区";
                life.detail="价格来说是比较便宜的，而且很人性化，你看完一部电影的时间，如果和你买的时间差距不大是不算钱的。而且也不" +
                        "是像其他的私人电影院，是躺着的榻榻米，可能个人不是很喜欢那种，这种椅子类似于按摩椅的感觉，就很棒。\n" +
                        "环境:\n" +
                        "房间的沙发软软的很舒服像在家里一样\n" +
                        "而且房间外小回廊上有电影的海报啊立牌和模型之类的真的像个小影院\n" +
                        "特色:\n" +
                        "老板真的很专业推荐的电影很好看~感觉是很爱电影的人";
                life.star="4.8";
                life.time="10：00-22：00";
                life.keywords="影院";
                life.recommend="服务热情  环境很好  放松舒服  价格实惠\n" +
                        "停车方便  有电影房  私人影院  有包间";
                life.recommend_title="网友评价:";
                life.phone="023-67017590";
                life.address="地址：重庆市江北区龙湖新壹街2号楼8楼（观音桥中学对面）";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yy5;
                life.title = "英皇电影城（新光天地店）";
                life.subtitle = "渝北区";
                life.detail="英皇电影拥有雄厚实力，为香港最具规模及影响力的娱乐媒体投资公司之一。管理层由经验丰富的行政、制作、发行" +
                        "人才组成，以专业知识推动业务发展，引领与时并进。\n" +
                        "英皇电影的得奖或口碑佳作包括：2021年张艺谋导演的谍战片《悬崖之上》代表中国内地角逐第94届奥斯卡最佳国际影片" +
                        "奖，陈木胜导演终作《怒火·重案》成中国影史港片票房冠军；2018年林超贤执导的《红海行动》；庄文强执导，周润发、郭富" +
                        "城领衔主演的《无双》；饶晓志执导的《无名之辈》 ；2009年《证人》赢得七项影帝殊荣 ，甄子丹主演《一个人的武林》 、" +
                        "成龙所主演《十二生肖》、姜文所执导《一步之遥》、林超贤所执导《魔警》 ，以及代表香港角逐第88届奥斯卡最佳外语片的《" +
                        "破风》 等。此外，英皇电影亦一向致力发行优质好莱坞及亚洲电影，计有奥斯卡最佳外语片《入殓师》，韩国话题之作《熔炉》" +
                        "，以及《惊天魔盗团》系列 、《饥饿游戏》系列 等多部好莱坞名片。\n" +
                        "英皇电影在影院板块已打造两个品牌线，分别为全资的英皇电影城 ，以及由英皇电影与香港UA院线合资的英皇UA电影城 ";
                life.star="4.8";
                life.time="09：00-23：00";
                life.keywords="影院";
                life.recommend="高大上  座位舒服  停车方便  画面不错\n" +
                        "交通便利  地段好  眼睛不错  测试干净";
                life.recommend_title="网友评价:";
                life.phone="023-88279666";
                life.address="地址：重庆市渝北区加州花园龙溪街道红锦大道99号新光天地6层";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yy6;
                life.title = "CGV影城（来福士IMAX店）";
                life.subtitle = "渝中区";
                life.detail="CGV影城是国际化的专业连锁影院运营商及高端影院品牌。目前在全球拥有530家高端影城和3900多块高品质银幕。" +
                        "其高端的形象和细致的服务赢得了越来越多的城市白领和年轻家庭的喜爱和赞誉。\n" +
                        "CGV影城的品牌理念是“超越电影的感动”, 为顾客送上超越电影观赏的享受和乐趣。\n" +
                        "CGV积极承担企业社会责任，通过举办“梦享电影院“等公益活动为社会奉献一份绵薄之力。”梦享电影院“是邀请农民工子" +
                        "弟学校的同学们一起享受电影的乐趣，体验更多更精彩的美好故事。此外，在CGV影城里体现了对儿童的特别关爱, 儿童坐垫，" +
                        "儿童3D眼镜，儿童影票，儿童套餐让小朋友有着更好的观影体验。\n" +
                        "更多的高品质影城，更高端的品牌形象，更贴心的会员服务，更震撼的特效厅体验，CGV影城为大家带来超越电影的感动";
                life.star="4.9";
                life.time="10：00-23：00";
                life.keywords="影院";
                life.recommend="环境干净  服务热情  高大上  影响效果号\n" +
                        "作为舒服  人群旺  画面不错  厕所干净";
                life.recommend_title="网友评价:";
                life.phone="023-68630088";
                life.address="地址：重庆市渝中区朝天门接圣街8号重庆来福士广场03、04层03-127、04-120";
                list.add(life);
            }
        }
        else if (tag == 3){
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yly1;
                life.title = "重庆欢乐谷";
                life.subtitle = "渝北区";
                life.detail="tips:" +
                        " 1.可以自己带点水果小吃，里面一个汉堡套餐48" +
                        "单买个汉堡要20-25。" +
                        "冰淇淋也是18-25不等。基本上吃的单价都在18元以上。" +
                        "2.水可以不带，矿泉水5元一瓶可乐百6元一瓶，随处可见饮品零售机." +
                        "3.请避开节假日，今天去的，下午好多人，陪小孩去超级飞侠训练营，做了两个项目最多值20块钱.排队一两个小时.还好办了年卡.下次平时带孩子来. 每个项目有身高限制。" +
                        "项目有身高限制。" +
                        "4.重庆之眼贵太多人排队，等下次再去." +
                        "5.还有萌宝电影雪大概十几分钟。" +
                        "推荐项目：" +
                        "90-100cm的小朋友可以坐热气球" +
                        "空中营救(升降2次)" +
                        "淘淘空中翻滚(就是小飞机升降)";
                life.star="4.8";
                life.keywords="游乐园";
                life.time="10：00-22：00";
                life.recommend="空中竞速  海盗船  大摆锤  翼飞冲天  异度空间";
                life.recommend_title="项目推荐:";
                life.phone="023-65866000";
                life.address="地址：重庆市渝北区金渝大道29号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yly2;
                life.title = "重庆融创渝乐小镇";
                life.subtitle = "沙坪坝区";
                life.detail="重庆融创渝乐小镇一期总建筑面积6.9万㎡，拥有4大主题区，共计24项游乐设备，其中不乏U型过山车“传奇双龙”、8" +
                        "K LED球幕飞行影院“飞越重庆”等国际游乐设备，是集游乐设备、科技体验、特色餐饮、主题商店、精彩演艺于一体的开放式" +
                        "的高品质娱乐小镇。" +
                        "四大主题街区：" +
                        "灯晃街——以江州繁盛时期为背景，结合时下流行元素，打造一条充满场景体验感的沉浸式风情商业街，它的开街将成为重庆主题" +
                        "乐园商业的点睛之笔。" +
                        "惊叫欢——以渔村生活与竹海采茶两个故事场景为设计主线，融入巫山神女峰等神话故事，全方位展现三峡的神奇与魅力。" +
                        "洋歪歪——这个分区充满着可爱的各种美食，感受一场麻辣无处不有，欢乐无处不在的奇妙旅程。" +
                        "搭飞白——利用周边植被丰富的优势，以魔法森林为主题，在山顶上打造一个奇幻的、富有童话色彩而又浪漫的活动区。";
                life.star="4.7";
                life.time="09:30-23:00";
                life.keywords="游乐园";
                life.recommend="海盗船 疯狂辣椒 飞跃重庆 竹林飞车 矿山车";
                life.recommend_title="项目推荐:";
                life.phone="4008959888";
                life.address="地址：重庆市沙坪坝区土主镇文兴大道9号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yly3;
                life.title = "圣名游乐城";
                life.subtitle = "渝北区";
                life.detail="圣名游乐城作为圣名世贸环球城的游乐板块，聚合了卡通动漫、科幻魔幻、冒险探秘、体育运功、教育培训、家庭亲子等元素。" +
                        "第一期陆地乐园，占地500余亩，分南北两个区；第二期未来水世界和极限乐园，占地700亩；第三期，10平方公里环山生态" +
                        "休闲公园，打造现代观光农业花卉主题公园与环球美食文化街区、川渝民俗美食街区，规划四季花海、千亩果园、夜间动物园、" +
                        "昆虫博物馆，世界美食风貌区、川渝美食博物馆等深度体验式旅游景点。";
                life.star="4.8";
                life.time="10:00-18:30";
                life.keywords="游乐园";
                life.recommend="萌宠动物园  蹦床乐园  冰雪大世界  光影乐园  蹦极";
                life.recommend_title="项目推荐:";
                life.phone="023-62495152";
                life.address="地址：重庆市渝北区回兴服装城大道41号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yly4;
                life.title = "重庆曼谷园";
                life.subtitle = "九龙坡区";
                life.detail="重庆曼谷园是一处重庆市首家泰国风情主题乐园，这里拥有丰富的游乐体验项目，并且还有着七大主题区，同样这里还" +
                        "是一处集人文景观与自然风光为一体的综合性景区，是休闲旅游，观光度假的胜地。" +
                        "重庆曼谷园是位于重庆市九龙坡区奥体中心，抓哟包括七大主题展区，动感游乐区、风情街美食区以及你漂流区、电玩游艺区" +
                        "和曼谷演艺区，高空尖叫区、6D影院区，当然这里很多的游玩项目都非常具有刺激性，是非常值得游玩体验一番的，这里的娱" +
                        "乐项目经过专项组合既是科技新品，更是具有奇趣体感的欢乐之源，游乐项目主要有摩天轮，大摆锤，飓风飞椅，太空漫步和桃" +
                        "花飞舞，电池车以及梦幻飞车，花果山漂流，手摇船，小火车等等，其中，高耸入云的摩天轮和TA一起登上摩天轮之巅，让重庆见证你们的爱情。";
                life.star="4.7";
                life.time="09:00-21:30";
                life.keywords="游乐园";
                life.recommend="摩天轮 大摆锤 太空梭 跳伞塔 丛林飞鼠";
                life.recommend_title="项目推荐:";
                life.phone="023-62495152";
                life.address="地址：重庆市九龙坡区奥体中心1号西门南侧（育才学校对面）";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yly5;
                life.title = "重庆融创文旅城";
                life.subtitle = "沙坪坝区";
                life.detail="重庆融创文旅城共规划十大业态：融创渝乐小镇、水世界、海世界、雪世界、融创茂、渝秀、高端酒店群、音乐小镇、萌" +
                        "宠小镇、酒吧街。2020年9月26日，文旅业态一期将盛大开业" +
                        "总建筑面积6.9万平方米，拥有4大主题功能区，共计22项游乐设备，是集游乐设备、科技体验、特色餐饮、主题商店、精彩" +
                        "演艺于一体的高品质娱乐小镇。明星项目包括：传奇双龙——U型双螺旋过山车" +
                        "由全球顶级游乐设备供应商量身打造，其高度达到70米，是全世界最高的U型过山车，沿轨道起伏倾斜，在90°双螺旋高塔中" +
                        "曲折前进，多频次的前进和后退的不断加速，犹如火箭般至上云霄，带来肾上腺素的强烈冲击体验。";
                life.star="4.2";
                life.time="全天";
                life.keywords="游乐园";
                life.recommend="摩天轮 融创水世界 融创海世界 融创雪世界 渝秀";
                life.recommend_title="项目推荐:";
                life.phone="4008959888";
                life.address="地址：重庆市沙坪坝区西永街道西桂路88号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yly6;
                life.title = "梦幻奥陶纪主题公园";
                life.subtitle = "綦江区";
                life.detail="重庆奥陶纪景区位于重庆市万盛区黑山—石林风景名胜区核心景区内，是集悬崖体验、亲子游乐、自然观光、实景表演" +
                        "和餐饮住宿为一体的综合性景区。" +
                        "奥陶纪景区致力于打造原创悬崖体验项目，公园特色是“天空悬廊”，成“A”字形向外悬挑80米，是吉尼斯世界纪录保持者。" +
                        "奥陶纪短短3年打造十多项世界第一，获得了几十项国家专利，荣获中国旅游景区多项第一，成为悬崖体验项目行业标准缔造者。" +
                        "景区共占地12.57平方公里，其中核心区面积4.2平方公里，开发面积2.12平方公里，包含项目五十余项，累计接待游客几千" +
                        "万人次，吸引了中央电视台、环球网、英国每日邮报、日本TBS电视台、全球数百家媒体的争相报道，一夜之间火爆全网，创造了世界旅游界的中国神话。";
                life.star="4.8";
                life.time="09:30-19:00";
                life.recommend="天空悬廊 步步惊心 步步惊魂 悬崖自行车 悬崖蹦极";
                life.recommend_title="项目推荐:";
                life.keywords="游乐园";
                life.phone="023-64183473";
                life.address="地址：重庆市綦江区石林镇百花村";
                list.add(life);
            }
        }else if(tag == 4){
            if (true) {
                Life life = new Life();
                life.img = R.drawable.gy2;
                life.title = "鹅岭公园";
                life.subtitle = "渝中区";
                life.detail="鹅岭公园，前身为礼园，也称宜园，位于重庆市渝中区鹅岭正街，始建于清宣统元年（1909年），距离重庆市中心4.3" +
                        "公里，地理坐标：北纬29°33′8.44″ ，东经106°31′55.26″，占地面积66254平方米、n" +
                        "鹅岭公园由石绳桥、艺卉园、瞰胜楼等多余处景观组成，是晚清重庆富商李湛阳为他父亲李耀庭修建的私人花园；1958年，" +
                        "正式命名为鹅岭公园，并向游客开放。\n" +
                        "2020年2月，为致敬奋斗在抗“疫”一线的医务工作者，鹅岭公园自恢复运营之日起至2020年12月31日，对全国所有医务工作" +
                        "者实行免费参观政策。";
                life.star="4.2";
                life.time="全天";
                life.keywords="公园";
                life.recommend="石绳桥  花卉园 瞰胜楼 办公室 飞阁 苏军烈士墓";
                life.recommend_title="著名景点:";
                life.phone="023-63656270";
                life.address="地址：重庆市渝中区鹅岭正街176号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.gy1;
                life.title = "九曲河湿地公园";
                life.subtitle = "两江新区";
                life.detail="作为重庆市重点建设的十大森林公园之一，公园将借鉴杭州西溪湿地公园布局规划，打造集游览、休闲、健身、科普功能" +
                        "于一体的开放型、生态型湿地森林公园。届时，市民可在公园内游览芦苇荡、征服攀岩墙、湖滨垂钓\n" +
                        "九曲河全长5013米，流域面积约635.7公顷，作为嘉陵江的重要支流，终年流水潺潺，生态系统保持完好，具备建设湿地公园" +
                        "的自然基础\n" +
                        "九曲河森林公园占地1972亩，全长5公里，共分为峡谷、河口湿地生态体育区、湿地科学与文化教育展示区、乡村湿地生态休" +
                        "憩区、郊野荒溪湿地生态体验区及水源生态保育区等五大功能分区，整个公园呈带状分布";
                life.star="4.8";
                life.time="全天";
                life.keywords="公园";
                life.recommend="公园将主要借鉴杭州西溪湿地公园的规划布局经验，整个公园将最大限度的保持九曲河的原生态面貌，临河而建，依" +
                        "山就势，园中的观景栈廊、碧荷藕香、鱼家唱晚、流水夕渡、竹林幽径、民俗映像、柳浪闻莺等多个景点将呈现给市民一个都" +
                        "市区独特山水风貌。公园建成后，将成为市民周末休闲娱乐、踏青郊游的新去处";
                life.recommend_title="主要景点:";
                life.phone="无";
                life.address="地址：重庆市两江新区照母山西";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.gy3;
                life.title = "重庆中央公园";
                life.subtitle = "渝北区";
                life.detail="重庆中央公园，位于重庆两江新区同茂大道和节庆大道，是国内最大的开放式城市中心公园。依托重庆山水风貌特色，" +
                        "体现自然和谐之美的现代城市公园。正是初夏时节，园中各类植物生机盎然。黄桷树、梧桐树枝繁叶茂，大片的草坪郁郁青青" +
                        "。附近居民在林荫道中散步休闲，小朋友们在草坪上嘻嘻玩耍。开放式的公园在镶嵌在城市中，给城市添了一片绿色的风景。\n" +
                        "融会中西方文化，依托重庆山水风貌特色，体现自然和谐之美的现代城市公园，主要包含了中央广场、活力水景、阳光草坡、" +
                        "半岛镜湖和密林溪流五大景区。\n" +
                        "中央广场的中轴线上，是我市最大的一座喷泉。这座大喷泉分为三个区域，分别是喷泉观赏区、喷泉互动区、水幕电影区。喷泉" +
                        "观赏区表演的是“江山如此多娇”的大型节目。";
                life.star="4.9";
                life.time="全天";
                life.keywords="公园";
                life.recommend="沙池  放风筝的广场  大草坪  步道";
                life.recommend_title="景点推荐:";
                life.phone="023-49651000";
                life.address="地址：重庆两江新区同茂大道和节庆大道";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.gy4;
                life.title = "重庆彩云湖国家湿地公园";
                life.subtitle = "九龙坡区";
                life.detail="2005年，在重庆市园林局、市规划局、九龙坡区等相关单位的大力支持配合下，正式启动公园概念及规划方案设计" +
                        "。在市园林局的统一指挥和协调下，公园建设紧紧围绕“生态、湿地、健身、休闲、游憩”五大功能，采取整体规划、统一" +
                        "设计，由两区分头实施的建设模式。公园西区于2008年12月开工，2009年10月完工；公园东区新建及西区建设品质提升" +
                        "于2010年1月开工建设，于2010年7月1日完工。\n" +
                        "彩云湖公园规划为五个相对独立又互相衔接的功能区：生态景观区，主要利用现有桃花河水系形成人工湖体；九龙坝文化休" +
                        "闲景观区，提供旅游、娱乐休闲配套服务；运动休闲区，设置足球、网球、游泳池等；滨水景观区；而湿地生态示范区，则" +
                        "将围绕桃花溪水体营造都市中难得的湿地景观。湿地公园内，已有5万余株植物开始发挥清淤功能。公园已成为市民免费休闲" +
                        "度假、运动健身、旅游踏青、生态科学普及的出行场所，并可以开展钓鱼、露营、野餐、观鸟等老少皆宜的活动。";
                life.star="4.9";
                life.time="全天";
                life.recommend="杉林烟雨  风雨廊桥  临湖鸳港  桃花诗廊  半桃花语  桃花半岛";
                life.recommend_title="景点推荐:";
                life.phone="无";
                life.keywords="公园";
                life.address="地址：重庆九龙坡区蟠龙大道科陈路166号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.gy5;
                life.title = "照母山森林公园";
                life.subtitle = "渝北区";
                life.detail="北部新区中央有一条小山脉，呈东西走向，曲折蜿蜒，起伏平缓，有良好的天然植被，呈现出鲜明的丘陵山地自" +
                        "然风光——这就是照母山。历史对照母山特别偏爱，千百年的时光披沙拣金，在照母山沉淀：南宋状元冯时行曾在此结庐" +
                        "照母，明清时期牌坊在此完整保存，清润甘甜的孝母泉在此流淌。\n" +
                        "照母山森林公园依托自然地理条件和孝爱文化积淀，秉承“近自然”生态理念打造“虽由人作、宛自天开”的自然生态景观" +
                        "，公园投资10.6亿元建设，面积4300亩，拥有生态自然的环境、磅礴大气的景观、古朴清旷的风貌、精致典雅的格调、深沉厚重的文化。";
                life.star="4.9";
                life.time=" 8:00-18:00";
                life.recommend="植物景观：\n" +
                        "照母山森林公园应用中国传统造园手法，采取多品种混交、异年龄结构、多林层复合方式，栽植了近万株大树，打造了磅礴大气的植物景观.\n" +
                        "传统建筑:\n" +
                        "照母山森林公园内的建筑均采取传统民居风格，庭、廊、楼、阁、塔、牌坊等形制俱全，与森林景观相得益彰。";
                life.recommend_title="景点推荐:";
                life.phone="023-63027397";
                life.address="地址：重庆市渝北区金开大道西段88号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.gy6;
                life.title = "鸿恩寺森林公园";
                life.subtitle = "江北区";
                life.detail="鸿恩寺森林公园位于重庆市江北区，面积逾千亩，在重庆主城仅次于中央大公园。园内制高点海拔418米，登临山顶鸿恩" +
                        "阁观景台，可览江北区、渝北区、沙坪坝区、渝中区、北部新区胜景。\n" +
                        "位于龙脊山处的“鸿恩坊”为仿古建筑，共七层，海拔高度468米左右，超过437.5米的南山“一棵树”观景台，是重庆主城最高" +
                        "观景台。鸿恩寺森林公园是“森林重庆”建设的重要项目，经国务院批准的《重庆市城市总体规划》中被规划为重庆市主要城市" +
                        "中心公园之一，列入了重庆市创建国家园林城市的重点公园。";
                life.star="4.9";
                life.time="06:00-21:00";
                life.keywords="公园";
                life.recommend="滚雪听桂  金桂溢香  鸿恩春晓  翠涌云崖  琴台结缘  鸿雁留影";
                life.recommend_title="景点推荐:";
                life.phone="023-67051488 ";
                life.address="地址：重庆市江北区鸿恩路";
                list.add(life);
            }
        }else if(tag == 5){
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yp1;
                life.title = "蜜雪冰城（观音桥店）";
                life.subtitle = "江北区";
                life.detail="蜜雪冰城，是张红超于1997年在郑州成立的冰淇淋与茶饮的品牌。经过20余年的发展，全国门店数量超过一万家，覆盖" +
                        "31个省（市、自治区）并正在积极开拓海外市场。\n" +
                        "蜜雪冰城致力于让全球每个人享受高质平价的美味，始终秉承“近者悦，远者来；以奋斗者为本，以顾客为中心”的理念，用优" +
                        "质的原材料打造产品，以优质的团队服务顾客。\n" +
                        "为做好每一支冰淇淋、每一杯茶饮，蜜雪冰城品牌由三大产业链（研发生产、仓储物流、运营管理）共同协作，使蜜雪冰城在国" +
                        "内饮品行业稳步成长，并致力于推动全球冰淇淋与茶饮行业更好、更快发展。";
                life.star="4.5";
                life.time="10：00-22：00";
                life.keywords="饮品";
                life.recommend="招牌柠檬水  摩天脆脆/化夫冰淇淋  珍珠奶茶  蜜桃四季春";
                life.recommend_title="优惠促销:";
                life.phone="023-67629063";
                life.address="地址：重庆市江北区观音桥建新南路新世纪百货奥特莱斯大门口对面";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yp2;
                life.title = "茶百道(大融城)";
                life.subtitle = "江北区";
                life.detail="茶百道是成都本土茶饮连锁品牌，创立于2008年，隶属四川恒盛合瑞实业集团有限公司。全国门店超4000家，品牌" +
                        "已覆盖全国大部分城市。2021年3月31日，在成渝餐·饮峰会中，茶百道斩获“2021成渝餐·饮标杆品牌奖”\n" +
                        "茶百道回到做好一杯饮品的本质上，用原料、工艺、创新精神来创作饮品。坚持原叶现萃，保证茶汤既去除了涩味又保留了" +
                        "茶香，通过茶、鲜果这些食材的组合创新，呈现出生活中值得等待的美味。2008年，茶百道在成都温江开出第一家店。\n" +
                        "2020得饿了么x口碑 2020年度金牌合作商家\n" +
                        "2020中国饮品创变力Top50 2020年度产品创新力品牌\n" +
                        "2020“中国餐饮外卖万单之王品牌”称号\n" +
                        "2020成都夜经济增长驱动50强";
                life.star="4.5";
                life.time="10：00-22：00";
                life.keywords="饮品";
                life.recommend="爆品-冷萃茶  焦糖山核桃可可  茉莉奶茶  招牌芋圆奶茶\n" +
                        "珍珠奶茶  新品-茉莉菌菌  草莓米麻薯  芒芒生打椰";
                life.recommend_title="优惠促销:";
                life.phone="023-62495152";
                life.address="地址：重庆市江北区观音桥建新南路大融城LG层30号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yp3;
                life.title = "喜茶（南坪协信店）";
                life.subtitle = "南岸区";
                life.detail="喜茶（HEYTEA，曾名“皇茶”）是一家由深圳美西西餐饮管理有限公司运营的中国连锁茶饮品牌，由聂云宸于2012" +
                        "年创立，总部设在深圳市南山区航天科技广场，旗下拥有茶饮品牌“喜茶”和烘焙品牌“喜茶热麦”。\n" +
                        "该公司依赖社交媒体上的口碑营销以减少广告支出。年轻消费者是其主要客户。大多数店面都在一二线城市的繁华购物中" +
                        "心。其知名产品为芝士奶盖。";
                life.star="4.2";
                life.time="10：00-22：00";
                life.keywords="饮品";
                life.recommend="清爽不喝腻  轻芒芒甘露  多肉桃桃  芝芝梅梅\n" +
                        "多肉葡萄冻  奥利奥波波冰  多肉车厘  冰淇淋芒芒";
                life.recommend_title="优惠促销:";
                life.phone="023-62836692";
                life.address="地址：重庆市南岸区南坪江南大道28号协信星光时代广场4F层002B号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yp4;
                life.title = "奈雪的茶（北城天街店）";
                life.subtitle = "江北区";
                life.detail="奈雪的茶，创立于2015年，总部位于广东省深圳市，隶属于深圳市品道餐饮管理有限公司的茶饮品牌。创新打造“" +
                        "茶+软欧包”的形式，以20-35岁年轻女性为主要客群，坚持茶底4小时一换，软欧包不过夜。 2019年7月2日，奈雪的茶" +
                        "入选“中国茶饮十大品牌”。截至2022年第一季度，奈雪的茶门店数量达到854家，所有门店都是直营店，不接受加盟。\n" +
                        "奈雪的茶的出现，打破了过去对茶饮市场局限于低中端品牌的固有认知，通过专注提供优质食材现制的创意茶饮，选址城" +
                        "市高端商业中心核心位置，以及提供富有设计感的体验空间，奈雪的茶走出了一条高端现制茶饮的发展路线。这既是品牌" +
                        "创新的成功，也是茶饮品牌高端化的成功。";
                life.star="4.7";
                life.time="10：00-22：00";
                life.keywords="饮品";
                life.recommend="霸气芝士草莓  草莓魔法棒  霸气榴莲王  霸气橙子\n" +
                        "芒果魔法棒  奶酪芋头山  咸蛋黄嘟嘟  黑糖珠珠宝茶";
                life.recommend_title="优惠促销:";
                life.phone="13925241442";
                life.address="地址：重庆市江北区观音桥兴塔路北城天街新馆2L";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yp5;
                life.title = "书亦烧仙草（沙坪坝万达店）";
                life.subtitle = "沙坪坝区";
                life.detail="书亦烧仙草是一个属于餐饮行业的品牌，创始人是王斌，“书亦烧仙草”是源自四川省本土知名品牌，诞生于2007" +
                        "年，专注于烧仙草茶饮行业十二年，倡导“新鲜，健康、时尚”的仙草茶饮文化，推崇让创业更简单，让世界爱上仙草茶饮。\n" +
                        "书亦烧仙草隶属于四川书亦餐饮管理有限公司，总部位于西南地区经济中心之一——成都，公司以“科学管理、真诚服务”" +
                        "为准则，“健康、自然、时尚”为产品理念。采用直营、加盟两大经营模式。\n" +
                        "主打烧仙草茶饮，先后开发杨枝甘露烧仙草、小芋圆烧仙草、酸奶烧仙草等创新饮品\n" +
                        "2021年8月，入选艾媒金榜（iiMedia Ranking）最新发布《2021年上半年中国新式茶饮品牌排行Top15》。\n" +
                        "品牌价值观：客户第一";
                life.star="4.1";
                life.time="10：30-21：30";
                life.keywords="饮品";
                life.recommend="书亦烧仙草  黑糖小芋圆  草莓啵啵酸奶  草莓酸奶冰\n" +
                        "芋圆全家福  草莓芋圆冻冻  椰椰烧仙草  黄金珍珠奶茶";
                life.recommend_title="优惠促销:";
                life.phone="18030779425";
                life.address="地址：重庆市沙坪坝区小龙坎经纬大道1108号万达广场B1层B1037号商铺";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yp6;
                life.title = "重庆交通茶馆";
                life.subtitle = "九龙坡区";
                life.detail="交通茶馆位于黄桷坪正街，是重庆唯一保持着上世纪七八十年代风格的茶馆。茶馆建于1987年，由原黄桷坪交" +
                        "通运输有限公司食堂改造而成。2005年，濒临破产的交通茶馆拟改造为网吧。常去采风的四川美术学院油画系教授陈" +
                        "安健听说后，将茶馆承包下来，并最大程度地保留了二十世纪七八十年代的茶馆的经营风格。\n" +
                        "茶馆不大，老式木架结构，房梁参差不齐，灰黑的砖瓦和斑驳的墙体透露出独特的年代感。这样有厚重城市气息的茶" +
                        "馆，贯穿着老黄桷坪人的日常生活，早上第一壶茶的水要自己烧，几十年如一日，好像那些好奇的游客、拍戏的剧组、" +
                        "拍照的摄影师都和他们毫无关系又和谐相处着。";
                life.star="4.8";
                life.time="07：00-19：00";
                life.keywords="饮品";
                life.recommend="冰糖菊花  瓜子  竹叶青  重庆贡茶\n" +
                        "茉莉花茶  碧螺春  普尔  绿茶";
                life.recommend_title="优惠促销:";
                life.phone="13635495882";
                life.address="地址：重庆九龙坡区黄角坪正街4号";
                list.add(life);
            }
        }
        else if (tag == 6){
            if (true) {
                Life life = new Life();
                life.img = R.drawable.sc1;
                life.title = "龙湖重庆时代天街";
                life.subtitle = "渝中区";
                life.detail="国内颇具知名度的商业地产品牌，定位于中等收入新兴家庭的区域型购物中心，集购物、餐饮、休闲、娱乐等" +
                        "多业态的一站式商业综合体，云集海量大牌，满足多样购物需求\n" +
                        "天街——龙湖集团持有的主要商业地产品牌，定位为面向中等收入新兴家庭的区域型购物中心，为集购物、餐饮、休闲" +
                        "、娱乐等多业态的一站式商业综合体。随着天街品牌化运营，未来龙湖天街将成为越来越多城市转念即达的欢乐入口。";
                life.star="4.9";
                life.time="10：00-22：00";
                life.keywords="商场";
                life.recommend="交通便利  品牌多  停车方便  高大上\n" +
                        "打折多  店大  大品牌  衣服多";
                life.recommend_title="网友评价:";
                life.phone="023-60333006";
                life.address="地址：重庆市渝中区大坪长江二路174号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.sc2;
                life.title = "重庆市来福士购物中心";
                life.subtitle = "渝中区";
                life.detail="来福士是凯德中国旗下具典范性的综合性项目，品牌于1986年发源于新加坡，每座“来福士”居于城市中心，" +
                        "具有综合性、多元功能的特点，融合住宅、购物中心、办公楼、服务公寓、酒店等多种业态，在城市枢纽打造经济综合体，提升所在区域的生活与商务价值\n" +
                        "来福士是“城中之城”，融合住宅、商场、办公楼、服务式公寓、酒店等多种业态，在中心城市的交通枢纽位置打造" +
                        "经济综合体和城市地标，提升所在区域的生活、商务价值，优化城市商业结构。规模11.8亿美元的来福士中国基金已" +
                        "将在中国的五个来福士注入，以保证项目的持久稳定运营和资产再升级的可行性。";
                life.star="4.8";
                life.time="10：00-22：00";
                life.keywords="商场";
                life.recommend="高大上  品牌多  交通便利  停车方便\n" +
                        "打折多  店大  大品牌  可带宠物";
                life.recommend_title="网友评价:";
                life.phone="023-63986398";
                life.address="地址：重庆市渝中区朝天门接圣街8号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.sc3;
                life.title = "万象城";
                life.subtitle = "九龙坡区";
                life.detail="华润集团旗下的高品质购物中心，倡导新的生活方式与消费潮流，知名品牌集中的购物中心，集零售/餐饮/" +
                        "娱乐/休闲/商务/住居等功能于一体的企业\n" +
                        "万象城（The Mixc）是世界500强企业华润集团旗下开发的高品质购物中心，万象城倡导“一站式”消费和“体验式" +
                        "”购物，为消费者带来全新的消费概念和生活体验。\n" +
                        "华润置地投资物业发展了万象城城市综合体、区域商业中心万象汇/五彩城和体验式时尚潮人生活馆1234space三种" +
                        "模式，在引领城市生活方式改变的同时，带动城市经济的发展、改善城市面貌。";
                life.star="4.9";
                life.time="10：00-22：00";
                life.keywords="商场";
                life.recommend="高大上  交通便利  品牌多  停车方便\n" +
                        "质量好  打折多  店大  大品牌";
                life.recommend_title="网友评价:";
                life.phone="023-68065000";
                life.address="地址：重庆市九龙坡区谢家湾正街51号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.sc4;
                life.title = "观音桥大融城";
                life.subtitle = "江北区";
                life.detail="光大安石旗下核心商业地产品牌，主打一站式消费和体验式购物，集国际时尚快销、珠宝首饰、化妆品牌、" +
                        "儿童天地、家居购物、主题餐饮、休闲健身、国际影院于一体\n" +
                        "光大安石·大融城项目是光大安石旗下商业地产旗舰品牌项目，是潮流、时尚与品质的集合地，作为光大安石成功打" +
                        "造的自有商业运营品牌，是光大安石资产管理之商业板块的核心产品线，迄今在全国一二线10座城市（上海、重庆、" +
                        "西安、青岛等）已成功打造19个大融城系列购物中心。\n" +
                        "年轻时尚与家庭生活的完美结合”是对大融城品牌定位的最好诠释，同时大融城力推“一站式”消费和“体验式”购物，" +
                        "从国际时尚快销、珠宝首饰、化妆品牌，到儿童天地、家居购物，再到主题餐饮、休闲健身、国际影院，融于一城，应" +
                        "有尽有，光大安石致力于在全国范围内复制发展以“大融城”命名的商业地产项目，为更多的城市和消费者带来全新的时尚理念和消费体验！";
                life.star="4.8";
                life.time="10：00-22：00";
                life.keywords="商场";
                life.recommend="品牌多  交通便利  东西多  高大上\n" +
                        "停车方便  打折多  店大  大品牌";
                life.recommend_title="网友评价:";
                life.phone="023-62495152";
                life.address="地址：重庆市江北区观音桥建新北路8好";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.sc5;
                life.title = "重庆国金中心IFS";
                life.subtitle = "江北区";
                life.detail="香港九龙仓集团高层城市综合体策略品牌，集大型商场/甲级写字楼/酒店式公寓及酒店于一身的大型购物商场\n" +
                        "国金中心系列是九龙仓集团的超高层城市综合体策略，九龙仓集团有限公司（九龙仓）始创于1886年，为会德丰有限公司的上市附属公司\n" +
                        "九龙仓以地产发展为业务的策略重点，致力于收购土地、融资、项目发展、设计、建筑及市场推广。集团卓越的商场管理傲视同侪，旗下的海港" +
                        "城及时代广场两个代表物业为集团在香港的骨干地产项目。九龙仓继续以“创建明天”为目标积极拓展在国内之业务，分布多于十个城市，并成功在" +
                        "国内建立多项地标物业，如上海的会德丰国际广场、重庆、大连、上海及武汉的时代广场，现正于成都、无锡、重庆、苏州和长沙，以香港海港城为" +
                        "模范，兴建五个国际金融中心（IFS）项目。作为所在城市最为瞩目的“城中城”地标，每个城市的IFS项目都位于城市的核心商圈。";
                life.star="4.1";
                life.time="10：00-22：00";
                life.keywords="商场";
                life.recommend="高大上  环境很好  交通便利  停车方便  提供餐饮";
                life.recommend_title="网友评价:";
                life.phone="023-62495152";
                life.address="地址：重庆市江北区五里店北城庆云路16号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.sc6;
                life.title = "新世纪百货（江北店）";
                life.subtitle = "江北区";
                life.detail="1995年开业，重庆知名国有大型零售企业，专业从事食品饮料、服装鞋包、日用百货、生活电器、黄金钟表、办公用品、体育娱乐等商品的批发零售业务\n" +
                        "重庆新世纪百货成立于1995年1月29日，是重庆著名大型国有零售企业，新世纪百货在消费者中享有良好的口碑及印象，与重庆市民的生活息息相关，大到家用电" +
                        "器、衣装行头，小到柴米油盐，消费者与新世纪百货都有着千丝万缕的联系。正是由于广大消费者的信赖与喜爱，新世纪百货才拥有了辉煌。\n";
                life.star="4.8";
                life.time="10：00-22：00";
                life.keywords="商场";
                life.recommend="品牌多  打折多  交通便利  高大上\n" +
                        "档次高  超市大  停车方便  大品牌";
                life.recommend_title="网友评价:";
                life.phone="023-67700888";
                life.address="地址：重庆市渝北区观音桥步行街6号";
                list.add(life);
            }
        }
        else if (tag == 7){
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yiy1;
                life.title = "重庆医科大学附属第一医院";
                life.subtitle = "渝中区";
                life.detail="重庆医科大学附属第一医院于1957年由原上海第一医学院（现复旦大学）附属医院分迁来渝创建，历经60余年的建设和发展，已成为全国首批“三级甲等医院”和融医疗、教学、科研、预防、保健及涉外医疗为一体的重点大型综合性教学医院。医院牵头成立了重庆市首家医院集团（医联体），即“重医一院医院集团”，集团以院本部为核心，包括3家直属部门与单位（第一分院、金山医院、青杠老年护养中心）、17家市内托管医院（大足区人民医院、海扶医院、綦江区人民医院、万盛经开区人民医院、酉阳县人民医院、合川区人民医院、璧山区人民医院、梁平县人民医院、南川区人民医院、潼南区人民医院、铜梁区人民医院、忠县人民医院、长寿区人民医院、渝北区人民医院、城口县人民医院、两江新区第一人民医院、荣昌区人民医院）、5家市外帮扶医院（西藏昌都市人民医院、新疆石河子市人民医院、陕西省渭南市人民医院、陕西省富平县人民医院、海南省万宁市人民医院）。\n" +
                        "院本部开设临床科室36个，医技科室8个，现有编制床位3200张。2021年门诊量369.03万人次，出院病人15.86万人次，手术6.96万台次。病人来自全国各地及美国、澳大利亚、日本等国。在重庆及四川、贵州等周边省市拥有25家教学医院和77家指导医院。\n" +
                        "院本部常年承担疑难危急重症救治、应急救援、干部保健及涉外医疗任务，是重庆市SARS、甲型H1N1流感等重大传染病重症病例救治首要单位和专家组长单位，以及重庆市唯一一家同时获肝、肾移植技术准入的地方医院。形成了器官移植、微创、介入、无痛诊疗等优势技术，推行以疾病为链条的多学科诊疗模式。拥有国家卫健委“国家临床重点专科建设项目”18个（产科、检验科、重症医学、专科护理、内分泌科、心血管内科、胸外科、神经外科、麻醉科、神经内科、普通外科、眼科、呼吸内科、耳鼻咽喉科、肿瘤科、医学影像科、老年病科、骨科）。拥有国家中医药管理局“中医老年病重点专科”1个。重庆市临床诊疗中心27个，重庆市医疗质量控制中心20个。各学科均形成了自身的特色优势，综合诊断治疗水平居国内先进行列。";
                life.star="4.9";
                life.time="全天";
                life.keywords="医院";
                life.recommend="内科学（传染病）  神经病学  中西医结合临床";
                life.recommend_title="擅长学科:";
                life.phone="023-68811360";
                life.address="地址：重庆市渝中区袁家岗友谊路1号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yiy2;
                life.title = "陆军军医大学第一附属医院";
                life.subtitle = "沙坪坝区";
                life.detail="中国人民解放军陆军军医大学第一附属医院和第一临床医学院，对外称西南医院。位于重庆市沙坪坝区高滩岩，是一所集医疗、教学、科研和预防、保健、康复于一体的现代化综合性“三级甲等”医院。前身系国民政府中央医院，1929年建于南京，1941年迁至重庆，1949年由西南军政委员会接管，1950年命名为西南医院，1975年改称第三军医大学第一附属医院，2016年转隶军委训练管理部，2017年转隶陆军,为陆军军医大学第一附属医院。\n" +
                        "医院有临床医技科室60个，展开床位2900张。2019年，年度门急诊量414.7万人次，收容量14.6万人次，手术量11.4万台次，平均住院日5.93天。仪器设备总值约22亿元，拥有“达芬奇”手术机器人、术中核磁、7.0 T核磁共振、TOMO刀、大型高压氧舱群、神经导航系统等高精尖仪器设备。\n" +
                        "医院拥有国家重点(培育)学科12个，国家临床重点专科军队建设项目12个，军队“双一流”重点学科1个，军队医学专科中心14个，其中7个全军研究所、7个全军专科（专病）中心。2020年复旦大学医院排行榜综合排名全国第25，较上一年度上升3名，其中烧伤科位列全国第1,病理科位列全国第4，检验科位列全国第4,整形外科位列全国第8，康复医学科位列全国第9，普通外科等12个学科上榜提名。拥有中国科学院院士1名，三级以上教授64名（在职8名），“南丁格尔”奖章获得者2名，享受国务院政府特殊津贴专家22名，国家杰青、长江学者、青年千人、万人计划、国家优青等特殊人才20名，博士生与硕士生导师共207名。";
                life.star="4.8";
                life.time="全天";
                life.keywords="医院";
                life.recommend="全军烧伤研究所  全军感染病研究所  全军眼科中心   全军病理研究所";
                life.recommend_title="擅长学科:";
                life.phone="023-65318301";
                life.address="地址：重庆市沙坪坝区高滩岩正街30号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.houhuoguo;
                life.title = "重庆医科大学附属儿童医院";
                life.subtitle = "渝中区";
                life.detail="重庆医科大学附属儿童医院于1956年由上海医学院儿科系迁渝创建，是集医教研为一体的国家三级甲等综合性儿童医院，国家儿童区域医疗中心（西南）、国家一流本科建设单位、国家临床医学研究中心。国家发改委优质医疗资源输出单位。\n" +
                        "医院以提高儿童健康水平和促进儿科医学事业发展为宗旨，以科教引领和仁心仁术护佑儿童健康为核心理念，以建设国内一流，国际先进，集医疗、教学、 科研、仁爱为一体的儿童医学中心为发展目标；坚持以国家需求为导向、以学科建设为引领、以组织绩效目标管理为主线，推进医疗、教学、科研和管理全面发展。\n" +
                        "医院是最早被国家授予儿科学硕士、博士学位授予点、博士后流动站，是首批儿科学国家重点学科、教育部重点实验室、国家级国际科技合作示范基地、国家级继续医学教育基地、国家级教学团队、国家精品课程、国家食品药品监督管理局药物临床试验机构、全国儿科唯一的住院医师规范化培训示范基地、国家级儿童早期发展示范基地、儿科唯一获得肝移植资质的儿童医院、国家干细胞临床研究备案机构；拥有5个重庆市重点实验室和3个工程中心,全国文明单位。在全国最佳医院排行榜中连续11年蝉联专科综合排行前三甲，2020年度儿内科居全国儿童医院第三位，儿外科与复旦儿外科并列第二位，连续12年进入中国医院百强榜。2020年中国医院科技量值(SETM)排名中，我院综合居全国儿童医院第三位、儿科学居第三位。";
                life.star="4.7";
                life.time="全天";
                life.keywords="医院";
                life.recommend="新生儿诊疗中心  呼吸中心  神经内科  消化科";
                life.recommend_title="擅长学科:";
                life.phone="023-63622984";
                life.address="地址：重庆市渝中区中山二路136号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yiy4;
                life.title = "第三军医大学新桥医院";
                life.subtitle = "沙坪坝区";
                life.detail="新桥医院  陆军军医大学第二附属医院，始建于1944年，前身是国民党军政部陆军医院，1950年改编为西南军区总医院，1955年转隶第七军医大学，为第二附属医院，对外称新桥医院。1975年改称第三军医大学第二附属医院，2017年改为陆军军医大学第二附属医院。现址由贺龙、邓小平等老一辈革命家亲自选定。现已建设发展成为一所设备先进、学科齐全、技术力量雄厚，集医疗、教学、科研、卫勤、为军服务等一体的大型综合性现代化教学医院，是国家首批“三级甲等医院”，也是重庆市首批“涉外定点医院”。\n" +
                        "医院展开床位2860张，拥有国际一流的重症监护病床293张和现代化层流净化手术室52间；其中百级层流手术室22间，杂交手术室1间；拥有达芬奇手术机器人、320排640层容积CT、PET-CT、手术导航系统、双源CT系统、移动式X射线术中放疗系统等国际先进的医疗设备3.1万余台件，仪器设备总价值16.54亿元。\n" +
                        "医院设有临床和医技科室49个，其中，国家临床重点专科军队建设项目5个（呼吸内科、心血管内科、心血管外科、肿瘤科、口腔科）、国家级重点学科10个（呼吸内科、心血管内科、心血管外科、骨科、泌尿外科、神经外科、普通外科、肝胆外科、普通胸外科、整形外科），国家中医药管理局重点建设专科1个（中西医结合肾脏病重点建设专科），全军医学研究所4个（呼吸、心内、心外、肿瘤），全军医学专科（病）中心6个（肾内、超声、骨科、神外、血液、口腔），优生优育中心学科3个（妇产、儿科、泌外），重庆市研究所4个（心内、肿瘤、呼吸、肾内），重庆市重点实验室6个（心内、呼吸、肿瘤、血液、肾内、内分泌），重庆市临床医学研究中心5个（呼吸、消化、神内、血液、肾内），重庆市科普基地1个（心内），重庆市工程中心2个（血液、医工）。医院是临床医学博士后流动站，有博士学位授权点学科22个、硕士学位授权点学科29个。国家住培专业基地24个、专培基地2个。有7个重庆市质量控制中心（血液内科医疗质量控制中心、肾移植医疗质控中心、心脏大血管外科（含心脏移植）医疗质量控制中心、美容外科医疗质量控制中心、临床输血质量控制中心、护理质量控制中心、医学装备医疗质量控制中心）。";
                life.star="4.8";
                life.time="全天";
                life.keywords="医院";
                life.recommend="肝移植  肾移植 疼痛门诊  康复理疗门诊  中医门诊";
                life.recommend_title="擅长学科:";
                life.phone="023-68755114";
                life.address="地址：重庆市沙坪坝区新桥正街83号";
                list.add(life);
            }
            if (true) {
                Life life = new Life();
                life.img = R.drawable.yiy5;
                life.title = "重庆市中医院";
                life.subtitle = "江北区";
                life.detail="我院是重庆市规模最大、实力最强，集医疗、教学、科研、公益四项中心职能于一体的大型三级甲等中医龙头医院，是国家卫生健康委员会指定的国际紧急救援中心网络医院、国家爱婴医院、国家药物临床试验机构，首批国家中医药传承创新工程重点中医医院建设单位和国家中医疫病防治队伍及疫病防治基地依托中医医院，也是国家和重庆市中医住院医师规范化培训基地。现为北京中医药大学附属重庆市中医院、成都中医药大学附属重庆中医院/成都中医药大学第四临床医学院。医院荣登“中国医院竞争力中医医院100强”排行榜第15位，位居西部前列。\n" +
                        "医院现有在岗职工3900余人，其中：高级职称500余人，国医大师（全国中医药杰出贡献奖获得者）2人，全国名中医3人，国家青年岐黄学者1人，国家卫生健康行业经济管理领军人才1人，重庆市首席医学专家3人，全国名老中医药专家传承工作室专家11人，重庆市名中医传承工作室专家8人，国务院政府特殊津贴专家8人，重庆市有突出贡献的中青年专家1人，首批重庆市医学领军人才1人，重庆市学术技术带头人及后备人选17人，市级名中医30人，国家和省级师带徒导师16人，重庆英才·名家名师3人，重庆英才·创新领军人才8人，重庆市首席专家工作室领衔专家1人，重庆市市级技能大师工作室1个，重庆市中青年医学高端人才15人，硕士888人，博士212人（59人在读），在站博士后37人，博士和硕士研究生导师68人。\n" +
                        "医院拥有医用直线加速器、大型数控放疗系统、4台核磁共振（含3.0T）、4台螺旋CT（含128排）、X射线血管造影系统、直接数字化放射成像系统、乳腺X射线摄影系统、全自动生化免疫流水线等大型医疗设备200余台，医疗设备总值近7亿元。\n" +
                        "医院先后获国家各级科技成果奖150多项，其中“一种治疗更年期综合征的中药复方制剂及制备方法”获中华中医药学会科技发明一等奖。医院研制了参麦注射液、丹桃合剂、降糖丸、更年宁心胶囊等多个国家新药。获得药监局生产批文的院内制剂228种。承担国家级、省部级和厅局级建设项目和科研项目近800个。";
                life.star="4.2";
                life.time="全天";
                life.keywords="医院";
                life.recommend="肛肠科  皮肤科  针灸科  肾病科  妇科  风湿病科";
                life.recommend_title="擅长学科:";
                life.phone="023-67063949";
                life.address="地址：重庆市江北区盘溪七支路6号";
                list.add(life);
            }
        }
        return list;
    }

    public static ArrayList<News> getNewsList(int tag) {
        ArrayList<News> list = new ArrayList<News>();
        if (tag == 0) {
            if (true) {
                News news = new News();
                news.img = R.drawable.redian11;
                news.title = "国家卫健委：我国已进入抗击新冠疫情第四阶段";
                news.source = "每日经济新闻";
                news.time = "2022-04-29 11:07:48";
                news.detail = "每经AI快讯，4月29日上午，国务院新闻办公室举行新闻发布会，介绍坚持“动态清零”做好疫情防控工作有关情况并答记者问。国家卫生健康委副主任李斌在发布会上介绍，当前我国已经进入到了全方位综合防控、科学精准、“动态清零”的第四个阶段。针对奥密克戎变异株传染性强、传播速度快、无症状感染者比例高，隐匿性传播强等特点，总结各地防控经验，不断完善防控的各项措施。（澎湃）";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.redian2;
                news.title = "俄国防部：摧毁乌克兰东南一武器库，内有大量西方援助武器弹药";
                news.source = "环球时报";
                news.time = "2022-04-28 14:30:06";
                news.detail = "据今日俄罗斯电视台（RT）27日报道，俄罗斯国防部表示，西方国家交付基辅的大量武器和弹药周三已在乌克兰东南部一处地点被摧毁。\n" +
                        "\n" +
                        "俄国防部称，位于扎波罗热铝厂的一个军事仓库被俄海军舰艇从黑海发射的“口径”导弹击中，该仓库存放了“美国和欧洲国家供应给乌克兰军队的大量武器和弹药”。\n" +
                        "\n" +
                        "俄国防部补充称，过去一夜，俄军战机击中了59处乌克兰军事目标，俄方炮兵对乌军进行了573次打击，俄军还击落了18架无人机。“口径”导弹发射 图源：俄媒\n" +
                        "\n" +
                        "周一，俄方宣布摧毁了乌克兰西部的六个铁路枢纽，称这些枢纽被用来“向乌克兰军队运送外国武器和军事装备”。\n" +
                        "\n" +
                        "俄罗斯多次警告美国及其盟友不要向乌克兰提供致命武器援助，称这只会破坏局势稳定，阻碍实现和平的前景。\n" +
                        "\n" +
                        "俄罗斯外长谢尔盖·拉夫罗夫（Sergey Lavrov）周二重申:“这些武器将成为俄罗斯武装部队的合法目标。包括位于乌克兰西部的仓库在内的一些仓库，已经不止一次成为此类目标。不然还能怎么样？北约实质上是通过代理人与俄罗斯开战，并为代理人提供武器。”\n" +
                        "\n" +
                        "RT称，然而，已经为基辅方面配备了反坦克和防空导弹系统、装甲车、榴弹炮和其他武器的北约成员国没有显示出让步的迹象。\n" +
                        "\n" +
                        "周一，美国官员表示在德国拉姆施泰因空军基地与40个国家的代表召开会议讨论如何援助基辅，以进一步延续其与莫斯科的军事冲突”。在会议期间，美国国防部长劳埃德·奥斯汀表示，华盛顿将“竭尽全力满足”乌克兰政府的军事需求，同时敦促其他国家也为此事进行投入。\n" +
                        "\n" +
                        "此前一天，奥斯汀和美国国务卿安东尼·布林肯前往基辅，亲自向乌克兰总统泽连斯基承诺西方给予的支持。\n" +
                        "\n" +
                        "（编辑：ZLQ）";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.redian3;
                news.title = "女儿瞒着老人取款近9万，法院：返还";
                news.source = "半岛晨报";
                news.time = "2022-04-27 15:46:42";
                news.detail = "都说养儿防老\n" +
                        "\n" +
                        "市民张秀英（化名）老人\n" +
                        "\n" +
                        "却将女儿告上了法院\n" +
                        "\n" +
                        "2020年7月3日\n" +
                        "\n" +
                        "张秀英的老伴病故，留下夫妻二人的共有存款和现金共90000元。悲痛之余，张秀英经过和女儿晓羽（化名）商量，决定这些款项全部归自己所有，老伴的丧葬费近40000元归女儿所有。\n" +
                        "\n" +
                        "2020年7月26日\n" +
                        "\n" +
                        "张秀英在女儿的陪同下，将90000元存入自己的银行账户，存期一年。\n" +
                        "\n" +
                        "2021年7月26日\n" +
                        "\n" +
                        "张秀英想取款购买助听器，于是前去银行取款。万万没想到的是，账户里只有509.75元存款。经银行工作人员查询得知，老人的银行存款早已被晓羽分四次取款合计89500元。老人说，自己的存折和身份证就放在家里的抽屉里，女儿一定是偷着取款，自己一直被蒙在鼓里。\n" +
                        "\n" +
                        "张秀英上火加上生气\n" +
                        "\n" +
                        "一下子病倒住进了医院\n" +
                        "\n" +
                        "老人出院后\n" +
                        "\n" +
                        "将女儿告上了法庭\n" +
                        "\n" +
                        "审理查明\n" +
                        "\n" +
                        "大连市甘井子区人民法院经审理查明，张秀英的丈夫去世时，其名下中国银行留有存款7万元至8万元，并余有一个月工资款4000元左右。\n" +
                        "\n" +
                        "2020年7月26日，张秀英在晓羽的陪同下，将此款数额累计90000元存入张秀英名下银行账户。自2020年9月起，晓羽分四次取款，合计从张秀英账户中取出89500元。\n" +
                        "\n" +
                        "2021年7月30日张秀英住院治疗，晓羽得知后偿还张秀英20000元。\n" +
                        "\n" +
                        "法院认为\n" +
                        "\n" +
                        "张秀英和晓羽系母女关系，晓羽在张秀英不知情情形下，将张秀英银行存款取出89500元，实属不妥且有失情理，与法相悖。\n" +
                        "\n" +
                        "虽然在得知张秀英住院后偿还了20000元，但剩余的69500元，晓羽理应予以偿还。\n" +
                        "\n" +
                        "一审判决\n" +
                        "\n" +
                        "2022年4月21日，甘井子区人民法院作出一审判决，判决被告晓羽赔偿原告张秀英经济损失69500元，案件受理费769元由被告晓羽承担。\n" +
                        "\n" +
                        "来源：新闻大连";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.redian4;
                news.title = "做核酸检测前喝饮料会造成假阳性吗？专家解答";
                news.source = "半岛晨报";
                news.time = "2022-04-27 16:06:40";
                news.detail = "北京市的疫情防控正处在关键时期，11个区域正在开展3轮核酸检测，健康防护是市民们最关注的话题，真真假假的“健康提示”通过社交媒体在亲朋好友中传播。\n" +
                        "\n" +
                        "喝碳酸饮料会引起核酸假阳性吗？做核酸时要不要“啊”出来？口罩到底该多久一换？就大家关心的问题，北京日报（ID：Beijing_Daily）记者采访了北京佑安医院呼吸与感染科主任医师李侗曾。\n" +
                        "\n做核酸前喝饮料，\n" +
                        "\n" +
                        "会造成“假阳性”吗？\n" +
                        "\n" +
                        "“做核酸前不喝水漱口，吃水果、泡菜，喝碳酸饮料、酒，都容易假阳性。”近日，有不少人收到了这样的一条“提示”。\n" +
                        "\n" +
                        "就此，李侗曾表示，饮食引起核酸假阳性的说法是没有科学依据的。\n" +
                        "\n" +
                        "李侗曾说，不论是核酸检测，还是抗原检测，都有一定的假阳性概率。相比而言，核酸检测受影响的因素更少，假阳性概率非常低。假阳性结果的出现没有整体的规律，多由实验室污染或操作不当造成。\n" +
                        "\n" +
                        "“我们会提醒市民，在做核酸检测之前2小时内不吃东西，提前半小时不喝水，尤其是碳酸饮料、酒精，不抽烟、不嚼口香糖。”李侗曾说，这种提示主要是为了避免核酸检测过程中出现“假阴性”的情况。他解释，喝水、喝饮料等，会稀释口腔分泌物，有可能导致检测结果不准确。“当然，这也是为了防止核酸采样过程中，市民出现恶心、呕吐的情况发生。”\n" +
                        "\n" +
                        "为什么做核酸时不要“啊”出来？\n" +
                        "\n" +
                        "有专家建议称核酸检测过程中，最好不要“啊”出来。这是为什么呢？\n" +
                        "\n" +
                        "李侗曾解释，“啊”是一个呼气动作，如有阳性患者在核酸检测过程中呼气，会排出比较多的病毒。因此，不“啊”出来，是为了保护他人。\n" +
                        "\n" +
                        "而在集体核酸检测过程中，怎样更好地保护自己呢？李侗曾建议，在摘下口罩后，尽量不要大口吸气。“摘口罩前，可以先吸一口气。摘下口罩后，配合工作人员指令，尽量打开口腔，把动作做到位，让工作人员采样一步到位，采完后迅速戴好口罩。”李侗曾说，这套动作，在做核酸前，可以提前练习一下。\n" +
                        "\n" +
                        "“集体做核酸，最怕的就是聚集、说话。”李侗曾说，市民在排队时，要保持一米以上距离，不扎堆、不喝水、不吃东西，尤其不要面对面聊天。前面的人采样结束，等工作人员指令，不要提前坐下或摘下口罩等待，尽量减少摘口罩的时间。\n" +
                        "\n" +
                        "核酸采样过程中，不要把物品放在台面上，手也不要触碰台面。做完核酸回家及时洗手，保持手卫生。“可以提前准备个酒精湿巾，做完核酸后就立刻进行手消毒。”\n" +
                        "\n" +
                        "口罩到底该多久一换？\n" +
                        "\n" +
                        "口罩到底该多久换一回？用过的口罩有可能造成污染吗？\n" +
                        "\n" +
                        "李侗曾表示，口罩在连续使用4到6个小时后，就需要更换。如果不是连续使用，可以视情况计算一下累计使用时间。“当然，如果口罩湿了、透了、脏了，那就需要立刻更换了。”\n" +
                        "\n" +
                        "中途摘下放置口罩时，最好找一个干净的塑料袋或一张干净的纸包起来，也可以找一个通风处悬挂起来。\n" +
                        "\n" +
                        "“不要把使用过的口罩揣在兜里、放在书包里，以免污染口罩、污染物品。”李侗曾说。\n" +
                        "\n" +
                        "来源：北京日报（ID：Beijing_Daily）记者 孙乐琪 ";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.redian5;
                news.title = "多地启动社工资格考试报名，社工为啥越来越火？";
                news.source = "中国新闻网";
                news.time = "2022年04月30日 00:03 ";
                news.detail = "中新网北京4月30日电(张依琳)近期，全国多地启动了社会工作者职业水平考试报名工作。近年来，社会工作者职业水平考试报名人数不断增多，去年，全国超80万人报名参加这一考试。社会工作是个什么工作？社工考试为啥突然火了？全国73.7万人取得社工职业资格证\n" +
                        "\n" +
                        "　　日前，民政部介绍，全国社会工作者职业资格考试报名人数呈逐年递增态势，目前全国共有73.7万人取得社会工作者职业资格证书。\n" +
                        "\n" +
                        "　　社会工作者职业资格制度是社会工作专业人才队伍建设工作的一项核心制度，由民政部和人力资源社会保障部共同建立，分为助理社会工作师、社会工作师和高级社会工作师三个级别，采取全国统一考试和评审的方式开展评价。\n" +
                        "\n" +
                        "　　民政部慈善事业促进和社会工作司副司长孟志强介绍说，自2019年以来，全国社会工作者职业资格考试报名人数以每年10余万人的数量逐年大幅递增，2021年报考总人数更是达到80余万人。\n" +
                        "\n" +
                        "　　考生涵盖社区工作者、社会组织从业人员、企事业单位工作人员、高校社会工作专业应届毕业生等。\n" +
                        "\n" +
                        "　　孟志强表示，社会工作者主要面向有需要的群众提供心理疏导、关系调适、能力提升、社会融入等服务，他们不仅来自民政工作领域，还大量分布在青少年事务、职工服务、禁毒戒毒、矫治帮教、卫生健康、教育辅导等领域。\n" +
                        "\n";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.redian6;
                news.title = "这国总理回击莫里森，嘲讽拉满";
                news.source = "北京日报";
                news.time = "2022年04月29日 18:17";
                news.detail = "　近日，中国同所罗门群岛正式签署政府间安全合作框架协议。两个主权国家之间的正常合作，却引发了美澳日的强烈反应，部分西方媒体也大肆进行炒作。\n" +
                        "\n" +
                        "　　澳大利亚总理莫里森甚至声称，“中国在所罗门群岛建立军事基地”将触及澳大利亚政府“红线”。连澳大利亚国内媒体都承认，澳先是向所罗门群岛施压要求放弃与中国的合作，但没能成功，此后又开始转向质疑中所合作“缺乏透明度”。接着，索加瓦雷还嘲讽了莫里森和澳大利亚外长佩恩，此前两人信誓旦旦地表示，尽管澳大利亚对中所合作感到担忧，但澳大利亚尊重所罗门群岛的主权。\n" +
                        "\n" +
                        "　　“哦对了，我意识到澳大利亚是一个主权国家。它可以签署任何它想签署的条约，无论是否透明。”索加瓦雷说，“但当所罗门群岛和中国签署合作协议时，西方媒体却跑来指责我们‘不透明’。我们是一个主权国家，我们已经向西方媒体给出了我们的回答。”\n" +
                        "\n" +
                        "　　索加瓦雷还在讲话中抨击了2017年与澳大利亚签署的双边安全条约中存在漏洞。他说，去年澳大利亚应所方要求派兵平息骚乱，但澳方却拒绝保护中国在所罗门群岛的基础设施。\n" +
                        "\n" +
                        "　　澳大利亚政府却对此矢口否认，索加瓦雷指出，这令人失望。澳媒报道称，索加瓦雷对所澳两国的安全协议提出了迄今为止最强烈的批评。28日，中国外交部副部长谢锋以视频方式出席中国—太平洋岛国应对气候变化合作中心启用仪式并发表致辞。针对近期一些国家造谣抹黑、阻挠干预中国和所罗门群岛商签政府间安全合作框架协议，谢锋阐明严正立场。\n" +
                        "\n" +
                        "　　谢锋表示，中所自主商签政府间安全合作框架协议，这是两个主权国家的神圣权利，是正常的执法安全合作，符合国际法和国际惯例。中所安全合作公开透明，不针对第三方，与所方同其他伙伴的合作以及地区现有机制并不冲突，符合所方和南太地区共同利益。这与某些国家拉小圈子，搞暗箱操作，拼凑军事集团，刺激军备竞赛，加剧核扩散风险，挑动阵营对抗，导致地区局势紧张有着本质不同和天壤之别。这些国家有什么权利对中所指手画脚？澳大利亚有什么资格对2000公里外的所罗门群岛和万里之遥的中国划“红线”？这不是侵犯他国主权，干涉别国内政，破坏国际规则，又是什么？";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.redian7;
                news.title = "沈晓明当选海南省委书记，冯飞、徐启方为副书记";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail =" 据海南日报客户端消息，4月29日，中共海南省第八届委员会第一次全体会议选举沈晓明为省委书记，冯飞、徐启方为省委副书记。\n" +
                        "\n" +
                        "　　当选为省委常委的还有陈国猛、沈丹阳、冯忠华、周红波、王斌、罗增斌、杨晓和、苗延红（女）、巴特尔（蒙古族）。长安街知事注意到，徐启方为新任海南省委副书记，冯忠华、王斌、苗延红、巴特尔为新任海南省委常委。徐启方，男，汉族，1965年8月生，陕西安康人，长期在陕西工作，2018年7月任副省长，2021年1月履新海南，任省委常委、组织部部长。\n" +
                        "\n" +
                        "　　冯忠华，男，汉族，1970年5月生，辽宁丹东人，长期在住建部工作，曾任城乡规划司司长，2018年3月任十三届全国人大常委会委员（专职）、全国人大农业与农村委员会委员，2019年6月履新海南，任副省长。\n" +
                        "\n" +
                        "　　王斌，男，汉族，1971年2月生，山东肥城人，早年在国家海洋局（机构改革后整合组建为自然资源部）工作，2020年12月履新海南，任副省长。\n" +
                        "\n" +
                        "　　苗延红，女，汉族，1968年1月生，江苏徐州人，曾任海南省民政厅厅长，2021年9月任省司法厅厅长。\n" +
                        "\n" +
                        "　　巴特尔，男，蒙古族，1967年2月生，新疆和静人，长期在国土部工作，2015年4月起任职海南，曾任省国土厅厅长、应急管理厅厅长，2021年12月任省交通厅厅长。";
                list.add(news);
            }
        } else if (tag == 1) {
            if (true) {
                News news = new News();
                news.img = R.drawable.bendi1;
                news.title = "打造民营经济教育基地 传承卢作孚爱国企业家精神";
                news.source = "中国新报";
                news.time = "2022年04月29日 14:40";
                news.detail = "近年来，重庆统一战线坚持以习近平新时代中国特色社会主义思想为指导，全面贯彻落实党的十九大和十九届历次全会精神，深入贯彻落实习近平总书记关于加强和改进统一战线工作的重要思想以及对重庆的重要指示要求，坚决落实党中央关于统一战线的重大决策部署和市委工作要求，聚焦破解各领域重点难点问题，形成了一批有借鉴价值、可复制推广的统战工作实践创新成果，有力推动全市统一战线工作提质增效，提升扩大了重庆统战工作争创一流、走在前列的效能效应。三十余年携手同行 “致酉合作”结出脱贫硕果\n" +
                        "\n" +
                        "　　重庆酉阳土家族苗族自治县地处武陵山集中连片特困地区，曾是国家级贫困县、重庆贫困程度最深的四个县之一。从1990年开始，中国致公党中央委员会、中国致公党重庆市委员会开始在酉阳县开展帮扶工作。几代致公党人前赴后继前往酉阳，开启“致酉合作”之路，帮助酉阳“拔穷根”“摘穷帽”。\n" +
                        "\n" +
                        "　　为帮助酉阳寻找脱贫致富路，致公党人先后组织专家学者千余人次，分批次深入酉阳90%的乡镇，走过2.5万余公里的艰难路程，以帮助当地发展中药材和畜牧业为开端，开启了“致酉合作”征程。\n" +
                        "\n" +
                        "　　32年来，在致公党帮助下，酉阳以致公党智力支边小组编制完成的两个发展规划为起始，形成了全县有主导、乡乡有主业、村村有特色的产业发展格局。全县建成各类特色产业基地130万亩。“酉阳茶油”“酉阳茶叶”等品牌影响力全面提升；发展酉州乌羊、麻旺鸭等特色养殖业，实现年产值近16亿元人民币；发展旅游业，让5万余名群众吃上“旅游饭”。\n" +
                        "\n" +
                        "　　与此同时，致公党将教育扶贫作为“致酉合作”的重要内容，32年如一日俯首在酉阳农村教育一线，给贫困家庭播撒希望，为乡村振兴培育人才。\n"+
                        "本报记者 刘相琳/文";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.bendi2;
                news.title = "“五一”采枇杷到云阳 小枇杷成致富果";
                news.source = "华龙网";
                news.time = "2022年04月30日 09:17";
                news.detail = "“物华天宝，善驿巴阳”。4月29日上午，重庆•云阳乡村振兴与产业发展论坛暨云阳县第十五届巴阳枇杷节正式启幕，这代表着云阳巴阳枇杷正式进入采摘期。巴阳枇杷获“全国名特优新农产品”称号\n" +
                        "\n" +
                        "　　上午9时许，巴阳镇巴阳村广场一框框黄灿灿的枇杷摆在公路两旁摊位上，一路弥漫着枇杷香，田间地头枇杷树上挂满了果实，不少游客提着篮子在树下采摘。10时许，随着动听的歌曲和优美的舞蹈拉开了此次活动的序幕，好看的文艺节目引来了不少游客驻足。云阳县人民政府县长李茂涛在开幕式致辞中表示，巴阳镇毗邻重庆万州区，紧依长江，是远近闻名的水果特色镇，该镇种植了枇杷一万余亩，被誉为“枇杷之乡”。云阳县将以此次活动为契机，汇集百家之长，共话、共商、共谋，在产业发展、智慧应用、田园综合体建设等方面，共同为乡村振兴伟大事业的推进，献良计、聚良策。同时，还要扩大交流之窗，让云阳进一步知道世界，让世界进一步知道云阳，让更多的海内外朋友品尝到“天生云阳”农特产品的美味香甜。要凝聚振兴之力，云阳将以更大合力更强动力，推动乡村振兴行稳致远。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = -1;
                news.title = "重庆火车北站预计“五一”日均客流量将达12万人次";
                news.source = "华龙网";
                news.time = "2022年04月30日 09:01";
                news.detail = "4月29日，记者获悉，“五一”期间，重庆火车北站日均客流量预计将达12万人次。重庆火车北站地区疫情防控工作专班提醒旅客，做好个人出行防护，提前规划出行时间，以免误车。\n" +
                        "\n" +
                        "　　“由于客流量增大，进出站速度放缓，为避免误车，旅客可根据车次安排，提前到达站区，配合工作人员完成行程码等查验工作。”专班相关负责人介绍，根据防疫要求，离渝抵渝人员须持有48小时内核酸检测阴性报告。站区在各进出站口对旅客进行体温检测，并查验行程码、健康码、核酸检测报告。进站旅客需出示车票，按离渝、非离渝分类管理。\n" +
                        "\n" +
                        "　　出站方面，站区设置中高风险地区来渝人员专用通道、信息登记区、核酸检测点及结果等候区，对相关人员实行闭环管理。\n" +
                        "\n" +
                        "　　值得一提的是，站区设有三个核酸采样舱为旅客提供核酸采样服务，一个核酸检测移动实验室就地检测。上述负责人称，为减轻核酸检测移动实验室的检测压力，缩短核酸检测结果等待时长，站区新增一台救护车，用于核酸样本送检。同时，等候区设置60米遮阳棚，内设水雾喷淋系统，为旅客降温解暑。\n" +
                        "\n" +
                        "　　重庆火车北站地区疫情防控工作专班提醒市民，非必要不离渝，不前往中、高风险区及所在城市和重点地区，减少跨省(区、市)人员流动。确需离渝，提前了解防疫政策，做好出行准备和健康防护。(佘振芳 戴子妍)";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.bendi3;
                news.title = "铜梁建成高标准农田逾54万亩";
                news.source = "中新网重庆";
                news.time = "2022年04月30日 08:29";
                news.detail = "中新网重庆新闻4月30日电(李慧敏 李承舜)谷生万物，谷雨之前栽下的秧苗如今已经长到小臂那么长。望着昔日地块零散、产出低下的“望天田”已经变成了成方连片、效益倍增的“高产田”，承包了这一大片土地的印财安脸上露出满意的笑容。\n" +
                        "\n" +
                        "　　这里是铜梁区虎峰镇群力村经过改造后的高标准农田，田成块、地平整、路相通、渠相连，放眼望去蔚为壮观。\n" +
                        "\n" +
                        "　　笔者从铜梁区农业农村委了解到，目前，铜梁区已建成高标准农田54.02万亩。今年把2021年度项目完成后，将累计建成高标准农田59.22万亩，并启动2022年度高标准农田建设7万亩。\n" +
                        "\n" +
                        "　　其中，虎峰镇群力村高标准农田建设项目主要包括田型调整、田间道路、排灌沟渠、电灌站修建等内容。\n" +
                        "\n" +
                        "　　“以前村里最小的田只有零点一亩大，五六十个平方，旋耕机都打不到转，更不用说机收机播了。”群力村党支部书记夏世模说，自村里700亩高标准农田建设完成后，有些外出务工多年的村民都回来种田了，要么就流转给邻里村民种植。像印财安这样的大户直接承包了村民流转出来的一百多亩土地种水稻，预计亩产能达到1200斤。\n" +
                        "\n" +
                        "　　“既可以将土地流转给集体经济，每年有固定的收入；又可以去那里打工，挣额外的收入。”村民吴坤余在村集体经济土地开旋耕机，在他看来，即使以后自己种地，也比以前方便多了。\n" +
                        "\n" +
                        "　　不止是群力村，虎峰镇作为高标准农田建设的“主战场”之一，高标准农田建设面积达到16000亩，截至目前已经完成了12000亩。\n" +
                        "\n" +
                        "　　“现在我们正在组织高标准农田建设，涉及到的七个村群众抢栽抢种，实现满载满插。下一步，我们将积极引进业主，采取套种间种，或者业主加集体经济的方式，提高高标准农田建设的单产，进一步助推集体经济发展。”虎峰镇人大主席周祖华说。\n" +
                        "\n" +
                        "　　在实施完高标准农田建设的部分镇街，智慧农业设施也纷纷上线。在铜梁东城街道水星村，一块块经过改造后的农田平整连片，工人正在加紧安装智慧农业系统及相关配套附属设施。\n" +
                        "\n" +
                        "　　东城街道水星村高标准农田项目建设面积4500亩，于去年11月正式开工，其中核心区220亩。据水星村党支部书记张邦中介绍，今年5月份全面完工后，不仅建成科学合理的田网、水网、路网，智慧农业设施还可以全面提供气象、虫情、水质、土壤和苗情，为粮食增收提供物联网支撑。\n" +
                        "\n" +
                        "　　据了解，下一步，铜梁将大力实施“千年良田”建设工程，成片推进高标准农田建设和宜机化改造。2023年开始，逐步转入已建成高标准农田项目区提质改造工作。到2025年，全区每年建设高标准农田5万亩。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "铜梁：今年已回引6000余人返乡就业创业";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail="中新网重庆新闻4月30日电(李慧敏)4月27日，重庆市铜梁区人力社保局在做好疫情防控的前提下，在区人力资源市场举办现场招聘会，全区有用工需求的18家工业企业提供技术工程师、焊工、普工等361个岗位，入场求职人数240余人，现场达成意向性协议98人次。\n" +
                        "\n" +
                        "　　今年以来，铜梁持续开展“把老乡留在老家”专项行动，已回引6000余人返乡就业创业。组织开展各类招聘会39场，累计为245家企业提供13058个岗位，介绍成功就业1043人次。\n" +
                        "\n" +
                        "　　据介绍，为保障区内企业用工需求，铜梁区人社局每周三(节假日顺延)会在区智慧人力资源市场举办现场招聘会。此外，适时举办高校毕业生专场招聘会、金秋招聘月、民营企业招聘周等大型户外招聘活会。\n" +
                        "\n" +
                        "　　与此同时，铜梁还与重庆大学、西南交通大学、重庆传媒职业学院等高校开展校企双选会，为高校毕业生和用人单位提供精准对接服务，以及组织部分区内重点企业分别赴巫山、遂宁、安岳、资阳、芒康等地开展联合招聘会，为区内重点企业引进人才。\n" +
                        "\n" +
                        "　　为助力全区企业发展，统筹推进常态化疫情防控与线上、线下招聘等就业服务活动，今年，区人力社保局认真落实区委区政府工作要求，站在打造产业高地的高度，认真落实稳岗惠企政策集中攻坚活动，组建了工作专班，建立了服务专员联系企业制度，引导企业准确把握政策精神，用足用好各项优惠政策，为企业提供用工保障、社会保障等方面的服务，并及时梳理企业急需解决的困难和问题交相关科室办理。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.bendi4;
                news.title = "华为云在渝举行“专精特新”企业专场直播 行业大咖云端献“金点子”";
                news.source = "中新网重庆";
                news.time = "2022年04月29日 23:11";
                news.detail = "　中新网重庆新闻4月29日电 4月29日，在重庆市经济和信息化委员会、重庆两江新区管理委员会的指导下，华为云联合重庆两江新区产业促进局、重庆两江新区总工会，精心打造了“赋能专精特新企业数字化，打造企业发展新动能”重庆“专精特新”企业专场直播，帮助中小企业解决发展难题，探寻企业科技力量，助力企业快速成长。重庆市中小企业发展服务中心副主任郭洪刚、华泰联合证券金融专家徐温馨、重庆梦之想科技有限责任公司CEO苗盛茂、北京中关村科金技术有限公司RPA事业部总经理周长安、华为云产业云解决方案总监高雪松做客直播间，为中小企业带来诚意满满的干货分享。　重庆市经济和信息化委员会中小企业处一级调研员陈谦在致辞中表示，市经济信息委正与市级各部门通力合作，持续推进“专精特新”企业申报评审工作。未来将依托各中小企业公共服务平台，汇聚和带动华为等头部数字化服务商进企业、进园区、进集群，为中小企业送政策、送管理、送技术，稳定市场预期，坚定发展信心，促进中小企业平稳健康发展。\n" +
                        "\n" +
                        "　　在专精特新企业备受支持的大背景下，中小企业该如何利用相关政策实现高质量发展？郭洪刚说，中心发布了重庆市首批“专精特新”中小企业服务包，把优质服务产品推向企业，能助力更多企业发展壮大。\n" +
                        "\n" +
                        "　　徐温馨以“注册制下多层次资本市场选择”为主题，围绕创业板科创板北交所的发行要求比较、IPO审核中关注重点等热点话题进行了专业分享。\n" +
                        "\n" +
                        "　　“华为云即将面向重庆‘专精特新’企业推出的专享加速包，将有更多梯度和维度的专项服务。”高雪松在“华为云助力专精特新快成长”主题分享中表示，华为云打造了包含产业云业务入口、业务场景、业务系统、平台服务、基础服务、工厂内等维度的数字化转型场景解决方案全景图，能极大助力“专精特新”企业加速数字化转型。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.bendi5;
                news.title = "重庆市新增1例本土确诊病例和1例无症状感染者";
                news.source = "中国新闻社重庆分社";
                news.time = "2022-04-29 13:46";
                news.detail = "重庆市卫生健康委员会官网29日发布消息称，4月28日0—24时，重庆市新增本土确诊病例1例（彭水县），新增本土无症状感染者1例（彭水县），均在管控人员中发现。\n" +
                        "截至4月28日24时，重庆市现有本土确诊病例3例（巫山县1例、彭水县2例），现有本土无症状感染者1例（彭水县）。\n" +
                        "4月28日0—24时，重庆市无新增境外输入确诊病例和无症状感染者，解除境外输入无症状感染者医学观察2例（新加坡）。\n" +
                        "截至4月28日24时，重庆市现无境外输入确诊病例，现有境外输入无症状感染者3例（新加坡1例、德国2例）。\n" +
                        "重庆市4月28日新增本土确诊病例和本土无症状感染者基本情况如下：\n" +
                        "彭水县确诊病例2，系彭水县确诊病例1的同车人员， 4月26日与彭水县确诊病例1从市外自驾出发，于4月27日到达彭水县后即被隔离管控。4月28日，根据实验室检查结果、影像学特征和临床症状，经专家组会诊，诊断为新冠肺炎确诊病例（轻型）。\n" +
                        "彭水县无症状感染者1，系彭水县确诊病例1的同车人员， 4月26日与彭水县确诊病例1从市外自驾出发，于4月27日到达彭水县后即被隔离管控。4月28日，根据实验室检查结果、影像学特征和临床症状，经专家组会诊，判定为无症状感染者。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "五一游玩好去处 弹子石沉浸式奇幻自然艺术馆开馆在即";
                news.source = "中新网重庆";
                news.time = "2022年04月29日 17:16 ";
                news.detail = "中新网重庆新闻4月29日电 “五一”期间，保利·麓谷林语倾情打造的沉浸式奇幻自然艺术馆将开放，在城市中的森林里，造物一方奇幻世界，为“长嘉汇－大南山－广阳岛”国家5A级景区文旅消费再发新声。\n" +
                        "\n" +
                        "　　该馆作品由两位艺术大师吴兴红、卢宾领衔，多位美术协会会员执笔，基于艺术生活的考究，这一次以森林为题，延伸出了一幅曼妙生动的林间画卷，给城市绘出一个奇妙故事。这一次他们邂逅麓谷林语，将色彩的魔法，在这里运用到了极致。\n" +
                        "\n" +
                        "　　地处“两江四岸”核心区的南岸，是主城都市区中部“历史母城”的重要组成部分、东部“生态之城”的主体部分，也是重庆“山水之城，美丽之地”的集中体现。\n" +
                        "\n" +
                        "　　南岸文旅抢抓成渝地区双城经济圈建设战略机遇，高质量发展高品质生活新范例建设，不断创建国家级文旅品牌，在山水人文都市区建设中充分释放文旅发展新动能。\n" +
                        "\n" +
                        "　　近年来，长嘉汇城市会客厅建成并修缮了国际马戏城、法国水师兵营旧址、挺进报旧址、故宫文物南迁纪念馆、原美术馆、施光南大剧院等全市有代表性的文旅示范性项目，吸引络绎不绝的游客打卡。\n" +
                        "\n" +
                        "　　城芯之上的热土，集萃江山泉林四大自然资源，近处，是群山静默，抬眼，是城市霓虹。\n" +
                        "\n" +
                        "　　麓谷林语以匠心精工，将对自然的尊重和保护，对生活的理解和解读，对生活的礼赞，在惬意的诗意山居生活在山水之间淋漓尽致的表达，用难得的城芯山居作品，为每一位城市森活家献礼。";
                list.add(news);
            }
        } else if (tag == 2) {
            if (true) {
                News news = new News();
                news.img = R.drawable.zt1;
                news.title = "第七届重庆文化旅游惠民消费季（春夏）活动正式启动";
                news.source = "中新网重庆";
                news.time = "2022年04月24日 10:26";
                news.detail = "中新网重庆新闻4月24日电 22日，重庆市铜梁区原乡中央公园星光璀璨，气氛热烈，第七届重庆文化旅游惠民消费季(春夏)活动在这里盛大启幕。\n" +
                        "\n" +
                        "　　据了解，本次惠民消费季由市文化旅游委主办，重庆旅游投资集团、市文化旅游信息中心、重庆演艺股份有限公司等承办，活动以“都市慢生活·乡村新体验”为主题，以都市与乡村文旅新消费为重点，包括1个主会场启动仪式、14个特色主题活动、多个区县分会场活动以及网络惠民活动4个部分，将在全市范围内推出都市特色演艺、山城深度体验、非遗中医体验、温泉康养体验、自驾旅居旅游、农耕文旅休闲、乡村露营体验等多项文旅惠民消费活动。晚上7点30分，启动仪式正式开始。伴随着气势恢宏的音乐，一条条巨龙在空中腾挪翻滚、快速游弋，拉开活动的序幕。随后，来自相关行业领域的从业者通过情景化表演形式，对全市美丽乡村旅游精品景点线路，户外游文旅装备、自驾车旅居地营地、露营基地、休闲乡村旅游精品民宿等进行了创新式现场推介，为大家带来了丰富的春夏季旅游资源以及文旅惠民消费活动信息，让大家身临其境，深刻感受到了都市生活中的闲暇惬意。\n" +
                        "\n" +
                        "　　在原乡中央公园的文旅惠民集市上，设置了非遗乡集区、帐篷美食区、露营休闲区、户外装备区。记者在现场看到，各式琳琅满目的农副产品、乡村特色文旅商品、非遗产品等摆在了醒目位置，吸引了不少市民前去购买。在现场，文旅企业们还精心准备了房车、露营野餐、星光帐篷、露天电影、民谣音乐会等，营造了浓浓的氛围，让市民深度体验了一场“吃、喝、玩、乐、购”的休闲旅游乐趣，乐享田园慢生活。\n" +
                        "\n" +
                        "　　“今天活动很丰富，展示了很多文创商品，一些特色小吃，还看到了很多露营装备，带给了我们很多新的消费体验。同时，政府还推出了很多惠民政策，拿出真金白银支持我们消费，对我们老百姓来说是实实在在的福利，这样的活动方式非常好！”市民宫先生点赞道。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.zt2;
                news.title = "重庆忠县黄金镇数千亩繁花渐次开放";
                news.source = "中新网重庆";
                news.time = "2022年03月17日 18:30";
                news.detail = "中新网重庆新闻3月17日电 (吴建华 成庆) “羽衣常带烟霞色，不惹人间桃李花。”在海拔600多米的忠县黄金镇花果山景区，数千亩桃花李花渐次开放，好似人间仙境。\n" +
                        "\n" +
                        "　　走进花果山景区，雪白、粉红的花瓣挂满枝头，如同给大地披上了一层多彩斑斓的霓裳。穿行其间，好似步入花海之中，桃花李花，层层叠叠，竞相绽放，春风拂过，幽幽花香，沁人心扉。\n" +
                        "\n" +
                        "　　目前，黄金镇花果山景区栽种的数十万株花木果树已进入盛花期，最佳观赏期将持续至本月下旬。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.zt3;
                news.title = "云海奇观！“三峡库心·长江盆景”尽显律动之美";
                news.source = "中新网重庆";
                news.time = "2022年03月10日 11:41";
                news.detail = "　中新网重庆新闻3月10日电(余鸿) 近日，从忠县黄金镇境内的大岭山佛耳岩放眼望去，茫茫云海将“三峡库心·长江盆景”的核心区——石宝寨和皇华岛全部淹没，这一壮美奇观引来许多游人驻足观赏。\n" +
                        "\n" +
                        "　　当天，受冷空气影响，大岭山佛耳岩靠长江方向出现云海奇观。只见那雪白的云海时而风起波涌，惊涛拍岸，蔚为壮观，时而如湖之平静，让山色相融，宛若人间仙境，令人啧啧称奇。\n" +
                        "\n" +
                        "　　据了解，云海是在一定天气条件下形成的云层，并且云雾高度低于山顶高度。当人们俯瞰云层时，宛若海浪滔天，故称这一现象为“云海”。其大致形成过程是山体上方空气较寒冷，山林里温度相对较高，并且湿气较大，当冷热交汇时就形成云雾，数量大了便会形成云海，加上有时山里刮风，便会呈现流水状的云海，尽显律动之美。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.zt4;
                news.title = "重庆两江新区将打造巴蜀文化旅游走廊高端会客厅";
                news.source = "中新网重庆";
                news.time = "2022年03月10日 11:21";
                news.detail = "中新网重庆新闻3月10日电(宋丹蕾) “共建巴蜀文化旅游走廊”是成渝地区双城经济圈建设的一项重要内容。今年全国两会上，川渝两省市全国政协委员联名提交提案，吁请从国家层面统一规划、统筹协调、系统推进，支持巴蜀文化旅游走廊建设。\n" +
                        "\n" +
                        "　　川渝地理相近，文化一脉相承。重庆市两江新区将积极融入巴蜀文化旅游走廊建设，打造巴蜀文化旅游走廊高端会客厅，助力成渝地区双城经济圈推动川渝两地文旅合作不断走向深入。两江新区“十四五”规划中提到，将以中华优秀传统文化和巴渝文化为根脉，推动巴蜀文化旅游长廊高端会客厅等文旅项目建设。\n" +
                        "\n" +
                        "　　据了解，两江新区将与天府新区加强合作，合力培育巴蜀文化旅游精品项目。支持文艺院团、演艺机构参与巴蜀文创产品开发工程，积极参加文旅节会和巴蜀文化旅游走廊精品线路推介会。同时，以成渝地区双城经济圈建设为牵引，对接天府新区，通过共享艺术成果、开展主题会展等形式，积极搭建两江新区、天府新区“江天一色”的“双城”文化桥梁，充分展示两江新区与天府新区文化艺术的创新合作与共赢发展。\n" +
                        "\n" +
                        "　　提案中提到，“建议由文化和旅游部与重庆市政府、四川省政府共同主办“中国西部(国际)文化旅游博览会”、川剧节、成渝双城文化和旅游公共服务产品采购大会、巴蜀合唱节，支持重庆、四川联合承办第十四届中国艺术节等重大节庆活动” “支持将川剧、蜀绣、石刻等川渝代表性的非遗项目列入联合国教科文非遗名录储备名单”。作为中国文旅产业的“头部力量”，华侨城集团也在成渝两地有所布局。旗下的欢乐谷品牌自落户两江新区以来，与两江新区的城市发展深度融合，积极探索“5G+文旅”，加速打造智慧景区，极大地丰富了重庆文旅新业态。\n" +
                        "\n" +
                        "　　两江新区市场监管局相关负责人表示，两江新区将进一步提升对巴蜀文化旅游走廊建设的重要性认识，结合新区实际，找准、抓实区域合作的切入点、着力点，加强与天府新区的对接，建立抱团发展、融合发展、合作共赢的理念，整合旅游要素、共享游客资源、共建“江天一色”旅游品牌。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "未来三天晴雨相间 桃花开了，赏花去";
                news.source = "华龙网";
                news.time = "2022年03月01日 08:01";
                news.detail = "昨日，重庆中心城区暖阳相伴。14时，重庆偏西地区气温普遍超16℃，而东北部地区普遍未超10℃。\n" +
                        "\n" +
                        "　　重庆市气象台预计：未来三天东部地区晴雨相间，东南部局地有中雨和雷电，其余地区阴天到多云。\n" +
                        "\n" +
                        "　　昨日，@重庆天气发布“2022年重庆桃花最佳赏花期预报”，渝北金凤村桃花基地、中央公园、园博园的桃花相继开放，市民可前去观赏游玩。\n" +
                        "\n" +
                        "　　专家提醒：现在这个时节乍暖还寒，早晚气温偏低，勿要过快减衣，谨防感冒。\n" +
                        "\n" +
                        "　　天气预报\n" +
                        "\n" +
                        "　　今天白天：东部地区阵雨，东南部局地有中雨和雷电，海拔1500米以上地区有雨夹雪或小雪，其余地区阴天转多云，气温4～18℃；中心城区，阴天转多云，气温12～18℃。\n" +
                        "\n" +
                        "　　今天夜间到2日白天：各地多云，局部地区早上有雾，气温1～21℃；中心城区，多云，气温9～18℃。\n" +
                        "\n" +
                        "　　3月2日夜间到3日白天：东部地区阵雨，其余地区阴天到多云，气温6～20℃；中心城区，阴天转多云，气温12～18℃。(钱也)\n" +
                        "\n" +
                        "值班编辑：高思杨";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = -1;
                news.title = "重庆自然博物馆“夜不收”“环球动物奇遇记”带你玩通宵";
                news.source = "重庆晨报";
                news.time = "2022年04月15日 ";
                news.detail = "夜幕降临，朗月高悬，当森林里的喧腾和热闹逐渐褪去，大自然披上了一层神秘的保护色。此时，如果让你住在自己搭建的帐篷里，与来自世界各地的珍稀动物相伴一晚，你想试试吗？\n" +
                        "\n" +
                        "　　4月14日，重庆自然博物馆相关负责人表示，即日起，博物馆将推出“环球动物奇遇记”活动，邀请游客们在夜色里走进博物馆，“从当日19点到次日9点的14个小时里，在‘导游’的带领下，游客足不出渝，便能和世界各地的珍稀动物共度一个神秘之夜。”\n" +
                        "\n" +
                        "　　夜幕里的金钱豹，静默地蹲卧在领地里；点点星光下，猞猁妈妈带着宝宝们出来觅食了；鼬獾在夜色中竖起耳朵，魅力值瞬间拉满；瞪着“铜铃”般的大眼睛，猫头鹰可是资深的“夜行侠”……\n" +
                        "\n" +
                        "　　据重庆自然博物馆相关负责人介绍，此次率先对观众们通宵开放的展厅，是重庆自然博物馆里赫赫有名的肯尼斯·贝林展厅。\n" +
                        "\n" +
                        "　　重庆自然博物馆新馆开放以来，这个展厅一直都是最受观众们喜爱的展厅之一。在展厅中，遍布着包括北极熊、美洲豹、犀牛、马鹿、北极狐等数百种来自世界各地的野生动物标本。\n" +
                        "\n" +
                        "　　从19点开始，“导游”将带领观众们走进夜色中的动物王国，逐一讲解它们的故事和生活环境。看环幕电影，了解微生物的力量；步入自然厅，进行丛林大冒险；在工作人员的指导下DIY动物模型，聆听专家讲述飞鸟的故事……一系列的精彩活动，将给观众们带来“沉浸式”的游览体验。\n" +
                        "\n" +
                        "　　而整个行程的重中之重，是在“美洲虎”、“美洲野牛”、“叉角羚羊”等动物朋友们的“监督”下，亲手搭建自己的宿营地。最后，再在动物们的陪伴下，沉入甜甜的梦乡。\n" +
                        "\n" +
                        "　　据悉，“环球动物奇遇记”将于每周五、周六及法定节假日举行，4－12岁的儿童均可报名参加，但8岁以下的孩子，需要有家长陪伴一起参加活动。\n" +
                        "\n" +
                        "　　重庆自然博物馆相关负责人表示，活动将收取一定研学经费，观众们可通过关注“重庆自然博物馆科普研学中心”的微信公众号进行报名及咨询。(记者 李晟)";
                list.add(news);
            }
        }
        return list;
    }
}
