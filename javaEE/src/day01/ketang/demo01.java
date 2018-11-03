package day01.ketang;

import java.util.ArrayList;
import java.util.Collection;

/*
使用多态的方式创建Collection对象
调用add方法向集合中添加3个字符串元素(itcast,itheima,哈哈哈)
调用remove方法删除字符串("哈哈哈")
打印集合的长度
将集合转成数组, 并将数组元素输出在控制台
 */
public class demo01 {
    public static void main(String[] args) {
        Collection<String> coll =new ArrayList<>();
        coll.add("itcast");
        coll.add("itheima");
        coll.add("哈哈哈");
        coll.remove("哈哈哈");
        System.out.println(coll.size());
        Object[] obj = coll.toArray();
        for (Object o : obj) {
            System.out.print(o+" ");
        }
    }
}
