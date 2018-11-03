package day03;

import java.util.ArrayList;
import java.util.Collections;

//利用Collections中的comparable进行排序
public class TestTeacherSort {
    public static void main(String[] args) {
        ArrayList<TeacherSort> list = new ArrayList<>();

             list.add(new TeacherSort("小红",23));
             list.add(new TeacherSort("小蓝",14));
             list.add(new TeacherSort("小绿",44));
             list.add(new TeacherSort("小紫",19));
        System.out.println(list);
        Collections.sort(list);//按照年龄进行降序
        System.out.println(list);//打印

    }
}
