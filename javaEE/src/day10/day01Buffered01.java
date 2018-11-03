package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class day01Buffered01 {
    //利用字节流的以单个字节的输出方式进行文件复制   时间：28377 毫秒   100
    //利用字节流的以字节数组的输出方式进行文件复制   时间：21826 毫秒   52
    //利用缓冲流的以字节的输出方式进行文件复制      时间： 200   毫秒   16
    //利用缓冲流的以字节数组的输出方式进行文件复制   时间：125    毫秒   1毫秒以内
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\one.txt");
        FileOutputStream fos = new FileOutputStream("src\\day10\\two.txt");
        long timeStar = System.currentTimeMillis();
        while (fis.read() != -1) {
            fos.write(fis.read());
        }
        fis.close();
        fos.close();
        long timeEnd = System.currentTimeMillis();
        System.out.println("字节流单节输出时间：" + (timeEnd - timeStar));
    }
}
