package day06;

import java.util.ArrayList;

public class myp implements Runnable{
public ArrayList<Integer> list;
public  myp(ArrayList<Integer> list){
    this.list=list;
}
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
