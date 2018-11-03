package cn.itacast.day07.demo01;

import java.util.ArrayList;

public class Demo09ArrayListAddStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("丑逼宝",34);
        Student two = new Student("傻掉求",34);
        Student three = new Student("逗比磊",34);
        Student four = new Student("帅见见",34);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("名字："+list.get(i).name+"年龄："+list.get(i).age);
        }
    }
}
