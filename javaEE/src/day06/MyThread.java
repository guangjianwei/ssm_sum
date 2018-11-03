package day06;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        printIn();
    }

    public static void printIn() {
        for (int i = 0; i < 100; i++) {
            System.out.println("帅见见456-----》"+i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
