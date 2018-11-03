package Java基础.集合模块;

import jdk.nashorn.api.tree.LiteralTree;

import java.util.*;

/*
*                                Collection 接口     									            	Map
                                       |                                                                 |
     ----------------------------------------------------------------                          ------------------------
     |                                                              |                          |                     |
    List接口                                                       Set接口                    HashMap类              treeMap类
     |                                                              |
 ----------------                                             -------------
 |              |                                             |            |
ArrayList类    LinkedList类                                 HashSet类     treeSet类
                                                              |
                                                         LinkedHashSet类
*
* Collection接口: 单列集合的顶层父类接口
*
* Collections类与Collection接口的区别:
*   Collections类不是Collection的子类,所以Collections不是一个集合类, 仅仅是集合的工具类, 封装了一些方法,帮助我们做一些集合的操作,本质上和集合没有关系,不是一个集合.
*
*   list接口: 有序\有索引\可重复
*         子类: ArrayList类, 底层为数组结构,所以查询块,增删慢.
*               LinkedList类,底层为链表结构,所以查询慢,增删块.
*
*   set接口:  无序\无索引\不可重复
*         子类: HashSet类, 存取无序,不可重复.
*               LinkedHashSet, HashSet的子类,可以保证存取有序并且元素唯一
*
*               栈  队列   数组  链表  二叉树
*
* 数组和集合的区别:
    数组：
        1.长度是固定的。
        2.而且数组即可以存储基本数据类型，也可以存储引用数据类型。
        3.而且通过数组存储的数据类型是一样的。
    集合：
        1.长度是可变的。
        2.集合只能存储引用数据类型。
        3.集合在不限定泛型的情况下,可以存任意引用类型.
*
* */
public class Test_Collection {
    public static void main(String[] args) {
        //迭代器的使用
//        IterableSelect();

        //arraylist的三种删除元素方式
//        remove_iterable();
//        remove_for1();
//        remove_for2();

        //LinkedList可以对集合进行首尾操作
//        linkedListAdd();

        mapPutElement();
    }

    /**
     * 双列集合添加元素
     */
    private static void mapPutElement() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(3,3);
        hashMap.put(4,4);
        System.out.println(hashMap);

        Set<Integer> integers = hashMap.keySet();

        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
    }


    /*
    * LinkedList可以对集合进行首尾操作
    * */
    private static void linkedListAdd() {
        LinkedList<Integer> integers = new LinkedList<>();
        //从第一位添加元素
        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        System.out.println(integers);

        //从末尾添加元素
        integers.addLast(5);
        integers.addLast(6);
        integers.addLast(7);
        System.out.println(integers);

        //从第一位删除元素
        integers.removeFirst();
        integers.removeFirst();
        System.out.println(integers);

        //从末尾删除元素
        integers.removeLast();
        System.out.println(integers);
    }


    private static void remove_for2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);            //4
        list.add(6);

        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 3){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    private static void remove_for1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(6);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }


    private static void remove_iterable() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 3){
                iterator.remove();
            }
        }
        System.out.println(list);
    }


    /*
    * 迭代器模式遍历集合
    * */
    private static void IterableSelect() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println("next : " + next);
        }
    }

}
