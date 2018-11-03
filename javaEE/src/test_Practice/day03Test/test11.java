package test_Practice.day03Test;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
 */
public class test11 {
    public static void main(String[] args) {
        // 1.创建Scanner对象,用于键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");

        // 2.调用Scanner的nextLine()方法,让用户输入一个字符串
        String line = sc.nextLine();

        // 3.创建LinkedHashSet.用于去除重复的字符串,并保证迭代顺序
        LinkedHashSet<Character> chs = new LinkedHashSet<>();

        // 4.将字符串串转成char[]
        char[] charArray = line.toCharArray();

        // 5.使用增强for循环遍历每个字符
        for (char c : charArray) {
            // 6.将每个字符添加到LinkedHashSet中
            chs.add(c);
        }

        // 7.使用增强for打印LinkedHashSet中的内容
        for (char c : chs) {
            System.out.print(c);
        }
    }
}
