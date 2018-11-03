package day01.ketang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
创建集合对象并添加3个任意字符串元素
获取迭代器
通过hasNext()循环判断集合中是否还有元素
调用next方法获取元素
 */
public class demoIterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("大力娃");
        coll.add("金刚娃");
        coll.add("千里娃");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String is = it.next();
            System.out.println(is);
        }

    }
}
