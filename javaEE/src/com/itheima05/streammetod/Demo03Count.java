package com.itheima05.streammetod;

import java.util.stream.Stream;

/*
  count计数  聚合函数

     long count() 终结方法
       该方法 返回一个long值代表元素的个数
       （不再像旧集合那样 int）
 */
public class Demo03Count {

    public static void main(String[] args) {
        Stream<String> one = Stream.of("宋江", "卧龙", "孔明", "诸葛亮", "及时雨");

        // 完成一个操作 获取一个子集流 要求 名字长度是2的
        Stream<String> two = one.filter((e) -> {return e.length() == 2;});

        long count = two.count();

        System.out.println(count);

        // one 还能再获取个数吗？  不能了  因为Stream只能消费一次
       // two 还能再进行 forEach方法调用吗 不能了



    }
}
