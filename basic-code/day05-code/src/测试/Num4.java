package 测试;

public class Num4 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <=100; i++) {    //i要从1开始，不然count的数就大一位
            if (i % 7 == 0) {
                count++;
            }

        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = 0; i <100; i++) {
            if ((i+1) % 7 == 0) {
                arr[j] = i+1;
                j++;
            }
        }
        int maxResoult = getMax(arr);
        System.out.println("最大值为：" + maxResoult);
        int minResoult = getMin(arr);
        System.out.println("最小值为：" + minResoult);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+",");
        }
        System.out.println();
        getChange(arr,maxResoult,minResoult,count);


    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = 100;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void getChange(int[] arr, int m, int n,int count) {
        for (int i = 0; i < count; i++) {

            if (arr[i] == m) {
                arr[i] = n;
            } else if (arr[i] == n) {
                arr[i] = m;
            }
            }
        for (int j = 0; j < count; j++) {
            System.out.print(arr[j]+",");
        }
            }
}
