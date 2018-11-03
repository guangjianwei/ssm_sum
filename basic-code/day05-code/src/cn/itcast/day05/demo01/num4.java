package cn.itcast.day05.demo01;

public class num4 {
    public static void main(String[] args) {
        int[] arr = {80,90,85,90,78,88,89,93,98,75};
        int[] all = getAll(arr);
        System.out.println("求和是：" + all[0] + "平均数是：" + all[1]);
    }

    public static int[] getAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int aug = sum / arr.length;
        int[] all = new int[2];
        all[0] = sum;
        all[1] = aug;
        return all;
    }
}
