package cn.itcast.day09.demo02;

public class demo02BianLiang {
    public static void main(String[] args) {
        Zi zi = new Zi();
        Fu fu = new Fu();
        System.out.println(zi.name);//等号左边是谁，就是谁
        System.out.println(fu.name);
        System.out.println("=================");
        zi.getNameZi();
        zi.getNameFu();
        fu.getNameFu();
        System.out.println("==================");
        zi.getNameZi();
    }
}
