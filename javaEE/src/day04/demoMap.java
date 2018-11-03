package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demoMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("文章","马伊琍");
        map.put("文章","姚笛");
        map.put("小宝","小玉");
        map.put("李亚鹏","王菲");
        System.out.println("获取文章的键值："+map.get("文章"));
        String removeValue = map.remove("文章");
        System.out.println("被删除的元素是："+removeValue);
        System.out.println(map);
        System.out.println("取出键值元素");
        Set<String> stringKey = map.keySet();
        System.out.println(stringKey);
        for (String s : stringKey) {
            System.out.print(map.get(s));
        }
        Set<Map.Entry<String, String>> entrMap = map.entrySet();
        System.out.println(entrMap);

    }
}
