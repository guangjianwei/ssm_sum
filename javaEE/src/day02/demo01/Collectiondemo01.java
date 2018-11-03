package day02.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collectiondemo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("傻逼宝一号");//Collection 的一种添加元素的方法
        coll.add("傻逼宝二号");
        coll.add("傻逼宝三号");
        System.out.println("=========添加========");
        System.out.println(coll);//这是集合打印的一种方法
        for (String s : coll) {
            System.out.print(s+" ");//这是集合遍历的一种方法
        }
        System.out.println();
        System.out.println("=======清空==========");
        coll.clear();
        System.out.println(coll);//清空集合内的所有元素
        coll.add("傻逼宝一号");//Collection 的一种添加元素的方法
        coll.add("傻逼宝二号");
        coll.add("傻逼宝三号");
        System.out.println(coll);
        System.out.println("========删除指定元素=========");
        coll.remove("傻逼宝一号");//这是Collection的删除单一元素的方法
        System.out.println(coll);
        System.out.println("========判断集合是否包含指定的元素=========");
        System.out.println("集合中是否有‘傻逼宝二号’："+coll.contains("傻逼宝三号"));
        System.out.println("========判断当前集合是否为空=========");
        System.out.println("集合中是否为空："+coll.isEmpty());
        System.out.println("========判断当前集合元素个数=========");
        System.out.println("集合中元素个数："+coll.size());
        System.out.println("========把元素存到数组中=========");
        Object[] objects = coll.toArray();
        System.out.println("打印新生成的数组："+Arrays.toString(objects));



    }
}
