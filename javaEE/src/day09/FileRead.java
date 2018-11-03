package day09;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("src\\day09\\day09.txt");
        char[] chars = new char[2];
        int len = 0;
        while ((len = fr.read(chars))!=-1){
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            }
            fr.close();
    }
}
