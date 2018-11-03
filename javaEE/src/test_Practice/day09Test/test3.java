package test_Practice.day09Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
描述:在D盘下，有一c.txt 文件中内容为：HelloWorld 
在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\c.txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.close();
    }
}
