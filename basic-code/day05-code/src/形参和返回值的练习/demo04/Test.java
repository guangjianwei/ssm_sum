package 形参和返回值的练习.demo04;

public class Test {
    public static void main(String[] args) {
        Student stuOne = new Student("傻逼宝",23,60);
        Student stuTwo = new Student("傻吊求",24,70);
        Student stuThree = new Student("帅见见",24,100);
        int avg = getavgScore(stuOne.getScore(),stuTwo.getScore(),stuThree.getScore());
        System.out.println("平均分："+avg);
        getavgStudent(stuOne,stuTwo,stuThree);
    }
    //在Test类中再定义一个getavgScore的方法，返回三个学生的平均分。
    public static int getavgScore(int a,int b,int c){
        int avg =(a+b+c)/3;
        return avg;
    }
    //在Test类中再定义一个getavgStudent的方法，打印比平均分低的学生信息
    public static void getavgStudent(Student a,Student b,Student c){
        int min= a.getScore()<b.getScore()?a.getScore():b.getScore();
        min= min<c.getScore()?min:c.getScore();
        System.out.println("====最低分学生的信息如下=====");
        if(a.getScore()==min){
            System.out.println("姓名："+a.getName());
            System.out.println("年龄："+a.getAge());
            System.out.println("成绩："+a.getScore());
        }else if(b.getScore()==min){
            System.out.println("姓名："+b.getName());
            System.out.println("年龄："+b.getAge());
            System.out.println("成绩："+b.getScore());
        }else{
            System.out.println("姓名："+c.getName());
            System.out.println("年龄："+c.getAge());
            System.out.println("成绩："+c.getScore());
        }


    }
    //在Test类中再定义一个getMinScoreStudent的方法，要求传入三个学生对象。
    //   将分数最低的学生对象返回。
    public static Student getMinScoreStudent(Student a,Student b,Student c){

        int min= a.getScore()<b.getScore()?a.getScore():b.getScore();
        min= min<c.getScore()?min:c.getScore();
        if(a.getScore()==min){
            return a;
        }else if(b.getScore()==min){
           return b;
        }else{
           return c;
        }

    }
}
