package cn.itacast.day07.demo01;

import java.util.Scanner;

public class Demo06PrintArray2 {
    //匿名对象作为返回值
    public static void main(String[] args) {
        Scanner sc = getScannerPrintInt();
        System.out.println("您输入的值是："+sc.nextInt());
    }
   public static Scanner getScannerPrintInt(){
        Scanner sc = new Scanner(System.in);
        return sc;
   }
}
