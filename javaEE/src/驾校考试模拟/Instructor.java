package 驾校考试模拟;


public class Instructor extends Person{

    private String grade;//这是教练的评分属性，有四种选择，优秀，良好，一般，不及格！

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Instructor(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public Instructor() {
    }

    public Instructor(String name, int age) {
        super(name, age);
    }

    @Override
    public void Work() {
        System.out.println("通过学员的努力程度对学员的训练成绩进行评分,并反馈给学员");
    }
}
