package test_Practice.day04Test;
/*

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test9 {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        m.put(1930, "乌拉圭");
        m.put(1934, "意大利");
        m.put(1938, "意大利");
        m.put(1950, "乌拉圭");
        m.put(1954, "西德");
        m.put(1958, "巴西");
        m.put(1962, "巴西");
        m.put(1966, "英格兰");
        m.put(1970, "巴西");
        m.put(1974, "西德");
        m.put(1978, "阿根廷");
        m.put(1982, "意大利");
        m.put(1986, "阿根廷");
        m.put(1990, "西德");
        m.put(1994, "巴西");
        m.put(1998, "法国");
        m.put(2002, "巴西");
        m.put(2006, "意大利");
        m.put(2010, "西班牙");
        m.put(2014, "德国");

        System.out.println("请输入一个年份");
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();

        if (m.containsKey(key)) {
            System.out.println(key + "年，获得世界杯冠军的是：" + m.get(key));
        } else {
            System.out.println("该年没有举办世界杯！");
        }

        System.out.println("请输入一个国家名称");
        Scanner g = new Scanner(System.in);
        String val = g.nextLine();

        if (m.containsValue(val)) {
            for (Integer year : m.keySet()) {
                if (m.get(year).equals(val)) {
                    System.out.println(year + "、\n");
                }
            }
        } else {
            System.out.println("该国家没有获得世界杯冠军");
        }

    }

}
