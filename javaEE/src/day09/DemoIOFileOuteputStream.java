package day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoIOFileOuteputStream {
    //创建一个字符流对象，并写入文件
    public static void main(String[] args) throws IOException {
        //创建文件
        FileOutputStream fops = new FileOutputStream("src\\day09\\day09.txt");
        //创建一个IO字节流输出对象
        byte[] bytes= "这是一个字节流输出对象".getBytes();
        //将文件与字节流对象进行关联
        fops.write(bytes);
        fops.close();
        /*
          为什么close  通道关闭 释放资源
            1: close掉 这样不使用的资源 就成垃圾 就可以被回收
            2：通知系统释放相关资源
         */
    }
}
