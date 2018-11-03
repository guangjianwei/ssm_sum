package cn.itacast.day07.demo01;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.PERSIST_STORE;

import java.util.Scanner;
public class Demo02Array {
    public static void main(String[] args) {
        //正常的生成对象
        Person one = new Person("jim",10);
        System.out.println("姓名："+one.getName()+"年龄："+one.getAge());
        //仅仅有new一个东西的代表匿名对象
        new Person().setName("jack");
        System.out.println(new Person().getName());//此时的里面打印的是null，所以说匿名对象只能当作临时使用的对象，不能重复使用。

    }
}
