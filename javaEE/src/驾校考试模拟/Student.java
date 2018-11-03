package 驾校考试模拟;



public class Student extends Person{
    private int score;
    private String scoreInstrctor;
    public Student() {
    }

    public String getScoreInstrctor() {
        return scoreInstrctor;
    }

    public void setScoreInstrctor(String scoreInstrctor) {
        this.scoreInstrctor = scoreInstrctor;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void Work() {
        System.out.println(getName()+"准备参加考试");
    }

}
