package cn.itcast.day09.demo09;
/*
根据学生类，创建一个学生干部类 StudentLeader
		增加属性：
			职务job；
		增加方法：开会meeting。
 */
public class StudentLeader extends Student{
   private String job;
    public void meeting(){
        System.out.println("开会");
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public StudentLeader(String job) {

        this.job = job;
    }

    public StudentLeader() {

    }
}
