package demo01.num05;
/*
1.定义接口Study,要求如下:
(1)定义抽象方法void studyPlan(Plan p)
(2)定义默认方法void studyHard(),要求:方法内依次调用readBook(),doTest()
(3)定义私有方法  void readBook(),要求:输出”多读书,多看报,少吃零食多睡觉”
void doTest(),要求:输出”键盘敲烂,先赚他一个亿”
 */
public interface Study {
    void studyPlan(Plan p);
   default void studyHard(){
       readBook();
       doTest();
   }
   public static void readBook(){
       System.out.println("多读书,多看报,少吃零食多睡觉");
   }
   public static void doTest(){
       System.out.println("键盘敲烂,先赚他一个亿");
   }
}
