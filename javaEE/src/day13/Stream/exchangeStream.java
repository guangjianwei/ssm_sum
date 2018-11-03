package day13.Stream;

import java.util.*;
import java.util.stream.Stream;

public class exchangeStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> list1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream = set.stream();

        Map<String,String> map = new HashMap<>();
        Stream<String> map1 = map.keySet().stream();
        Stream<String> map2 = map.values().stream();

    }
}
