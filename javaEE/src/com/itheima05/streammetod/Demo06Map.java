package com.itheima05.streammetod;

import java.util.stream.Stream;

/*
  如果需要将流中的元素映射到另一个流中，可以使用map方法。方法签名：

    <R> Stream<R> map(Function<? super T, ? extends R> mapper);

该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流

       Stream<String> one   ------>Stream<Integer> two
           通过map方法实现
              将 one中的元素的类型T 经过一系列的操作 转换成 two中定义的类型R对象
                  每一个转换的类型 都产生了对应的关系 这种关系叫映射 map
                     Function<T,R>
                       R apply(T t)

            其实对于我们来说 就是来实现Lambda 其实就是实现转换规则 在参数列表上实现

 */
public class Demo06Map {

    public static void main(String[] args) {
        Stream<String> one = Stream.of("1","2","3","4");

        // 通过 map方法   Stream<String> one   ------>Stream<Integer> two
//        Stream<Integer> two = one.map(s -> Integer.parseInt(s));
        Stream<Integer> two = one.map(Integer::parseInt);

        two.forEach(System.out::println);
    }
}
