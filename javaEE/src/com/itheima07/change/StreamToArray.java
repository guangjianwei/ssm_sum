package com.itheima07.change;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("jack","rose","ken");

        // 转换成 数组 因为泛型擦除原因 接收的时候是Object[]
//        Object[] objects = stream.toArray();

//        System.out.println(Arrays.toString(objects));
        //  <A> A[] toArray(IntFunction<A[]> generator)
//        String[] arr = stream.toArray(String[]::new);

        String[] arr = stream.toArray(len->new String[len]);

        System.out.println(Arrays.toString(arr));

    }
}
