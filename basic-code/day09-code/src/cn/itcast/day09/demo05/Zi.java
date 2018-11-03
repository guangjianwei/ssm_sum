package cn.itcast.day09.demo05;

public class Zi extends Fu{
    public  Zi(){
        //自动的配一个super（）；进行父类构造调用（这里是默认的）
        //此时要注意两点：1.super（）要在构造里面的第一行，而且只能用一次
//        System.out.println("子类无参构造");
        //也可以使用如下的方式进行父类有参构造函数的调用
        super(5);
    }
}
