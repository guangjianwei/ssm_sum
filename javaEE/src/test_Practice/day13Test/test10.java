package test_Practice.day13Test;

import com.itheima06.test.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
练习十：Stream综合练习
问题：
以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ： 
1、现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
2、通过流的方式
	1）打印全球影片排行榜中的前三甲影片名
	2）打印华人影片排行榜中倒数5名的影片名
	3）将两个排行榜中的前5名挑出来共同存入新的集合
	4）定义电影Film类，以影片名为name创建Film对象并保存至集合
 */
public class test10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("《教父》",
                "《肖申克的救赎》","《辛德勒的名单》","《公民凯恩》",
                "《卡萨布兰卡》 ","《教父续集》","《七武士》","《星球大战》","《美国美人》","《飞跃疯人院》"));
        List<String> list2 = new ArrayList<>(List.of("《霸王别姬》",
                "《大闹天宫》","《鬼子来了》","《大话西游》",
                "《活着》 ","《饮食男女》","《无间道》","《天书奇谭》"," 《哪吒脑海》","《春光乍泄》"));
        list.stream().limit(3).forEach(System.out::println);
        list.stream().limit(list2.size()-5).forEach(System.out::println);
        Stream<String> limit = list.stream().limit(5);
        Stream<String> limit1 = list2.stream().limit(5);
        List<File> collect = Stream.concat(limit, limit1).map(File::new).collect(Collectors.toList());
        System.out.println(collect);


    }
}
