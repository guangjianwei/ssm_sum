package com.itheima05.streammetod;

import java.util.stream.Stream;

/*
  合并功能
    如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat：

    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

备注：这是一个静态方法，与java.lang.String当中的concat方法是不同的。

 */
public class Demo07Concat {

    public static void main(String[] args) {
        Stream<String> huluwa = Stream
                .of("大力娃", "千里娃", "金刚娃", "水娃", "火娃", "隐身娃", "葫芦娃");
        Stream<String> yangcun = Stream
                .of("喜羊羊", "懒羊羊", "美羊羊", "沸羊羊", "暖羊羊", "慢羊羊");

        Stream<String> concat = Stream.concat(huluwa, yangcun);

        concat.forEach(System.out::println);
    }
}
