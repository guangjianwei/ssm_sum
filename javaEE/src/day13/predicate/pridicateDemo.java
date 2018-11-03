package day13.predicate;


import java.util.function.Predicate;

//对数据进行判断
public class pridicateDemo {
    public static void main(String[] args) {
        String str = "ajjksjdfaj";
         opinion(str,(s)->s.contains("a"));
    }
    public static void opinion(String str, Predicate<String> predicate){
        boolean flag = predicate.test(str);
        System.out.println(flag);

    }
}
