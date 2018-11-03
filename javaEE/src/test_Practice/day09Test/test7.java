package test_Practice.day09Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
 */
public class test7 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("D:\\Info.txt");
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            fos.write(str.getBytes());
            fos.write("\r\n".getBytes());
            if (str.endsWith("886")) {
                break;
            }
            }
            fos.close();
        }


    }
