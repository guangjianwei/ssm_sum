package day10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\day10\\student.txt"));
        Student stu1 = new Student("jeck",33,"踢球");
        Student stu2 = new Student("rose",12,"打篮球");
        Student stu3 = new Student("gery",30,"洗澡");

//        oos.writeObject(stu1);
//        oos.writeObject(stu2);
//        oos.writeObject(stu3);
        ArrayList<Student> arrayList = new ArrayList<>(List.of(stu1,stu2,stu3));
        oos.writeObject(arrayList);
//        System.out.println(arrayList);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\day10\\student.txt"));
        Object o = ois.readObject();
        ArrayList<Student> student = (ArrayList<Student>) o;
        System.out.println(student);
        oos.close();
    }
}
