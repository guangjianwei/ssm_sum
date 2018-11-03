package day04;

import java.util.LinkedHashMap;
import java.util.Set;

public class demoLikedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("文章","马伊琍");
        linkedHashMap.put("谢霆锋","王菲");
        linkedHashMap.put("陆毅","鲍蕾");
        Set<String> keys = linkedHashMap.keySet();
        for (String key : keys) {
            System.out.println(key+" "+linkedHashMap.get(key));
        }
    }
}
