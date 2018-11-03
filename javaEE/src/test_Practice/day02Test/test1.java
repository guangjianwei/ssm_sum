package test_Practice.day02Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("jeck");
        coll.add("coll");
        coll.add("tim");
        coll.add("work");

        Iterator<String> itor = coll.iterator();
        while(itor.hasNext()){
            System.out.println(itor.next());
        }

    }
}
