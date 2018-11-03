package test_Practice.day10Test;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
练习一:高效字节输出流写出字节数据
描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
 */
public class test1 {
    public static void main(String[] args) throws IOException{
        BufferedOutputStream bos  =new BufferedOutputStream(new FileOutputStream("src\\test_Practice\\day10Test\\d.txt"));
        bos.write("I love java！".getBytes());
        bos.close();
    }
}
