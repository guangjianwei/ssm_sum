package day14_1.check;

public class Calculator {
    @Check
    public static void sum(){
        System.out.println("1+1"+"="+(1+1));
    }
    @Check
    public static void sub(){
        System.out.println("2-1"+"="+(2-1));
    }
    @Check
    public static void mul(){
        System.out.println("3*2"+"="+(3*2));
    }
    @Check
    public static void div(){
        System.out.println("2/0"+"="+(2/0));
    }
    public static void show(){
        System.out.println("傻逼宝");
    }
}
