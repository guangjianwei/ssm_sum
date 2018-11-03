package test_Practice.day03Test;

import java.util.Iterator;
import java.util.LinkedList;

/*
十、已知数组存放一批QQ号码，QQ号码最长为11位，
最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class test10 {
    public static void main(String[] args) {
        // 1.定义QQ号码数组String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
        String[] strs = { "12345", "67891", "2347809933", "98765432102", "67891", "12347809933" };

        // 2.创建LinkedList
        LinkedList<String> qqList = new LinkedList<>();

        // 3.遍历strs获取每个qq号码
        for (String qq : strs) {
            // 4.判断LinkedList是否已经存在这个qq号码
            if (!qqList.contains(qq)) {
                // 5.不存在这个qq号码则添加到LinkedList中
                qqList.add(qq);
            }
        }

        // 6.增强for遍历
        for (String qq : qqList) {
            System.out.println(qq);
        }
        System.out.println("------------------");

        // 7.迭代器遍历
        Iterator<String> iterator = qqList.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
    }
}
