package day13.Function;

import java.util.function.Function;

//原价：123--->123---->跳楼价：133
public class functionAndThen {
    public static void main(String[] args) {
        String str1= "原价:123";
        getStr(str1,
                s-> Integer.parseInt(s.split(":")[1])+10,
                i->"跳楼价:"+i);
    }

    private static void getStr(String str1, Function<String,Integer> one,Function<Integer,String> two) {
        String apply = one.andThen(two).apply(str1);
        System.out.println(apply);

    }
}
