package cn.itacast.day07.demo01;

import java.util.ArrayList;

public class Demo8ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("丑逼求");
        list.add("傻掉磊");
        list.add("智障宝");
        System.out.println(list);
        //下面对list进行打印
        for (int i = 0; i < list.size(); i++) {  //size()为获取到集合的长度
            System.out.println(list.get(i));//get(index)为获取集合中第i号元素。
        }
    }
}
