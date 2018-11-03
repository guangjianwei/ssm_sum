package cn.itcast.day09.demo09;

/*
1.定义Person类
		属性：
			姓名name、性别gender、年龄age、国籍nationality；
		方法：吃饭eat、睡觉sleep，工作work。
 */
public class Person {
    private String name;
    private char gender;
    private int age;
    String nationality;

    public void eat() {
        System.out.println("吃饭了");
    }

    public void sleep() {
        System.out.println("睡觉了");
    }

    public void work() {
        System.out.println("工作了");
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Person(String name, char gender, int age, String nationality) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }
}
