package demo01.num10;
/*
④定义测试类Test，在main方法实现以下功能：
创建并初始化一个Person对象per，调用方法 startExercise (Fitness  fitness)
参数：fitness为Fitness的实现类，需要实现fitnessPlan(Plan p)抽象方法，
实现要求：调用参数p的printPlan ()方法
示例如下：
张三开始锻炼
每天动一动,享受健康生活
记得要做热身运动哦
当此运动计划,热身:拉拉筋骨,锻炼:平板撑
 */
public class Test {
    public static void main(String[] args) {
        Person per = new Person("傻逼宝",30);
        Plan p =new Plan("搔首弄姿","抓耳挠腮");
        Fitness fitness = new Fitness() {
            @Override
            public void fitnessPlan(Plan p) {
                p.printPlan();
            }
        };
        per.startExercise(fitness,p);

    }
}
