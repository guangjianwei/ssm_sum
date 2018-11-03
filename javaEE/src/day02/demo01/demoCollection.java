package day02.demo01;

import day02.demo02.Interater;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demoCollection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("傻逼宝一号");
        coll.add("傻逼宝二号");
        coll.add("傻逼宝三号");
        System.out.println(coll);
        //遍历集合的增强for方式
        for (String s : coll) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("===========");
        //第二种方法利用迭代器的方法对集合进行遍历
        Iterator<String> it  = coll.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.print(s+" ");
        }
    }
}
