package cn.itcast.day05.demo01;

public class ArrFanHui {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,88,66,44};
       int[] all = getAll(arr);
        System.out.println("求和是："+all[0]+"平均数是："+all[1]);
    }
    //求和和平均数，然后打包用数组的方式返回
    public static int[] getAll(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        int aug = sum/arr.length;
        int[] all = new int[2];
        all[0]=sum;
        all[1]=aug;
        return all;
    }
}
