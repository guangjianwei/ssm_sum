package day13.Stream;

import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("王重阳", "王罗丹", "孔明", "诸葛亮", "马丹", "李杰");
        str.limit(2).forEach(System.out::println);
    }
}
