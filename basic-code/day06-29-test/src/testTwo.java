/*
定义 getNewArr()方法:要求传入一个int类型的数组arr,遍历数组，
将数组中小于10的元素替换成0，然后将数组中的元素存储到新的数组中并返回
在main方法中完成:
1.定义一个长度为5的int类型的数组
2.随机生成5个随机数存入数组(随机数的范围为5到50,包括5和50)，并把数组中的元素打印在控制台
3.调用getNewArr方法,在控制台打印返回后的数组中的元素
格式如下:
随机生成的数组中的元素是:
48 8 35 25 39
调用方法修改后的数组中的元素是:
48 0 35 25 39
 */

import java.util.Random;
public class testTwo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random ran= new Random();
        for (int i = 0; i < arr.length; i++) {
            int newRan = ran.nextInt(47)+4;
            arr[i]=newRan;
        }
        System.out.println("随机生成数组中的元素是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<10) {
                arr[i]=0;
            }
            }
        System.out.println();
        System.out.println("调用方法修改后的数组中的元素是:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    }

