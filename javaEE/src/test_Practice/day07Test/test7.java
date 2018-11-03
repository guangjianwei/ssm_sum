package test_Practice.day07Test;

public class test7 implements Runnable{
        public static void main(String[] args) {
            Thread t = new Thread(new test7());
            t.start();
        }
@Override
        public void run() {
            for (int i = 0; i < 9; i++) {
                System.out.println(i);
            }
        }
}
