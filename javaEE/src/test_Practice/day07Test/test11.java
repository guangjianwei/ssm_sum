package test_Practice.day07Test;
/*
练习十一：Lambda（省略格式）练习
问题：对Java基础班学生的考试成绩进行排序
1.定义一个学生类，有两个属性。姓名，考试成绩
2.在测试类中定义一个学生数组，存储学生信息。
3.使用Lambda省序略格式写法对学生数组按照考试成绩由高到低进行排。
 */

import java.util.Arrays;
import java.util.Comparator;

public class test11 {
    public static void main(String[] args) {
        Student stu1 = new Student("jeck",70);
        Student stu2 = new Student("rose",90);
        Student stu3 = new Student("gery",69);
        Student[] stus = {stu1,stu2,stu3};
        show(stus);
        System.out.println("===============");
        Arrays.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore()-o1.getScore();
            }
        });
        show(stus);


    }
    public static void show(Student[] stus){
        for (Student student : stus) {
            System.out.println("姓名："+student.getName()+"分数"+student.getScore());
        }
    }
}
