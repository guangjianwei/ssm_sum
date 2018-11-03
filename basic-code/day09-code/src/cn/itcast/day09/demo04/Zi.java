package cn.itcast.day09.demo04;

public class Zi extends Fu {
    String name = "儿子";
    @Override
    public void getName(){  //这是对Fu.java 中的get.Name进行重写
        super.getName();
        System.out.println(this.name);

    }
}
