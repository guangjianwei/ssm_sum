package test_Practice.day10Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
练习二:高效字节输出流写出字节数组数据
描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("src\\data.txt"));
        System.out.println(br.readLine());

    }
}
