package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demoKeySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("文章","马伊琍");
        map.put("文章","姚笛");
        map.put("小宝","小玉");
        map.put("李亚鹏","王菲");
        System.out.println("===========第一种获取键值的方法===========");
        Set<String> stringKey = map.keySet();
        System.out.print("键元素为：");
        System.out.println(stringKey);
        System.out.print("键值元素为：");
        for (String s : stringKey) {
            System.out.print(map.get(s)+" ");
        }
        System.out.println("===========第二种获取键值的方法===========");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }


    }

}
