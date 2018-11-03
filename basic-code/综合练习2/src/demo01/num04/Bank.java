package demo01.num04;
/*
2.定义抽象类Bank,要求如下:
包含空参\满参构造\成员变量:银行名称 bankName (String类型)以及set/get方法
抽象方法,void bankCustomer(Person person)
 */
public abstract class Bank {
    private String bankName;
   public abstract void bankCustomer(Person person);
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Bank(String bankName) {

        this.bankName = bankName;
    }

    public Bank() {

    }
}
