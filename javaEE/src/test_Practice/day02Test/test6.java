package test_Practice.day02Test;

import java.util.ArrayList;

/*
六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
 */
public class test6 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        System.out.println(listTest(list));
    }

    public static boolean listTest(ArrayList<String> al) {
        //判断al集合是否为空,为空返回true，不为空返回false
        if(al.isEmpty()){
            return true;
        }
        return false;
    }
}
