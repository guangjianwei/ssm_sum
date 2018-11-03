package 测试;

public class Num5 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println("原数组：");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if(i==10){
                int t= arr[0];
                arr[0]=arr[9];
                arr[9]=t;
                break;
            }
            int temp = arr[i];
            arr[i]= arr[i-1];
            arr[i-1]=temp;
        }
        System.out.println("交换后：");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
        }
    }
}
