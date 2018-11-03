package 形参和返回值的练习.demo01;
/*
1.定义“玩家类”Player，包含满参构造方法和以下成员：
	成员属性：
		等级level（int类型）
2.定义“检测类”Check，包含如下成员方法：
	test方法：参数Player对象，方法内对Player的等级进行判断，如果等级大于80，在控制台打印输出“超神玩家”，否则打印输出“普通玩家”
3.定义测试类Test02，定义main方法，main方法内完成：
创建一个玩家对象p，等级为99
创建一个Check对象c，传递对象p执行c的test方法
 */
public class Test02 {
    public static void main(String[] args) {
        Player p= new Player(99);
        Check c = new Check();
        c.test(p.getLevel());

    }
}
