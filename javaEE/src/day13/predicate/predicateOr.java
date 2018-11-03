package day13.predicate;

import java.util.function.Predicate;

//
public class predicateOr {
    //对String类型的数据进行一个or的判读
    public static void main(String[] args) {
        String str = "ajfsdjflsa";
        getOpinion(str,s->s.length()>5,s->s.contains("l"));
    }

    private static void getOpinion(String str, Predicate<String> one,Predicate<String> two) {
        boolean test = one.or(two).test(str);
        System.out.println(test);

    }
}
