package day13.Stream;

import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a","dfsfd");
        String[] str = {"f","fasfasfd"};
        Stream<String> stream1 = Stream.of(str);
        stream1.forEach(System.out::println);
    }
}
