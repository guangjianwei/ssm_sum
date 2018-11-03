package day09;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public FileWrite(FileOutputStream fileOutputStream) {

    }

    public static void main(String[] args) throws IOException{
       FileWriter fw = new FileWriter("src\\day09\\梅.txt");
       fw.write(' ');
       fw.write(' ');
       fw.write(' ');
       fw.write('梅');
       fw.write("\r\n");
       char[] chars = new char[]{'墙','角','树','支','梅'};
       fw.write(chars);
       fw.close();
    }
}
