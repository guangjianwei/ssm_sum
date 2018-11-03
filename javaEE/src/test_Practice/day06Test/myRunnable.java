package test_Practice.day06Test;

public class myRunnable implements Runnable {
   static int count=0;
    @Override
    public void run() {
        crossCrave();
    }

    private void crossCrave() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"是第"+count+"个通过山洞的。");
    }
}
