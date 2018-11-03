package day01.demo05.Throw;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Object a=null;
        Object b = "";
        Object c = Objects.requireNonNull(a);
        System.out.println(c);
    }
}
