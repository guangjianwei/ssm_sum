package 形参和返回值的练习.demo04;
/*
1，定义学生类，包含：
成员属性：姓名，年龄，成绩。

2，定义Test类。在对象，姓名，年龄，成绩随便写。main方法中创建三个学生

3，在Test类中再定义一个getavgScore的方法，返回三个学生的平均分。

4，在Test类中再定义一个getavgStudent的方法，打印比平均分低的学生信息。

5，在Test类中再定义一个getMinScoreStudent的方法，要求传入三个学生对象。
   将分数最低的学生对象返回。
 */
public class Student {
   private String name;
   private int age;
   private int score;

    public Student() {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {

        this.name = name;
        this.age = age;
        this.score = score;
    }
}
