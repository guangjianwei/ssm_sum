package day13.Stream;

import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("王重阳", "王罗丹", "孔明", "诸葛亮", "马丹", "李杰");
        System.out.println(stream.count());
    }
}