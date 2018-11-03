package test_Practice.day05Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test5 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马","白色");
        Car car2 = new Car("奥迪","红色");
        Car car3 = new Car("迈巴赫","黑色");
        HashMap<Car,Integer> hashMap = new HashMap<>();
        hashMap.put(car1,50);
        hashMap.put(car2,80);
        hashMap.put(car3,100);
        Set<Map.Entry<Car, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Car, Integer> entry : entries) {
            System.out.println("车型:"+entry.getKey().getName()+",颜色:"+entry.getKey().getColor()+",价格："+entry.getValue()+"万");
        }
        System.out.println("==============================");
        Set<Car> cars = hashMap.keySet();
        for (Car car : cars) {
            System.out.println("车型:"+car.getName()+",颜色:"+car.getColor()+",价格："+hashMap.get(car)+"万");
        }
    }
}
