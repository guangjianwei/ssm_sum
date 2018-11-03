package demo01.demo09;
/*
定义类Person
       包含空参、满参构造和以下成员变量
姓名name（ String 型）
        生成所有成员变量set/get方法
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person() {

    }
}
