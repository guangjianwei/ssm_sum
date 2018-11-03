package demo01.demo09;

import java.io.CharArrayReader;

/*
 定义类ICBC，要求如下：
继承抽象类 Card，实现接口 Credit
 	构造方法包括：空参、满参构造方法(String)
      重写抽象方法：
            void prepaid()，要求：输出”信用卡可以先消费”
            void cardholder(Person p)，要求：输出打印"XXX使用的是YYY信用卡"
PS：XXX是Person类中的 name属性值,YYY是Card类中的 name属性值
 */
public class ICBC extends Card implements Credit{
    public ICBC(String name) {
        super(name);
    }

    public ICBC() {
    }

    @Override
    void cardholder(Person p) {
        System.out.println("输出打印"+p.getName()+"使用的是"+getName()+"信用卡");
    }

    @Override
    public void prepaid() {
        System.out.println("信用卡可以先消费");
    }
}
