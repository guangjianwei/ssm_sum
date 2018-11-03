package day13.Stream;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("jeck");
        list.add("jeck1");
        list.add("jeck2");
        list.add("jeck3");
        list.add("jeck4");
        list.stream().forEach(System.out::println);
    }
}
