package day06;

public class Demo02 {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable,"帅见见");
        Thread thread1 = new Thread(myRunable,"傻吊求");
        thread.start();
        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("丑逼宝------》"+i);
        }
    }
}
