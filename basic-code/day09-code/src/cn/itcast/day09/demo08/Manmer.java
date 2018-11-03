package cn.itcast.day09.demo08;


import java.util.ArrayList;
import java.util.Random;

public class Manmer extends User {
    public  Manmer(String name,int money){
        super("群员",0);
    }
   public void receive(ArrayList<Integer> list){//传入已经分布好的钱数组和发红包人数进来
       Random num = new Random();
       int j = num.nextInt(list.size());//根据list.size()来进行数组的数据提取减员
       this.LeftMoney = list.get(j);
       System.out.println(this.LeftMoney);//打印调试
       list.remove(j);
   }
}
