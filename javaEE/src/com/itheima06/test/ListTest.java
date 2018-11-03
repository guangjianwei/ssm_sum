package com.itheima06.test;

import java.util.ArrayList;
import java.util.List;

/*
  现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）
  依次进行以下若干操作步骤：

    1. 第一个队伍只要名字为3个字的成员姓名；
    2. 第一个队伍筛选之后只要前3个人；
    3. 第二个队伍只要姓张的成员姓名；
    4. 第二个队伍筛选之后不要前2个人；
    5. 将两个队伍合并为一个队伍；
    6. 根据姓名创建Person对象；
    7. 打印整个队伍的Person对象信息。

 */
public class ListTest {

    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();

        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        // 第一个队伍只要名字为3个字的成员姓名
        ArrayList<String> oneA = new ArrayList<>();
        for (String name : one) {
            if(name.length()==3){
                oneA.add(name);
            }
        }
        // 第一个队伍筛选之后只要前3个人；
        ArrayList<String> oneB = new ArrayList<>();
        for (int i =0;i<3;i++) {
            oneB.add(oneA.get(i));
        }

        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        // 第二个队伍只要姓张的成员姓名；
        ArrayList<String> twoA = new ArrayList<>();
        for (String name : two) {
            if(name.startsWith("张")){
                twoA.add(name);
            }
        }

        // 第二个队伍筛选之后不要前2个人；
        ArrayList<String> twoB = new ArrayList<>();
        for (int i = 2;i<twoA.size();i++) {
            twoB.add(twoA.get(i));
        }

        // 将两个队伍合并为一个队伍；
        ArrayList<String> bigList = new ArrayList<>();

        bigList.addAll(oneB);
        bigList.addAll(twoB);
        // 根据姓名创建Person对象；  并存储到一个Person集合中
        ArrayList<Person> personList = new ArrayList<>();

        for (String name : bigList) {
            Person person = new Person(name);

            personList.add(person);
        }

        //遍历
        for (Person person : personList) {
            System.out.println(person);
        }

    }
}
