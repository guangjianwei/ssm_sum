package cn.itacast.day07.demo01;

import java.util.Scanner;

public class Demo05PrintArray1 {
    //匿名对象作为参数
    public static void main(String[] args) {
        printSystemin(new Scanner(System.in));
    }
    public static void printSystemin(Scanner sc){
        System.out.println("您输入的数字是："+sc.nextInt());
    }
}
