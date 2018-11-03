package day04;

import java.util.HashMap;
import java.util.Scanner;

/*
练习：计算一个字符串中每一个字符出现次数
解析：
 1，首先录入一个字符串
 2，生成一个HashMap集合（键用来存每个字符，键值是出现了次数）
 3.像集合中添加元素
 4.打印
 */
public class TestStringCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        int count = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < scString.length(); i++) {
            if(hashMap.containsKey(scString.charAt(i))){//这里的containsKey是查看集合中是否有这个键，有则返回true，否则返回false
               count=hashMap.get(scString.charAt(i))+1;
               hashMap.put(scString.charAt(i),count);
               }else{
                hashMap.put(scString.charAt(i),1);
            }
        }
        System.out.println(hashMap);
    }
}
