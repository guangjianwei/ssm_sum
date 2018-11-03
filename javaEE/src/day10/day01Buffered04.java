package day10;

import java.io.*;
import java.sql.SQLOutput;

public class day01Buffered04 {
    public static void main(String[] args) throws IOException{
        BufferedInputStream Bis = new BufferedInputStream(new FileInputStream("src\\one.txt"));
        BufferedOutputStream Bos = new BufferedOutputStream(new FileOutputStream("src\\day10\\five.txt"));
        int len =0;
        long Star = System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        while((len = Bis.read(bytes))!=-1){
            for (byte aByte : bytes) {
                Bos.write(aByte);
            }
        }
        long End = System.currentTimeMillis();
        System.out.println(End - Star);


    }
}
