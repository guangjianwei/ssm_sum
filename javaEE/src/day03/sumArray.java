package day03;
//可变参数的使用
public class sumArray {
    public static void main(String[] args) {
        sum(1,2,3);
        sum(1,2,55);
        sum(1,2,77,77);
    }

    private static void sum(int...arr) {
        int sum =0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
