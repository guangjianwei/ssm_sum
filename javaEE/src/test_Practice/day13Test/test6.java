package test_Practice.day13Test;

import java.util.stream.Stream;

/*
练习六：映射：map、逐一消费：forEach
问题：
有如下整数1，-2，-3，4，-5
使用Stream取元素绝对值并打印
 */
public class test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,-2,-3,4,-5);
        stream1.map(Math::abs).forEach(System.out::println);
    }
}
