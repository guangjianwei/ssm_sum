package test_Practice.day04Test;

import java.util.ArrayList;
import java.util.HashMap;

/*
八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class test8 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();


        arr.add("abc");
        arr.add("bcd");

        HashMap<Character, Integer> hm = new HashMap<>();

        for (String str : arr) {

            char[] charArray = str.toCharArray();

            for (char ch : charArray) {
                Integer num = hm.get(ch);
                if (num == null) {
                    hm.put(ch, 1);
                } else {
                    hm.put(ch, num + 1);
                }
            }
        }
        System.out.println(hm);
    }
}
