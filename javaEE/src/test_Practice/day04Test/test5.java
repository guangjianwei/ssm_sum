package test_Practice.day04Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
 */
public class test5 {
    public static void main(String[] args) {
// 2.创建HashMapkey保存汽车对象,value是汽车价格
        HashMap<Car, Integer> hm = new HashMap<>();

// 3.添加汽车到HashMap中
        Car c1 = new Car("长安奔奔", "黄色");
        Car c3 = new Car("奇瑞QQ", "黑色");
        Car c2 = new Car("铃木奥拓", "白色");

        hm.put(c1, 10000);
        hm.put(c2, 20000);
        hm.put(c3, 30000);

// 4.使用keySet方式遍历Map
        Set<Car> keySet = hm.keySet();
        for (Car c : keySet) {
// 根据key获取value
            Integer value = hm.get(c);
            System.out.println(c.getName() + ","+ c.getPrice() + " - "+ value);
        }

        System.out.println("-------------");

// 5.使用entrySet方式遍历Map
        Set<Map.Entry<Car, Integer>> entrySet = hm.entrySet();
        for (Map.Entry<Car, Integer> entry : entrySet) {
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName() + ","+ key.getPrice() + " - "+ value);
        }
    }
}
