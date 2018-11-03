package test_Practice.day09Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream("D:\\a.txt",true);
        fos.write("ccccc".getBytes());
        fos.close();
    }
}
