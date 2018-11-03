package test_Practice.day10Test;

import java.io.*;

/*
描述:利用高效字节输入流和高效字节输出流完成文件的复制。
要求：
1.将C盘下的c.png文件复制到D盘下
2.一次读写一个字节数组方式复制
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\悟空.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\test_Practice\\day10Test\\xiaoyueyue.jpg"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes);
        }
        bis.close();
        bos.close();
    }
}

