package day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//内比较器的使用
public class demo05Comparable {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>();
        coll.add("abb");
        coll.add("cdb");
        coll.add("bfb");
        coll.add("abb");
        System.out.println(coll);
        Collections.sort(coll);
        System.out.println(coll);
        Collections.sort(coll, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);
            }
        });
        System.out.println(coll);
    }
}
