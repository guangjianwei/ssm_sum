package demo01.test;

public interface Fu {
    void study();
    default void stu(){
        System.out.println("天天向上");
    }
}
