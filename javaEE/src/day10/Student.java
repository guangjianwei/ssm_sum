package day10;

import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private int age;
    private  String like;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like='" + like + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public Student(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public Student() {
    }
}
