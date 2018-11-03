package demo01.num05;
/*
定义类Plan，包含空参、满参构造和以下成员变量
阅读 read（String类型）
做题 test（String类型）
        生成所有成员变量set/get方法
定义成员方法：void printPlan(),要求：输出打印"当次学习计划，阅读：xxx，练习：yyy",
PS： xxx为变量read值，yyy为变量test值
 */
public class Plan {
   private String read;
   private String test;
  public void printPlan(){
      System.out.println("当次学习计划，阅读："+read+"，练习："+test);
  }
    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Plan(String read, String test) {

        this.read = read;
        this.test = test;
    }

    public Plan() {

    }
}
