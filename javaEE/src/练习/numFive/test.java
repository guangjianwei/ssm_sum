package 练习.numFive;

/*
.分析以下需求，并用代码实现
	实现一个验证程序运行次数的小程序，要求如下：
	1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
	2.程序运行演示如下:
		第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
		第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
		第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
		第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
 */

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException{
       //首先读取数据
        BufferedReader br = new BufferedReader(new FileReader("src\\练习\\numFive\\a.txt"));
        //这是读取一行
        String s = br.readLine();
        br.close();
        int num = Integer.parseInt(s);
        num--;
        if(num<0){
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
            return;
        }
        System.out.println("欢迎使用本软件,第"+(3-num)+"次使用免费~");
        BufferedWriter bw =new BufferedWriter(new FileWriter("src\\练习\\numFive\\a.txt"));
        bw.write(num+"");
       bw.close();
    }
}
