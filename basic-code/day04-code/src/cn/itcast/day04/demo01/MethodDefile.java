package cn.itcast.day04.demo01;

public class MethodDefile {
    public static void main(String[] args) {
        double sumAll = sum(3,5);
        System.out.println(sumAll);
    }
    public static double sum(int a,int b){
        double sum =a+b;
        return sum;
    }
    public static double sum(double a,double b){
        double sum = a+b;
        return sum;
    }
}
