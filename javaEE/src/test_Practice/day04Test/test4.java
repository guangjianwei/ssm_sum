package test_Practice.day04Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/*
四、往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
 */
public class test4 {
    public static void main(String[] args) {
// 1.创建HashMap
        HashMap<String, String> hm = new HashMap<String, String>();

// 2.使用put添加元素
        hm.put("黄晓明", "Baby");
        hm.put("邓超", "孙俪");
        hm.put("李晨", "范冰冰");
        hm.put("大黑牛", "范冰冰");

// 3.使用Map的values方法获取到所有的value
        Collection<String> values = hm.values();

// 4.使用增强for获取每个value
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("----------------");
// 5.使用迭代器获取每个value
        Iterator<String> itr = values.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
