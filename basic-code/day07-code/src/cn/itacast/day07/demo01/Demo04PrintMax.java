package cn.itacast.day07.demo01;

import java.util.Scanner;

public class Demo04PrintMax {
    public static void main(String[] args) {
        System.out.println("请输入第一个数字：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数字：");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个数字：");
        int c = new Scanner(System.in).nextInt();
        int max = a>b?a:b;
        int smax= max>c?max:c;
        System.out.println("最大值就是："+smax);
    }
}
