package test_Practice.day13Test;

import com.itheima06.test.Person;

import java.util.stream.Stream;

/*
练习九：Stream综合练习
问题：
现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用Stream方式进行以
下若干操作步骤：
1. 第一个队伍只要名字为3个字的成员姓名；
2. 第一个队伍筛选之后只要前6个人；
3. 第二个队伍只要姓张的成员姓名；
4. 第二个队伍筛选之后不要前1个人；
5. 将两个队伍合并为一个队伍；
6. 根据姓名创建Student对象；
7. 打印整个队伍的Student对象信息。
 */
public class test9 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("郭靖","杨康","黄蓉","穆念慈","张玄风","梅超风","张乘风","曲灵风","张眠风","冯默风");
//        Stream<String> stream1 = stream.filter(s -> s.length() == 3).limit(6);
        Stream<String> stream2 = stream.filter(s -> s.startsWith("张")).skip(1);
//        Stream<String> concat = Stream.concat(stream1, stream2);
        Stream<Person> personStream = stream2.map(Person::new);
        System.out.println(personStream);


    }
}
