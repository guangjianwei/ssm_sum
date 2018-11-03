package test_Practice.day03Test;

import java.util.HashSet;

/*
六、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。
 */
public class test6 {
    public static void main(String[] args) {
        // 2.创建HashSet用于存储Person类型
        HashSet<Person> hashSet = new HashSet<Person>();

        // 3.添加多个Person到HashSet中
        hashSet.add(new Person("王昭君", 21));
        hashSet.add(new Person("西施", 21));
        hashSet.add(new Person("杨玉环", 20));
        hashSet.add(new Person("貂蝉", 19));
        hashSet.add(new Person("杨玉环", 20));
        hashSet.add(new Person("貂蝉", 19));

        // 4.遍历获取HashSet中的内容
        for (Person p : hashSet) {
            System.out.println(p);
        }
    }
}
