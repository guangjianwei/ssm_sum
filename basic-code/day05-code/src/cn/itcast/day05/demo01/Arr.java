package cn.itcast.day05.demo01;

public class Arr {
    public static void main(String[] args) {
        int[] arr ={1,4,9,5,67,44};
        int len = arr.length;
        for(int i =0;i<len;i++){
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println(" "); //这里只是作为空行来使用
        //取数组中的最大值
        int max = arr[0];
        for(int j=1;j<arr.length;j++){
            if(max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println("数组中最大的数是："+max);
    }
}
