package day13.Stream;

import java.util.List;

public class filterDemo {
    public static void main(String[] args) {
        List<String> list = List.of("王重阳","王罗丹","孔明","诸葛亮","马丹","李杰");
        list.stream().filter(s->s.startsWith("王")).forEach(System.out::println);
    }
}
