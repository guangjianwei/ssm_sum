package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
1. 创建Map集合对象, 键和值的泛型都是String
	键 : 姓名
	值 : 居住地
2. 调用put方法为集合中添加元素
	张三  北京
	李四  上海
3. 使用keySet遍历方式遍历集合
 */
public class DemoKeySet1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三","北京");
        map.put("李四","上海");
        System.out.println(map);
        Set<String> mapSet = map.keySet();
        for (String s : mapSet) {
            System.out.println(s+"来自"+map.get(s));
        }
        System.out.println("=====================");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> stringEntry : entrySet) {
            System.out.println(stringEntry.getKey()+"来自"+stringEntry.getValue());
        }

    }
}
