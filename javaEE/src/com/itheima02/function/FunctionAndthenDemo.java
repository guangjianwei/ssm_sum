package com.itheima02.function;

import java.util.function.Function;

/*
  默认方法
    andThen
         用来完成 组合操作的

      该方法 用于 “先做什么，再做什么”的场景 类似于 Consumer中的andThen

      其实就相当于连续的做转换

        "原价:123"---> 123+10 ---> "跳楼价:133"
            String     Integer     String
        这里面就有两个转换操作  就需要 两个转换接口

        Function<String,Integer>
           Integer apply(String s)

        上面操作的结果 再作为
        Function<Integer,String>
          String applay(Integer i)

       第二个函数式接口的  条件 是 第一个函数式接口的结果

       那么就需要对函数表达式 进行拼接

       Integer i = one.apply(s);
       String news = two.apply(i);

       one.andThen(two).apply(s);
 */
public class FunctionAndthenDemo {

    public static void main(String[] args) {
        String s = "原价:123";

        String newS = method(s,
                             ss -> Integer.parseInt(s.split(":")[1])+10,//第一个转换 是将字符串转换成int类型再+10
                             i->"跳楼价:"+i);

        System.out.println(newS);
    }

    public static String method(String s, Function<String,Integer> one,Function<Integer,String> two){

        return one.andThen(two).apply(s);
    }
}
