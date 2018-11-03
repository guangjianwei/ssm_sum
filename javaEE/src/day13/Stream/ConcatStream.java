package day13.Stream;

import java.util.stream.Stream;

public class ConcatStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("11", "22", "33", "44");
        Stream<String> stream1 = Stream.of("55", "66", "77", "88");
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(System.out::println);
    }
}
