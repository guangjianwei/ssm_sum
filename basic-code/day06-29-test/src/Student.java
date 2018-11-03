/*
1. 定义学生类Student，包含以下成员;
 成员属性:name(姓名):String类型，Chinese(语文):int类型，math(数学):int类型，属性使用private修饰。
 成员方法:
        (1).get/set方法，构造方法
        (2).void show()方法，打印对象所有属性的值以及对象的语文和数学成绩的总和到控制台
2. 定义类:Test类中定义main方法，按以下要求编写代码
      (1)定义如下方法；
         @定义public static void ArrayList<Student> getSum(ArrayList<Student> list){...}方法；
         @@要求:遍历list集合，将list中语文成绩和数学成绩总和大于160分的元素存入到另一个ArrayList<Student>中并返回。
        (2)分别实例化三个Student对象，三个对象分别为：”李强”88,99,; “张强”,85,78,; “谢强”,86,50;
        (3)创建一个ArrayList集合，这个集合里面存储的是Student类型，分别将上面的三个Student对象添加到集合中，调用getSum方法，根据返回的list集合遍历对象并调用show()方法输出所有元素信息。

 */
public class Student {
    private String name;
    private int Chinese;
    private int math;
    public void show(){
        System.out.println("姓名："+name);
        System.out.println("语文成绩："+Chinese);
        System.out.println("数学成绩："+math);
        System.out.println("成绩总和:"+(Chinese+math));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public Student(String name, int chinese, int math) {

        this.name = name;
        Chinese = chinese;
        this.math = math;
    }

    public Student() {

    }
}
