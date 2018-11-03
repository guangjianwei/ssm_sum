package day10;

import day09.FileWrite;

import java.io.*;

//我们windows里面存储的文本格式是GBK格式的文件类型，为2个字节一个字
//而我们的编码器里面对的文本为对象为UTF-8格式
//将一个GBK格式的文件装换成我们的编码器UTF-8的格式的文件，并进行展示内容。
/*
1，首先创建一个转换流之字节输出流对象，对文件进行解析。InputStreamReader(，UTF-8)
  本来是gbk格式的文件，要转换成UTF-8
2,写入另一个文件，创建字节输入流对象。
 */
public class exChange {
    public static void main(String[] args) throws IOException{
        String dest = "src\\day10\\武功秘籍1.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\武功秘籍.txt"),"GBK");
       OutputStreamWriter bfw = new OutputStreamWriter(new FileOutputStream("src\\day10\\武功秘籍.txt"),"UTF-8");
        int len = 0;
        char[] chars = new char[8];
        while((len = isr.read(chars))!=-1){
            bfw.write(chars,0,len);
        }
        isr.close();
        bfw.close();

    }
}
