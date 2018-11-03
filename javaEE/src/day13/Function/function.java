
package day13.Function;


import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        String str = "123";
        getInt(str,Integer::parseInt);
    }
    public static void getInt(String str,Function<String,Integer> function){
        Integer apply = function.apply(str);
        System.out.println(apply);

    }
}
