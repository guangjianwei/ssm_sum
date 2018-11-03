package com.itheima02.function;

import java.util.function.Function;

/*
  java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
  前者称为前置条件，后者称为后置条件。有进有出，所以称为“函数Function”。

抽象方法：apply

Function接口中最主要的抽象方法为：R apply(T t)，
根据类型T的参数获取类型R的结果。

    转换功能
       传入T 类型的数据 经过 操作 转换成 R 类型数据
          转换的操作谁做呢 ？ Lambda表达式中完成

    使用的场景例如：将String类型转换为Integer类型。
        "123"--->123

 */
public class FunctionDemo {

    public static void main(String[] args) {
        String s = "1234";

//        int i = method(s,(str)->{
//
//            return Integer.parseInt(str);
//        });

//        int i = method(s,str-> Integer.parseInt(str));

        //方法引用 改进
        int i = method(s,Integer::parseInt);

        System.out.println(i);
    }
    /*
      传递一个字符串    转换接口Function<String,Integer> 将来就是实现转换的功能
      返回一个int类型数据
     */
    public static int method(String str, Function<String ,Integer> lambda){

        return lambda.apply(str);
    }
}
