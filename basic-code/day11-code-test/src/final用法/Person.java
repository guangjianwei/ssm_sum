package final用法;

//final修饰的成员变量，必须给变量赋值。而且赋值后变量的值就不改变
//如果变量在构造函数中出现，那么都要重新赋值。
public class Person {

    private final String name;

    public Person() {
        name = "傻屌宝";
    }

    public String getName() {
        return name;
    }


    public Person(String name) {

        this.name = name;
    }


}
