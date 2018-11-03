package demo01.num10;
/*
定义类Plan，包含空参、满参构造和以下成员变量
热身 ready（String 型）
锻炼 exercise（String 型）
        生成所有成员变量set/get方法
定义成员方法：void printPlan(),要求：输出打印"当次运动计划，热身：xxx，锻炼：yyy",
PS： xxx为变量ready值，yyy为变量exercise值
 */
public class Plan {
    private String ready;
    private String exercise;
    public void printPlan(){
        System.out.println("当次运动计划，热身："+ready+"，锻炼："+exercise);
    }
    public String getReady() {
        return ready;
    }

    public void setReady(String ready) {
        this.ready = ready;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public Plan(String ready, String exercise) {

        this.ready = ready;
        this.exercise = exercise;
    }

    public Plan() {

    }
}
