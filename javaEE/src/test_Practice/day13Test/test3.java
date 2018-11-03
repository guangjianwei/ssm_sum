package test_Practice.day13Test;

import java.util.*;
import java.util.stream.Stream;

/*
简述单列集合、双列集合、数组分别如何获取Stream流对象，并进行演示
 */
public class test3 {
    public static void main(String[] args) {
        //单列集合获取到Stream
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();
        //双列集合获取Stream
        Map<String,String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();
        //数组获取Stream
        String[] str = {"SFKSL","SFSF","胜多负少"};
        Stream<String> str1 = Stream.of(str);
        str1.forEach(System.out::println);
    }
}
