package com.itheima08.parallel;

import java.util.List;

//串行 就是连续的 一个个来
public class SerialDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        numbers.stream().forEach(System.out::println);
    }
}
