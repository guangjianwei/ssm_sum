package demo01.num05;
/*
定义测试类，在main方法实现以下功能：
创建并初始化一个Person对象per，调用方法 startStudy (Study study)
参数：study为Study的实现类，需要实现studyPlan(Plan p)抽象方法，
实现要求：调用参数p的printPlan ()方法
 */
public class test {
    public static void main(String[] args) {
        Plan p = new Plan();
        Study study = new Study() {
            @Override
            public void studyPlan(Plan p) {

            }
        };
        Person per =new Person("丑逼宝",30);
        per.startStudy(study,p);
    }

}
