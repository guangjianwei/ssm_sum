package test_Practice.day13Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
练习七：组合：concat、结果收集(list)
问题：
已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合
 */
public class test7 {
    public static void main(String[] args) {
        String[] str1 = {"郭靖","杨康"};
        String[] str2 = {"黄蓉","穆念慈"};
        Stream<String> stream1 = Stream.of(str1) ;
        Stream<String> stream2 = Stream.of(str2) ;
        Stream<String> concat = Stream.concat(stream1, stream2);
        List<String> list = concat.collect(Collectors.toList());
        System.out.println(list);

    }
}
