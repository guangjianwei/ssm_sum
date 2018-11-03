package demo01.num04;
/*
.定义测试类，在main方法实现以下功能：
创建并初始化一个BOC对象bank和一个Person对象 p， 调用bank的 sendLoans()、check()和bankCustomer(Person person)方法
打印示例:
中国银行可以发放贷款
查询征信
张三使用的是中国银行的贷款
 */
public class test {


    public static void main(String[] args) {
        BOC boc = new BOC();
        Person per = new Person("帅见见");
        boc.setBankName("大见银行");
        boc.sendLoans();
        boc.bankCustomer(per);
    }
}
