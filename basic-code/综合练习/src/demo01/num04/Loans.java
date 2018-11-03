package demo01.num04;
/*
1.定义接口Loans(贷款),包含如下内容:
(1)抽象方法:void sendLoans()
(2)默认方法:void check(),要求:输出”查询征信”
 */
public  interface Loans {
   public abstract void sendLoans();
    default void check(){
        System.out.println("查询征信");
    }
}
