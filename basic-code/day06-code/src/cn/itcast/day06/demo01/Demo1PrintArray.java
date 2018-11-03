package cn.itcast.day06.demo01;

import java.util.Arrays;

public class Demo1PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 444, 55, 66, 88, 88, 99};
        int len = arr.length;
        //利用面对过程的方式进行数组的打印
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + ",");
            if (i == len - 1) {
                System.out.print(arr[i] + "]");
            }
        }
        System.out.println("");
        System.out.println("=======================");
        //这个是利用面对对象的方法进行答应数组
        System.out.println(Arrays.toString(arr));
    }
}
