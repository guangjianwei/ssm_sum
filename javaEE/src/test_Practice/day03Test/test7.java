package test_Practice.day03Test;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。使用迭代器和增强for循环遍历LinkedHashSet。
 */
public class test7 {
    public static void main(String[] args) {
        // 1.创建LinkedHashSet
        LinkedHashSet<String> lhSet = new LinkedHashSet<String>();

        // 2.使用add方法添加元素到LinkedHashSet
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("西施");
        lhSet.add("杨玉环");
        lhSet.add("貂蝉");

        // 3.使用迭代器获取LinkedHashSet中的元素
        Iterator<String> iterator = lhSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4.使用增强for获取LinkedHashSet中的元素
        System.out.println("---------------------");
        for (String string : lhSet) {
            System.out.println(string);
        }
    }
}
