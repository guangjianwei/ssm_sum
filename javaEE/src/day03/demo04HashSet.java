package day03;

import java.util.HashSet;

//添加自定义对象到HashSet集合中，需要重写hashCode方法和equals方法
public class demo04HashSet {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("武林",33));
        set.add(new Person("武林1",33));
        set.add(new Person("武林1",33));
        set.add(new Person("武林2",33));
        System.out.println(set);
        System.out.println(set.toString());
        System.out.println("=============");
        for (Person person : set) {
            System.out.println(person);
        }
    }
}
