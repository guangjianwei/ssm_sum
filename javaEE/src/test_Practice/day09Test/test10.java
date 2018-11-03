package test_Practice.day09Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
描述:
从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
当用户输入end时停止输入。
 */
public class test10 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("src\\test_Practice\\day09Test\\stu.txt");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("请输入(格式：学号-姓名)：");
            String str = sc.nextLine();
            if("end".equals(str)){
                break;
            }
            fw.write(str+"\r\n");
            }
            fw.close();
    }

}
