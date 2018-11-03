package cn.itcast.day04.demo01;

public class Demo3 {
    public static void main(String[] args) {
        double c = 2 * sum(1.2, 3.4);
        System.out.println(c);
    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }
}
