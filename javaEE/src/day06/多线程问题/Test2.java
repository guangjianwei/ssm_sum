package day06.多线程问题;

public class Test2 {
    public static void main(String[] args) {
        MyRunnable2 myRunable2 = new MyRunnable2();
        System.out.println("抽奖开始...");
        System.out.println("=======================");
        for (int i = 0; i < 12; i++) {
            new Thread(myRunable2,"抽奖箱1").start();
            new Thread(myRunable2,"抽奖箱2").start();
        }
    }
}
