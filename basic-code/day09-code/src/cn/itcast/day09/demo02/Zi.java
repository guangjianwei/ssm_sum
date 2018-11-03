package cn.itcast.day09.demo02;

public class Zi extends Fu{
    String name = "子类";
    public void getNameZi(){
        System.out.println(this.name);
        System.out.println(super.name);//可以访问父类的成员变量
    }
}
