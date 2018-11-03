package demo01.demo09;
/*
根据要求完成以下功能：


③
④ 定义类ICBC，要求如下：
继承抽象类 Card，实现接口 Credit
 	构造方法包括：空参、满参构造方法(String)
      重写抽象方法：
            void prepaid()，要求：输出”信用卡可以先消费”
            void cardholder(Person p)，要求：输出打印"XXX使用的是YYY信用卡"
PS：XXX是Person类中的 name属性值,YYY是Card类中的 name属性值
⑤ 定义测试类Test，在main方法实现以下功能：
创建并初始化一个ICBC对象bank和一个Person对象 p， 调用bank的 prepaid()、save()和 cardholder(Person p)方法
示例如下：
信用卡可以先消费
可以存钱
张三使用的是工商银行信用卡
 */
public class Test {
    public static void main(String[] args) {
        ICBC bank = new ICBC("大见银行");
        Person p = new Person("傻逼宝");
        bank.prepaid();
        bank.save();
        bank.cardholder(p);

    }
}
