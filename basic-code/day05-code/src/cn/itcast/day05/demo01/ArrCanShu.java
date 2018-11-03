package cn.itcast.day05.demo01;

public class ArrCanShu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,66,88};//这个不能够写在main函数的外面为什么？？？
        getAll(arr);
    }

    public static void getAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
}
