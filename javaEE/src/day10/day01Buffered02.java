package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class day01Buffered02 {
    //利用字节流的以字节数组的输出方式进行文件复制   时间：
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("src\\day10\\three.txt");
        FileInputStream fis  =new FileInputStream("src\\one.txt");
       long Star =  System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            for (byte aByte : bytes) {
                fos.write(aByte);
            }
        }
        fis.close();
        fos.close();
        long End =  System.currentTimeMillis();
        System.out.println("时间差是："+(End-Star));
    }
}
