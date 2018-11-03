package day03;

import java.util.HashSet;
import java.util.Iterator;

public class demo03HashSet {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("abc");
        hash.add("bca");
        hash.add(new String("abc"));
        hash.add("cba");
        hash.add("bca");
        System.out.println(hash);
        System.out.println("======增强for进行遍历=======");
        for (String s : hash) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("===========迭代器进行遍历============");
        Iterator<String> ite =hash.iterator();
        while(ite.hasNext()){
            String it = ite.next();
            System.out.print(it+",");
        }
    }
}
