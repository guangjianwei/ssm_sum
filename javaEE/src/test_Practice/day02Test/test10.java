package test_Practice.day02Test;

import java.util.ArrayList;
import java.util.Random;

/*
十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class test10 {
    public static void main(String[] args) {
        //1.产生10个1-100的随机数,把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
        //(1)定义长度为10的int数组
        int[] arr = new int[10];
        //(2)创建产生随机数的对象
        Random r = new Random();
        //(3)产生随机数,并存入数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        //(4)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
        //定义List集合
        ArrayList<Integer> list = new ArrayList<>();
        //遍历arr数组,将>=10的元素存入到list集合中
        for (Integer thisNum : arr) {
            if (thisNum >= 10) {
                list.add(thisNum);
            }
        }
        System.out.println("产生的随机数是:" + list);
    }
}
