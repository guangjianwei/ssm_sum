package com.itheima05.streammetod;

import java.util.stream.Stream;

/*
 如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：

    Stream<T> skip(long n);

如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。基本使用：

 */
public class Demo05Skip {

    public static void main(String[] args) {
        Stream<String> skip = Stream.of("鲁智深", "鲁班七号", "提莫", "盲僧", "狄仁杰", "元芳")
                                    .skip(2);

        skip.forEach(System.out::println);
    }
}
