package cn.itcast.day09.demo08;

import java.util.ArrayList;

//群里一共有7个人，一个群主6个群员。群主要发你个普通红包
public class demo08 {
    public static void main(String[] args) {
        System.out.println("========群主发红包啦=======");
//        System.out.println("=========================");
        Manager manager = new Manager("群主",300);
        Manmer one = new Manmer("丑逼宝",0);
        Manmer two = new Manmer("傻吊求",0);
        Manmer three = new Manmer("逗比雷",0);
        Manmer four = new Manmer("帅见见",0);
        Manmer five = new Manmer("郭妃",0);
        Manmer six = new Manmer("疯子",0);
        System.out.println("领红包之前：");
        System.out.println("红包数目："+manager.LeftMoney);
        System.out.println("红包数目："+one.LeftMoney);
        System.out.println("红包数目："+two.LeftMoney);
        System.out.println("红包数目："+three.LeftMoney);
        System.out.println("红包数目："+four.LeftMoney);
        System.out.println("红包数目："+five.LeftMoney);
        System.out.println("红包数目："+six.LeftMoney);
        ArrayList<Integer> list = manager.sendMoney(100,6);
        System.out.println("群主发红包数目：");
        one.receive(list);
        two.receive(list);
        three.receive(list);
        four.receive(list);
        five.receive(list);
        six.receive(list);
        System.out.println("领红包之后：");
        System.out.println("红包数目："+manager.LeftMoney);
        System.out.println("红包数目："+one.LeftMoney);
        System.out.println("红包数目："+two.LeftMoney);
        System.out.println("红包数目："+three.LeftMoney);
        System.out.println("红包数目："+four.LeftMoney);
        System.out.println("红包数目："+five.LeftMoney);
        System.out.println("红包数目："+six.LeftMoney);


    }
}
