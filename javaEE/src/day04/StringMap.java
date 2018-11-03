package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
手动录入一个字符串，查看每个字符出现的次数
 */
public class StringMap {
    public static void main(String[] args) {
        String scString = new Scanner(System.in).nextLine();
        Map<Character,Integer> map = new HashMap<>();
        int count=0;
        for (int i = 0; i < scString.length(); i++) {
            if(map.containsKey(scString.charAt(i))){
                int newValue = map.get(scString.charAt(i));
                map.put(scString.charAt(i),newValue+1);
                continue;
            }
            map.put(scString.charAt(i),1);
        }
        System.out.println(map);
    }
}
