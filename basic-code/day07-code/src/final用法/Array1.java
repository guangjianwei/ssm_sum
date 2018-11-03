package final用法;
/*
	1.通过键盘录入一个数字，作为数组的长度
	2.根据录入的数字，创建一个长度为该数字的数组
	3.通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
	4.求出数组中最大数字
	5.求出数组中的数字平均值
*/

import java.util.Random;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            Random ran = new Random();
            arr[i] = ran.nextInt(100);
        }
        int max = getMax(arr);
        int avg = getAvg(arr);
        System.out.println("数组中的最大值："+max);
        System.out.println("数组中的平均值："+avg);

    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            }
            return max;
    }
    public static int getAvg(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum= sum+arr[i];
            }
        int avg = sum/arr.length;
            return avg;
    }

}
