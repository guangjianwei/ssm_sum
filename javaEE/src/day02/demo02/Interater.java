package day02.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Interater {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("傻逼宝一号");
        coll.add("傻逼宝二号");
        coll.add("傻逼宝三号");
        Iterator iterator =coll.iterator();//获取迭代器
//        System.out.println(iterator.next());//遍历
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        System.out.println("=====下面是完整迭代器遍历的写法========");
        while(iterator.hasNext()){
            String it = (String) iterator.next();
            System.out.println(it+"长度为"+it.length());
            System.out.println("=====下面是完整增强for的写法========");
                for(String is: coll){
                    System.out.println(coll+" ");
                }
           }
        }
    }

