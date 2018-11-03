package day13.Function;

import java.util.function.Function;

/*
   请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：

    1. 将字符串截取数字年龄部分，得到字符串；将一个字符串转换成一个字符串
         Function<String,String>
          String apply(String big)
    2. 将上一步的字符串转换成为int类型的数字；
         利用上一步的结果  String small
         Function<String , Integer>
           Integer apply(String small)
    3. 将上一步的int数字累加100，得到结果int数字。
         Function<Integer,Integer>
          Integer apply(Integer i)
 */
public class test {
    public static void main(String[] args) {
      String message = "社会王,35";
        Integer str = getStr(message, s->s.split(",")[1], Integer::parseInt, i->i+100);
        System.out.println(str);
    }

    private static Integer getStr(String message, Function<String,String> one, Function<String,Integer> two, Function<Integer,Integer> three) {
       return one.andThen(two).andThen(three).apply(message);




    }

}
