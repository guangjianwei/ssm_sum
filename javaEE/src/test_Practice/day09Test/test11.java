package test_Practice.day09Test;

import day09.FileWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

/*
需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，将多个Student对象存储到一个集合中。
输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。
 */
public class test11 {
    public static void main(String[] args) throws IOException{
        Properties proper = new Properties();
        proper.load(new InputStreamReader(new FileInputStream("src\\test_Practice\\day09Test\\stu.txt"),"utf-8"));
        ArrayList<Student> list = new ArrayList<>();
        Set<String> keys = proper.stringPropertyNames();
        for (String key : keys) {
            int num = Integer.parseInt(key);
           Student stu =  new Student(num,proper.getProperty(key));
           list.add(stu);
        }
        FileWriter fw = new FileWriter("src\\test_Practice\\day09Test\\student.txt");
        fw.write(list.get(0).getNumber()+","+list.get(0).getName()+"\r\n");
        fw.write(list.get(1).getNumber()+","+list.get(1).getName()+"\r\n");
        fw.write(list.get(2).getNumber()+","+list.get(2).getName()+"\r\n");
        fw.write(list.get(3).getNumber()+","+list.get(3).getName());
        System.out.println("已经成功存储");
        fw.close();
    }

}
