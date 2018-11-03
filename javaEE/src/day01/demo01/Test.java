package day01.demo01;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        String a = "武林";
        String b = new String("武林");
        System.out.println(a.equals(b));
        LinkedList<String> link = new LinkedList<>();
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");
        System.out.println(link);
        System.out.println(link.pop());
        System.out.println(link);
    }
}
