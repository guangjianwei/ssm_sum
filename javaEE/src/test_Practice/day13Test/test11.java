package test_Practice.day13Test;

import java.util.Arrays;
import java.util.stream.Stream;

/*
问题：
我国有34个省级行政区，分别是：
23个省：
河北省、山西省、吉林省、辽宁省、黑龙江省、陕西省、甘肃省、青海省、山东省、福建省、
浙江省、台湾省、河南省、湖北省、湖南省、江西省、江苏省、安徽省、广东省、海南省、四川省、贵州省、云南省。
4个直辖市：
北京市、天津市、上海市、重庆市。
5个自治区：
内蒙古自治区、新疆维吾尔自治区、宁夏回族自治区、广西壮族自治区、西藏自治区。
2个特别行政区：
香港特别行政区、澳门特别行政区。

使用流：
1、统计三个字的省份的个数
2、统计名字中包含方位名词的省份（东西南北）的个数
3、打印名字中包含方位名词的普通省份（非自治区直辖市特别行政区）的名字
4、将所有的特殊省份（自治区直辖市特别行政区）提取出来并放到新数组中
 */
public class test11 {
    public static void main(String[] args) {
        String[] provinces = {"河北省", "山西省", "吉林省", "辽宁省",
                "黑龙江省", "陕西省", "甘肃省", "青海省", "山东省", "福建省", "浙江省",
                "台湾省", "河南省", "湖北省", "湖南省", "江西省", "江苏省", "安徽省",
                "广东省", "海南省", "四川省", "贵州省", "云南省", "北京市", "天津市",
                "上海市", "重庆市", "内蒙古自治区", "新疆维吾尔自治区", "宁夏回族自治区",
                "广西壮族自治区", "西藏自治区", "香港特别行政区", "澳门特别行政区"};

        //1、统计三个字的省份的个数
        long count = Stream.of(provinces).filter(s -> s.length() == 3).count();
        System.out.println("三个字的省份的个数为："+count);
        //2、统计名字中包含方位名词的省份（东西南北）的个数
        long count1 = Stream.of(provinces).filter(s -> s.contains("东") || s.contains("南") || s.contains("西") || s.contains("北")).count();
        System.out.println("包含方位名词的省份（东西南北）的个数:"+count1);
        //3、打印名字中包含方位名词的普通省份（非自治区直辖市特别行政区）的名字
        System.out.println("包含方位名词的普通省份（非自治区直辖市特别行政区）的名字:");
        Stream.of(provinces).filter(s -> s.contains("东") || s.contains("南") ||
                s.contains("西") || s.contains("北")||
                s.contains("省")).forEach((s)-> System.out.print(s+","));
        String[] strings = Stream.of(provinces).filter(s -> s.contains("自治区") || s.contains("行政区")).toArray(String[]::new);
        System.out.println();
        System.out.println(Arrays.toString(strings));
    }

}
