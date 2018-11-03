package demo01.demo09;
//①定义接口Credit,包含如下内容：
//        抽象方法： void prepaid()
//        定义默认方法： void save()，要求：输出"可以存钱"
public interface Credit {
    void prepaid();
    default void save(){
        System.out.println("可以存钱");
    }
}
