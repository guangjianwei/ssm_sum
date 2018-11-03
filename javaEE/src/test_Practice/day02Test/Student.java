package test_Practice.day02Test;

public class Student {
   private String name;
   private int age;
   private  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student(String name, int age,String sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {

    }
}
