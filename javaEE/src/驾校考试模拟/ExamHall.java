package 驾校考试模拟;

import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 .考场接收所有学员的考试信息.  ----封装成方法,main方法可以调用
                获得人员名单,赛选考试人员名单,教练员剔除,学员留下,
                通过获取学员的所有信息,通过fileoutputstream对每一个学员生成一张学员考试信息表
  */
//考场类
public class ExamHall {
 private  String name;
      public void getNames(List<Student> students){
          System.out.println("参加考试的人员有：");
          for (Student student : students) {
              System.out.print(student.getName());
          }

    }
     public void loadStuMessage(List<Student> students){
          //每个学员都生成一张信息表
         for (Student student : students) {
             String pathName = "src\\驾校考试模拟\\"+student.getName()+".txt";
             File file = new File(pathName);
             try {
                 file.createNewFile();
                 FileWriter fos = new FileWriter(pathName);
                 fos.write("姓名"+student.getName()+"\r\n");
                 fos.write("年龄"+student.getAge()+"\r\n");
                 fos.write("成绩"+student.getScore()+"\r\n");
                 fos.write("评分"+student.getScoreInstrctor()+"\r\n");
                 int score =student.getScore();
                 if(score>=50&&score<60){
                     fos.write("考试结果：失败"+"\r\n");
                 }else if(score>=60&&score<70){
                     fos.write("考试结果：失败"+"\r\n");
                 }else if(score>=70&&score<80){
                     fos.write("考试结果：失败"+"\r\n");
                 }else{
                     fos.write("考试结果：通过"+"\r\n");
                 }
                 fos.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }
     }
     public void  examStart(List<Student> students){
         getNames(students);
         System.out.println("考试开始...");
         //创建一个线程池,2个任务
         ExecutorService service = Executors.newFixedThreadPool(2);
         examTastRunnable task = new examTastRunnable();
         //开启两个并发的任务线程
         Random ran = new Random();
         for (Student student : students) {
             int score = ran.nextInt(50)+50;
         service.submit(task);
         service.submit(task);
             student.setScore(score);//随机生成分数
             if(score>=50&&score<60){
                 student.setScoreInstrctor("不及格");
             }else if(score>=60&&score<70){
                 student.setScoreInstrctor("一般");
             }else if(score>=70&&score<80){
                 student.setScoreInstrctor("良好");
             }else{
                 student.setScoreInstrctor("优秀");
             }
         }
         System.out.println("所有学员已经考试完毕！");
         loadStuMessage(students);
         System.out.println("所有学员信息已经加载到对应的表格中！");

     }
     //考试结束打印所有参加考试的人员信息
     public void examEnd(List<Student> students){
         System.out.println("考试结束");
         loadStuMessage( students);
         printMessage(students);
         }
      public void printMessage(List<Student> students){
          for (Student student : students) {
              System.out.println("这是"+student.getName()+"的成绩单");
              String pathName = "src\\驾校考试模拟\\"+student.getName()+".txt";
              try {
                  FileReader fr = new FileReader(pathName);
                  char[] chars = new char[1024];
                  int len =0;
                  while((len = fr.read(chars))!=-1){
                      System.out.println(new String(chars,0,len));
                  }
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }

         }
}
