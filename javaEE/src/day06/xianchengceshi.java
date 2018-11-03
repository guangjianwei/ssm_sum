package day06;

import java.util.ArrayList;

public class xianchengceshi {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
//         myp m=new myp(list);
        new Thread(new myp(list),"f").start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        list = m.list;
        System.out.println(list);
    }
}
