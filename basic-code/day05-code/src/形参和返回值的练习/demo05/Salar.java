package 形参和返回值的练习.demo05;

/*
1，定义程序员类。
   属性：
     姓名
     年龄
     工作年限
     工资
2，在测试类中定义main方法。
	创建三个程序员对象。属性值随便写。

3，定义方法upperSalar。
	如果工作年限为 (0,2] 那么工资涨 500，
	如果工作年限为 (2,5] 那么工资涨 1500，
	如果工作年限为 (5,10] 那么工资涨 2500，
	如果工作年限为 (10,15] 那么工资涨 3500，
   并在方法中打印修改之后的程序员信息。
	打印格式如下：
		程序员小王，年龄30，工作年限10年，原工资为10000元，涨3500，涨后为13500.

4，定义方法getMaxSalar，找出工资最高的那个程序员并返回。
   并在main方法中打印其信息。

5.定义方法getMinAge，找出年龄最小的那个程序员并返回。
   并在main方法中打印其信息。
 */
public class Salar {
    private String name;
    private int age;
    private int workAge;
    private int moneyAvg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public int getMoneyAvg() {
        return moneyAvg;
    }

    public void setMoneyAvg(int moneyAvg) {
        this.moneyAvg = moneyAvg;
    }

    public Salar(String name, int age, int workAge, int moneyAvg) {

        this.name = name;
        this.age = age;
        this.workAge = workAge;
        this.moneyAvg = moneyAvg;
    }

    public Salar() {

    }
}
