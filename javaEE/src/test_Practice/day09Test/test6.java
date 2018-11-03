package test_Practice.day09Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
描述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
要求：
一次读写一个字节的方式
 */
public class test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\悟空.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\小月月.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes);
        }
        fis.close();
        fos.close();
    }
}
