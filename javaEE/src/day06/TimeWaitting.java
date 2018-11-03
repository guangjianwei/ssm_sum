package day06;

public class TimeWaitting {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i%10==0) {
                System.out.println("哦哈哈哈哈哈哈哈");
            }else{
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
