package com.itheima01.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
  数组当中有多条“姓名+性别”的信息如下，请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
  需要同时满足两个条件：

    1. 必须为女生；
    2. 姓名为4个字。

    分析：
       两个条件  函数式接口 Predicate 表示条件的接口
          就是要用到 两个函数式接口 作为参数

       结果  一个集合ArrayList集合


 */
public class Test {

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };

        ArrayList<String> list = getList(array,
                                         s->s.split(",")[1].equals("女"),
                                         s->s.split(",")[0].length()==4);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> getList(String[] array, Predicate<String> one,Predicate<String> two){
        ArrayList<String> list = new ArrayList<>();

        for (String s : array) {
            // 两个条件之间什么关系  与的关系
           boolean flag =  one.and(two).test(s);

           if(flag){
               list.add(s);
           }
        }

        return list;
    }
}
