package test_Practice.day10Test;

import java.io.*;

/*
描述:定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。
在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。
然后将该对象保存到当前项目根目录下的stu.txt文件中。
 */
public class test7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("傻逼宝",22);
        FileOutputStream fos = new FileOutputStream("src\\test_Practice\\day10Test\\Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(stu);
        fos.close();
        oos.close();
        FileInputStream fis = new FileInputStream("src\\test_Practice\\day10Test\\Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        Student stu1 = (Student)o;
        System.out.println(stu1);
    }
}
