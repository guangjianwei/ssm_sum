package com.itheima05.streammetod;

import java.util.stream.Stream;

/*
  limit方法可以对流进行截取，只取用前n个。方法签名：

    Stream<T> limit(long maxSize);

参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作

 */
public class Demo04Limit {

    public static void main(String[] args) {
        Stream<String> limit = Stream
                .of("大力娃", "千里娃", "金刚娃", "水娃", "火娃", "隐身娃", "葫芦娃").limit(3);

//        System.out.println(limit.count());
        limit.forEach(System.out::println);
    }
}
