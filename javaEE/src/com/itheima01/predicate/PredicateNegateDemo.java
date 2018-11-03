package com.itheima01.predicate;

import java.util.function.Predicate;

/*
   java.util.function.Predicate<T>接口
      有时候我们需要对某种类型进行数据判断，从而得到一个boolean的结果
     Predicate<T> 接口就是定义这样操作的

     我们理解这个接口  条件判断接口
     Predicate<T>

     boolean test(T t)

     判断 传递的 该类型对象  符合不符合条件

     而这个 条件的具体代码 是通过Lambda实现

     非的条件
        就是取反的意思
         negate() 方法就是取反的意思

 */
public class PredicateNegateDemo {

    public static void main(String[] args) {
        String name = "lksaks";

        boolean flag = checkString(name,s -> {
            // 判断 该字符串 是否包含了a  包含了a 符合 没包含 不符合
            return s.contains("a");
        });

        System.out.println(flag);
    }
    /*
      设计一个方法 判断该字符串 符不符合某种条件
     */
    public static boolean checkString(String s, Predicate<String> lambda){


//        return !lambda.test(s);

        return lambda.negate().test(s);
    }
}
