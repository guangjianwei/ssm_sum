package day04;

import java.util.List;
import java.util.Map;
import java.util.Set;

//Map,List,Set
public class demoListOf {
    public static void main(String[] args) {
        List<String> list = List.of("大力娃","金刚娃","葫芦娃");
        System.out.println(list);
        Set<String> set = Set.of("大力娃","金刚娃","葫芦娃");
        System.out.println(set);
        Map<String,Integer> map = Map.of("大力娃",1,"金刚娃",2,"葫芦娃",3);
        System.out.println(map);
    }
}
