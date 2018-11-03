package day13.predicate;

import java.util.function.Predicate;

public class predicateAnd {
    public static void main(String[] args) {
        String str = "ajsldkfjklsfjla";
        boolean a = getOpinon(str, s -> s.length() > 5, s -> s.contains("a"));
        System.out.println(a);
    }

    private static boolean getOpinon(String str, Predicate<String> one, Predicate<String> two) {
        return one.and(two).test(str);
    }
}
