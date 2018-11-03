package 测试;

public class Num2 {
    public static void main(String[] args) {
        int[] arr ={12,25,36,45,78,96,121,456,0,7};
        int len = arr.length;
        System.out.print("[");
        for(int i =0;i<len;i++){
            if(i==len-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]);
                System.out.print(",");
            }
        }
        System.out.println();
        int sumResult = getSum(arr);
        System.out.println("数组总和为："+sumResult);
        int avgResult = getAvg(arr,sumResult);
        System.out.println("数组平均值："+avgResult);
        System.out.println("小于平均值的数：");
        findNum(arr,avgResult);
    }
    public static int getSum(int arr[]){
        int sum=0;
        for (int i = 0; i < 10; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int getAvg(int arr[],int sum){
        int avg = sum/arr.length;
        return avg;
    }
    public static void findNum(int[] arr,int avg){
        for (int i = 0; i < 10; i++) {
            if(arr[i]<avg){
                System.out.print(arr[i]+",");
            }
        }
    }
}
