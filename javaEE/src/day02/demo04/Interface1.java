package day02.demo04;

public interface Interface1<E> {
    void add(E e);
   default void get(E t){
       System.out.println(t);
   }
}
