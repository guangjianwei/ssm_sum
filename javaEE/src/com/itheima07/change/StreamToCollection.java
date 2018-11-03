package com.itheima07.change;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
   Stream转集合

 */
public class StreamToCollection {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("jack","rose","ken");
        
        // 转换成 list
        List<String> list = stream.collect(Collectors.toList());
        
        // 转换成Set
        Set<String> set = stream.collect(Collectors.toSet());
    }
}
