package test_Practice.day06Test;
/*

 */
public class test1 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(200);
        new Thread(()-> System.out.println("111")).start();
        new Thread(()-> System.out.println("222")).start();
        new Thread(()-> System.out.println("333")).start();
    }
}
