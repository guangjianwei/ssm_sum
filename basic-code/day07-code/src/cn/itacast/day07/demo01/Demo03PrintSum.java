package cn.itacast.day07.demo01;

import java.util.Scanner;
public class Demo03PrintSum {
    public static void main(String[] args) {
        System.out.print("请输入第一个元素：");
        int a = new Scanner(System.in).nextInt();
        System.out.print("请输入第二个元素：");
        int b = new Scanner(System.in).nextInt();
        int c= a+b;
        System.out.println("求和结果："+a+"+"+b+"="+c);
    }
}
