package 驾校考试模拟;

import java.util.*;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        //先生成一个教练
        Instructor instructor = new Instructor("教练",35);
        //生成一个8个学生类的list集合。(里面的姓名和年龄都是随机的)。
        List<Integer>  list= new ArrayList<>();
        List<Student> student = getStudent(list);
        //定义一个Map双列集合，用来存储<评分(教练给与的),Student对象>
        Map<String,Student> mapScoreStudent = new HashMap<>();

        //准备考试
        System.out.println("前往考场...");
        System.out.println("到达考场...");
        System.out.println("准备考试...");
        ExamHall examHall =new ExamHall();
        examHall.examStart(student);
        examHall.examEnd(student);
    }





    private static List<Student> getStudent(List<Integer> list) {
        Random ran = new Random();
        //获取8个1-1000以内的随机号不重复的随机号
        while(true){
            int temp= ran.nextInt(1000);
            if(!list.contains(temp)){
                list.add(temp);
            }
            if(list.size()==8){
                break;
            }
        }
        //生成8个随机姓名和年龄的学生，存入学生集合当中

        List<Student>  perList= new ArrayList<>();
        for (int i = 0; i < 8; i++){
            String name = list.get(i)+"号";
            int age = ran.nextInt(17)+18;
            Student student = getObj(Student::new);
            student.setName(name);
            student.setAge(age);
            perList.add(student);
        }
        return perList;

    }

    //生产student类
    public static<T> T getObj(Supplier<T> supplier){
        return supplier.get();
    }
}
