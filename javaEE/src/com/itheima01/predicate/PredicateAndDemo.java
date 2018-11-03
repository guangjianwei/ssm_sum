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

      既然是条件进行判断
          就会存在 与 或 非 三种常见的逻辑关系

          与
            两个条件 并列的关系

            如果要判断一个字符串是否符合某项规则

            规则包含独立的两个条件
              条件1  长度>5   条件2  包含a

            需要两个条件接口 来表示
      在Predicate源码中提供了一个默认的功能
      default Predicate<T> and(Predicate<? super T> other) {
          Objects.requireNonNull(other);
          return (t) -> test(t) && other.test(t);
      }

      默认的and方法表示并且的关系

 */
public class PredicateAndDemo {

    public static void main(String[] args) {
        String name = "lksnjkjkks";

        boolean flag = checkString(name,
                                   s->s.length()>5,
                                   s->s.contains("a"));

        System.out.println(flag);
    }
    /*
      设计一个方法 判断该字符串 符不符合某种条件
     */
    public static boolean checkString(String s, Predicate<String> one,Predicate<String> two){


//        return one.test(s) && two.test(s);

        return one.and(two).test(s);//这句话 跟上面的写法是一致的
    }
}
