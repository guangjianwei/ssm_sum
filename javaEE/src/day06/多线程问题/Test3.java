package day06.多线程问题;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(
                ()-> {
                    for (int i = 0; i < 100; i++) {

                    System.out.println(123);

                    }
                }
        );
        t1.start();
        t1.join();
        System.out.println(333);
    }
}
