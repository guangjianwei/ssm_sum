package test_Practice.day05Test;

public class test11 {
    public static void main(String[] args) {
//  i.使用满参构造方法创建Person对象,分数传入一个负数,运行程序
//  Person p = new Person("林思意", -100);
//  ii.由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
//  iii.使用空参构造创建Person对象
        Person p = new Person();
//  iv.调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
        p.setLifeValue(1000);
//  v.调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
        p.setLifeValue(-100);
    }
}
