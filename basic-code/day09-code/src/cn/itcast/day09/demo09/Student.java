
package cn.itcast.day09.demo09;
/*
根据人类，创建一个学生类Student
		增加属性：
			学校school、学号stuNumber；
		重写工作方法（学生的工作是学习）。
 */
public class Student extends Person {
   private String school;
    private long stuNumber;

    public Student() {
    }

    public Student(String name, char gender, int age, String nationality) {
        super(name, gender, age, nationality);
    }

    public Student(String school, long stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(long stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public void work(){
        System.out.println("学生的工作是学习！");
    }

}
