package test_Practice.day09Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。
 */
public class test5 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\b.txt");
        file.createNewFile();
//        FileOutputStream
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("I love java".getBytes());
        FileInputStream fis = new FileInputStream(file);
        int len = 0;
        byte[] bytes = new byte[8];
        while ((len = fis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));

        }
        fos.close();
        fis.close();
    }
}
