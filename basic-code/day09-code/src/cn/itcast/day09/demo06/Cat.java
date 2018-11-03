package cn.itcast.day09.demo06;

public class Cat extends Animals{
    @Override
    public void eat(){
        System.out.println("已经覆盖父类抽象");
    }
}
