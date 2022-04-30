package com.example.qimo.Tools;

import com.example.qimo.Model.Banner;
import com.example.qimo.Model.Life;
import com.example.qimo.Model.News;
import com.example.qimo.Model.ScenicSpot;
import com.example.qimo.Model.User;
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
            scenicSpot.detail="      来磁器口古镇，这个当年热闹的水陆码头，踩踩青石板路，品尝当地的美食小吃，找个茶馆坐坐，感受下老重庆的风土人情。因为距离市区很近，如今的古镇也是市民休闲娱乐的好去处。\\n\n" +
                    "      根据指示牌游玩即可\n" +
                    "      古镇有十几条街巷，两旁边都是明清风格的建筑，古镇不大，根据指示牌步行游览完全没有问题。虽然游客眼前的一切，都是近年来重新翻新的，不过这并不影响你在这里感受“老重庆”。\\n\n" +
                    "      镇上有不少景点\n" +
                    "      钟家院、通家院等是古镇中典型的川东山地民居，值得一看。镇上的宝轮寺，有千年历史，可以敬香祈福。街边还有不少茶馆，找一家坐坐，当年的水手、袍哥大爷等都喜爱出入此间。喝茶的同时，有机会欣赏到当地的民间艺术，如：川剧坐唱、四川清音等。\\n\n" +
                    "      当地知名小吃：陈麻花\n" +
                    "      古镇内能够品尝到很多当地的美食和小吃。毛血旺、千张皮和椒盐花生是镇上的“美食三绝”。更出名的是“陈麻花”，镇上有很多家“陈麻花”，哪家正宗？可以看看哪家门店前排队排的长。\\n\n" +
                    "      古镇距离歌乐山的白公馆、渣滓洞不算远，可以一并游玩。";
            scenicSpot.subtitle="4A级景区  巴渝古镇  古村落";
            scenicSpot.time="全年 10：00-20：00";
            scenicSpot.address="地址：重庆市沙坪坝区磁器口古镇";
            scenicSpot.phone="电话：023-65010003";
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
            scenicSpot.phone="电话:023-75706888,023-75677000,023-75582277";
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
            scenicSpot.phone="电话：023-75559222,400-872-9008,023-75766888";
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
            scenicSpot.phone="电话：023-63039995,023-63039853";
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
            scenicSpot.phone="电话：023-47666888,023-47666559";
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
                life.phone="023-86558989";
                life.address="地址：渝中区临江支路32号附7号";
                list.add(life);
            }
        } else if (tag == 1) {

        }
        return list;
    }

    public static ArrayList<News> getNewsList(int tag) {
        ArrayList<News> list = new ArrayList<News>();
        if (tag == 0) {
            if (true) {
                News news = new News();
                news.img = -1;
                news.title = "热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 12:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
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
                news.img = R.drawable.huoguo1;
                news.title = "热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
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
                news.img = R.drawable.huoguo1;
                news.title = "热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点热点";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                list.add(news);
            }
        } else if (tag == 1) {
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = -1;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 12:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地本地";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
        } else if (tag == 2) {
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo1;
                news.title = "专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = R.drawable.huoguo2;
                news.title = "专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题";
                news.source = "新浪新闻";
                news.time = "2021-04-30 13:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
            if (true) {
                News news = new News();
                news.img = -1;
                news.title = "专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题专题";
                news.source = "腾迅新闻";
                news.time = "2021-04-30 12:00";
                news.detail = "用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。用户使用的第一高频场景是在睡觉前，使用场景中唯一的光源——灯光，光线较弱，结合我们在上文中提到的光线水平影响我们选择文字颜色与背景颜色来调节阅读舒适度。";
                list.add(news);
            }
        }
        return list;
    }
}
