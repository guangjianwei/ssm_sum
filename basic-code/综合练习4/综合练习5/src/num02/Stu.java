package num02;
/*
定义"学员"类Stu,类中包含以下成员:
成员属性: name(姓名)：String类型, age(年龄):int类型,属性使用private修饰,
为所有属性提供set/get方法
 */
public class Stu {
   private String name;
   private int age;

    public Stu() {
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

    public Stu(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
