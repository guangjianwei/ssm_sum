package day07;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("我需要一个教练...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("教练来了"+Thread.currentThread().getName());
        System.out.println("教练返回线程池");
    }
}
