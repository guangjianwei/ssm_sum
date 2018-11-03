package cn.itcast.day09.demo09;
/*
.根据人类，创建一个工人类Worker
		增加属性：
			单位unit、工龄workAge；
		重写工作方法（工人的工作是盖房子）
 */
public class Worker extends Person{
   private String unit;//单位
   private int workAge;
    @Override
    public void work(){
        System.out.println("工人的工作是盖房子");
    }

    public Worker(String unit, int workAge) {
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker(String name, char gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker() {

    }

    public Worker(String name, char gender, int age, String nationality) {
        super(name, gender, age, nationality);
    }
}
