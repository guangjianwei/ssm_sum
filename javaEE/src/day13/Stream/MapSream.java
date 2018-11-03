package day13.Stream;

import java.util.stream.Stream;

//把Stream<String> str1------->Stream<Integer> str2
public class MapSream {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("11", "22", "33", "44", "55", "666");
          str.map(Integer::parseInt).forEach(System.out::println);
    }
}
