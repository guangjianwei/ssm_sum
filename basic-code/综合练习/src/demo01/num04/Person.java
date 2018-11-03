package demo01.num04;
/*
3.定义Person类,包含空参\满参构造\成员变量:姓名name (String类型)以及set/get方法
 */
public class Person {
   private String name ;

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
