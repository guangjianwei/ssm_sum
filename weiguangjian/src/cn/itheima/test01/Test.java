package cn.itheima.test01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
21、按要求在main方法中完成以下功能：

           定义一个长度为5的int型数组arr，数组元素为1-99（范围包含1和99）之间的随机数

           提示用户输入2-5之间的一个数字num（num范围包括2和5,不需要代码判断）

           遍历数组arr,筛选出数组中元素是num倍数的数组元素并输出
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i]=ran.nextInt(100);
        }
        System.out.print("请输入2-5之间的数字(包含2和5)：");
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        int num = numStr.charAt(0)-48;
        System.out.println();
        System.out.print("被num整除：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%num==0){
                System.out.print(arr[i]+" ");
            }
        }

    }


}
