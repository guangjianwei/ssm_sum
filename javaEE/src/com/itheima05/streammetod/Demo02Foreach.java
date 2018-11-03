package com.itheima05.streammetod;

import java.util.stream.Stream;

/*
    void forEach(Consumer<T> action)
        该方法 作为遍历 用的   该方法并不保证元素逐一消费动作在流中是有序被执行
                                   串行  并发
      该方法的参数 是一个函数式接口Consumer接口
        那么就说明在调用该方法的时候 会将 流中的每一个元素 交给该函数处理

        void accept(T t)
        于是 我们写Lambda表达式 就是表达 消费处理  每一个元素
 */
public class Demo02Foreach {

    public static void main(String[] args) {
        Stream<String> yangcun = Stream.of("喜羊羊","美羊羊","暖羊羊","慢羊羊");

        // 将流中元素 逐一进行消费
//        yangcun.forEach(t-> System.out.println(t));
        System.out.println("------------------");
        yangcun.forEach(System.out::println);




    }
}
