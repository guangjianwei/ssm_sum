package test_Practice.day10Test;

import java.io.*;

/*
描述:利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
要求：不能出现乱码的情况。
 */
public class test6 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\a.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter( new FileOutputStream("src\\b.txt"),"UTF-8");
        int len = 0;
        char[] chars = new char[1024];
        while((len=isr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();


    }
}
