package demo01.num3;
/*
3.定义测试类Test02，定义main方法，main方法内完成：
创建一个玩家对象p，等级为99
创建一个Check对象c，传递对象p执行c的test方法
 */
public class Test02 {
    public static void main(String[] args) {
        Player p = new Player(99);
        Check c =new Check();
        c.test(p);
    }
}
