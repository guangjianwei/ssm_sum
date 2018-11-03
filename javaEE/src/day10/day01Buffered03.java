package day10;

import java.io.*;

public class day01Buffered03 {
    public static void main(String[] args) throws IOException{
        BufferedInputStream Bis= new BufferedInputStream(new FileInputStream("src\\one.txt"));
        BufferedOutputStream Bos = new BufferedOutputStream(new FileOutputStream("src\\day10\\four.txt"));
        long star = System.currentTimeMillis();
        int len = 0 ;
        while((len = Bis.read())!=-1){
            Bos.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-star);

    }
}
