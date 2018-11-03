package test_Practice.day09Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
 */
public class test2 {
    public static void main(String[] args) throws IOException {

    FileOutputStream fos = new FileOutputStream("D:\\a.txt");
    String a = "i love java!";
    byte[] bytes =a.getBytes();

    fos.write(bytes);
   fos.close();

    }

}
