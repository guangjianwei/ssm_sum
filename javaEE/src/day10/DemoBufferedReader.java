package day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  DemoBufferedReader{
    public static void main(String[] args) {
        try( BufferedReader Brder=new BufferedReader(new FileReader("src\\day10\\one.txt"))){
            String str;
            while((str= Brder.readLine())!=null){
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
