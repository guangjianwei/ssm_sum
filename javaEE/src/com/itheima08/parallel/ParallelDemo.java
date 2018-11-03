package com.itheima08.parallel;

import java.util.List;

/*
  并行 流
     获取平行流
       集合 调用parallelStream

      Stream 具有平行处理能力  处理的过程分而治之
      将大任务切割小任务 一起来执行
 */
public class ParallelDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 获取并行流
        numbers.parallelStream().forEach(System.out::println);
    }
}
