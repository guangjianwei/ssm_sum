package com.itheima03.stream;

import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = List.of("虚竹", "王重阳", "南院大王", "隔壁老王", "王大锤");

        // 使用Stream的思想  JDK8 流式思想 (函数式编程思想) 专注于 做什么
//        list.stream().filter(s->s.contains("王")).filter(s->s.length()==3).forEach(e-> System.out.println(e));
        list.stream().filter(s->s.contains("王")).filter(s->s.length()==3).forEach(System.out::println);
        // 获取流   过滤 带 王的      过滤长度为3  逐一打印
    }
}
