package test_Practice.day10Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
描述:
分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
 */
public class test4 {
    public static void main(String[] args) throws IOException{
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\data.txt"));
        System.out.println("请输入字符串验证码存储：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            bos.write((sc.next()+"\r\n").getBytes());
        }
        System.out.println("已经存储完成");
        System.out.println();
        System.out.print("请输入一个校验码：");
        String ss = sc.next();
        bos.close();
        BufferedReader br =new BufferedReader(new FileReader("src\\data.txt"));
        String str;
        ArrayList<String> list = new ArrayList<>();
         while((str=br.readLine()) !=null){
//            if(str.equals(scStr)) {
//                System.out.println("验证成功！");
//                break;
//            }else{
//                System.out.println("验证失败！");
//            }
            list.add(str);
            }
            if(list.contains(ss)){
                System.out.println("验证成功！");
            }else{
                System.out.println("验证失败！");
            }
        br.close();
    }
}
