package com.itheima05.streammetod;

import java.util.stream.Stream;

/*
  可以通过filter方法将一个流转换成另一个子集流。方法签名：

    Stream<T> filter(Predicate<? super T> predicate);

该接口接收一个Predicate函数式接口参数（可以是一个Lambda或方法引用）作为筛选条件。

    Stream只能消费一次
 */
public class Demo01Filter {

    public static void main(String[] args) {
        // 获取流 
        Stream<String>  one = Stream.of("宋江","卧龙","孔明","诸葛亮","及时雨");
        
        // 完成一个操作 获取一个子集流 要求 名字长度是2的 
//        Stream<String> two = one.filter((e) -> {return e.length() == 2;});
        Stream<String> two = one.filter(e -> e.length() == 2);

//        one.forEach(e-> System.out.println(e));

        // 使用了一个forEach就是用来  逐一获取 流中的每一个元素
        two.forEach(e-> System.out.println(e));// 消费接口 就是消费里面的元素

    }
}
