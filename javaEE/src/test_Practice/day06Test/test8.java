package test_Practice.day06Test;
/*

 */
public class test8 extends Thread{
    int a = 1;

    public static void main(String[] args) {
        test8 thread = new test8();
        thread.start();
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + "执行第:" + i + "次");
        }
    }

    @Override
    public void run() {
        for (; a <= 20; a++) {
            System.out.println(Thread.currentThread().getName() + "执行第:" + a + "次");
        }
    }
}
