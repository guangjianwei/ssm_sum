package day06.多线程问题;



public class Test {
    public static void main(String[] args) {
        MyRunnable1 myRunable = new MyRunnable1();
        System.out.println("抽奖开始...");
        System.out.println("=======================");
        for (int i = 0; i < 12; i++) {
            new Thread(myRunable,"抽奖箱1").start();
            new Thread(myRunable,"抽奖箱2").start();
        }

    }
}
