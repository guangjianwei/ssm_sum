package demo01.num10;

/*
定义类Person，包含空参、满参构造和以下成员变量
        姓名 name（String 型）
年龄 age（int型）
        生成所有成员变量set/get方法
定义成员方法：void startExercise (Fitness  fitness)，要求：输出“xxx开始锻炼”
，然后在方法内依次调用info()，fitnessPlan(Plan p)
PS：xxx为变量name值，参数p需要自行创建并初始化变量ready与 exercise
 */
public class Person {
    private String name;
    private int age;
    public void startExercise (Fitness  fitness,Plan plan){
        System.out.println(name+"开始锻炼");
        fitness.info();

        fitness.fitnessPlan(plan);
    }
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

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person() {

    }
}
