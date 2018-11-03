package cn.itcast.day06.demo01.demo01;

public class demo01 {
    public static void main(String[] args) {

        Phone one =  new Phone("诺基亚",4999);
        System.out.println("正在使用"+one.getBrand()+"手机进行");
        one.call();
        System.out.println("正在使用"+one.getBrand()+"手机进行");
        one.sendMessage();
        System.out.println("正在使用"+one.getBrand()+"手机进行");
        one.playGame();
    }
}
