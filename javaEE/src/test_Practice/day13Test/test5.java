package test_Practice.day13Test;

import java.util.ArrayList;
import java.util.List;

/*
练习五：取用前几个：limit、跳过前几个：skip
问题：
已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
1、取出前2个元素并在控制台打印输出。
2、取出后2个元素并在控制台打印输出。
 */
public class test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("陈玄风","梅超风","陆乘风","曲灵风","武眠风","冯默风"));
        System.out.print("前两个元素：");
        list.stream().limit(2).forEach(System.out::print);
        System.out.println();
        System.out.println("=============");
        System.out.print("后两个元素：");
        list.stream().skip(list.size()-2).forEach(System.out::print);
    }
}
