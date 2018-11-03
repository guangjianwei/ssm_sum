package 测试;
/*
定义打印一个1-100以内所有偶数组成的数组，大于50的定义为一个新数组，小于50的定义为一个新数组
 */
public class Num6 {
    public static void main(String[] args) {
        int count = 0;
        int index =0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                count++;
            }
        }
        int[] arr1 = new int[count];
        for (int i = 1; i <=100; i++){
            if(i%2==0){
                arr1[index]=i;
                index++;
            }
            }
        System.out.print("原数组：");
        for (int i = 0; i < count; i++) {
            System.out.print(arr1[i]+",");
        }
        System.out.println();
        System.out.print("左数组：");
        for (int i = 0; i < 25; i++) {
            System.out.print(arr1[i]+",");
        }
        System.out.println();
        System.out.print("右数组：");
        for (int i = 25; i<50; i++) {
            System.out.print(arr1[i]+",");
        }
    }
}
