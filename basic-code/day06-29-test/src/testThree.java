import java.util.Random;
import java.util.Scanner;
public class testThree {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            int newRan = ran.nextInt(49);
            arr[i] = newRan+2;
        }
        findNum(arr);
        int a = smllAvg(arr);
        System.out.println("个数为："+a);
    }
    public static void findNum(int[] arr){
        int count =0;
        Scanner sc = new Scanner(System.in);
        int numBer =sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(numBer ==arr[i]){
                count = i+1;
            }else if(i==arr.length-1 && count==0){
                System.out.println("不存在");
                return;

            }
        }
        System.out.println("最后一次出现的位置是："+count);

    }
    public static int smllAvg(int[] arr){
        int sum = 0;
        int avg = 0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            avg =sum/arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                count++;
            }
        }
        return count;
    }
}
