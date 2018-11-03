package com.itheima04.stream;

import java.util.*;
import java.util.stream.Stream;

/*
   java.util.stream.Stream
       这是一个管道接口 并不是一个函数式接口

       我们常用的集合Collection 可以转换成一个 流Stream

       Collection中 有个 功能 叫做
       Stream<E> stream()

       Stream 能不能new呢？
       在JDK8 出来的时候 为Stream提供了一个静态功能of
        Stream<String> s = Stream.of("a","shklshj");
        Stream<Integer> si = Stream.of(1,2,3);
 */
public class CollectionToStream {

    public static void main(String[] args) {
        //List 转换为Stream
        List<String> list = new ArrayList<>();
        // 转换成 Stream管道
        Stream<String> stream = list.stream();

        //Set集合 转换为Stream
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();


        // Map呢
        Map<String,String> map = new HashMap<>();

        Stream<String> stream2 = map.keySet().stream();

        Stream<String> stream3 = map.values().stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();


    }
}
