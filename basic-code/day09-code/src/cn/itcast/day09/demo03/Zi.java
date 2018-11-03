package cn.itcast.day09.demo03;

public class Zi extends Fu {
    String name = "本类变量";
    public void getName(){
        String name = "局部变量";
        System.out.println("==========");
        System.out.println(this.name);
        System.out.println(name);
        System.out.println(super.name);
    }
}
