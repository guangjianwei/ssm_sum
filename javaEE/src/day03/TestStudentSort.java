package day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestStudentSort {
    public static void main(String[] args) {
        ArrayList<StudentSort> list = new ArrayList<>();

        list.add(new StudentSort("小红",23));
        list.add(new StudentSort("小蓝",14));
        list.add(new StudentSort("小绿",44));
        list.add(new StudentSort("小紫",19));
        System.out.println(list);
        Collections.sort(list, new Comparator<StudentSort>() {
            @Override
            public int compare(StudentSort o1, StudentSort o2) {
                return o2.getAge()-o1.getAge();
            }
        });//按照年龄进行降序
        System.out.println(list);//打印

    }
}
