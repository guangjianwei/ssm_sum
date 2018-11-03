
/*1.定义长度为10的int类型数组
    2.使用随机数(范围20-50之间,包括20和50)为数组进行赋值
    3.定义方法change(int[] arr),方法内实现,将数组中的奇数变为原来的2倍
    4.打印转换前及转换后的数组,格式如下:
    转换前:[21,25,26,28,29,50,48,47,45,44]
    转换后:[42,50,26,28,58,50,48,94,90,44]
    5.main方法中进行测试*/

import java.util.Random;

public class testOne {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            int newRan = ran.nextInt(31);
            arr[i] = newRan+20;
        }
        System.out.println("转换前：");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("转换后：");
        change(arr);

    }
    public static void change(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2>0){
                arr[i] =arr[i]*2;
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }



}
