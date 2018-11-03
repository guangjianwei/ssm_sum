package cn.itcast.day05.demo01;

public class ArrMax {
    public static void main(String[] args) {
        int[] arr = {1,5,6,88,44};
        for(int min=0,max=arr.length-1;min<=max;min++,max--){
            //这里面的max要-1，一定要注意
            int index = arr[min];
            arr[min] = arr [max];
            arr[max] = index;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
}
