package demo01.num04;
/*
1.定义接口Loans(贷款),包含如下内容:
(1)抽象方法:void sendLoans()
(2)默认方法:void check(),要求:输出”查询征信”
2.定义抽象类Bank,要求如下:
包含空参\满参构造\成员变量:银行名称 bankName (String类型)以及set/get方法
抽象方法,void bankCustomer(Person person)
3.定义Person类,包含空参\满参构造\成员变量:姓名name (String类型)以及set/get方法
4.定义类BOC(中国银行)，要求如下：
继承抽象类 Bank，实现接口 Loans(贷款)
 	构造方法包括：空参\满参构造方法(String)
    重写抽象方法：
        void sendLoans()，要求：输出”XXX银行可以发放贷款”
        void void bankCustomer(Person person)，要求：输出打印"YYY使用的是XXX银行的贷款"
PS：YYY是Person类中的 name属性值 ,XXX是Bank类中的 name属性值
 */
public  class BOC extends Bank implements Loans{
    @Override
    public void sendLoans() {
        System.out.println(super.getBankName()+"银行可以发放贷款");
        check();
    }

    @Override
    public void bankCustomer(Person person) {
        System.out.println("输出打印"+person.getName()+"使用的是"+super.getBankName()+"银行的贷款");
    }
}
