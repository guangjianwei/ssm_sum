package cn.itcast.day09.demo08;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User{
    public  Manager(String name,int money){
        super(name,money);
}
    public ArrayList<Integer> sendMoney(int tollMoney, int count) {//需要传入发的钱数以及人数
        if(tollMoney>this.LeftMoney){
            System.out.println("对不起，您的余额不足！");
            return null;
        }else {
            int avg = tollMoney / count;
            int tol = tollMoney % count;//取余数
            Random num = new Random();
            int j = num.nextInt(count);//count以内的随机数，不包含count
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                if(i==j){
                    list.add(avg+tol);
                }else {
                    list.add(avg);
                }
            }
            //
            this.LeftMoney = this.LeftMoney-tollMoney;
            return list;
        }
    }
}
