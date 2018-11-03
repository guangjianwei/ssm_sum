package com.itheima04.stream;

import java.util.stream.Stream;

/*
  数组转换成 Stream管道

 */
public class ArrayToStream {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a","askjskj");

        String[] array = {"sksh","super"};

        Stream<String> array1 = Stream.of(array);
    }
}
