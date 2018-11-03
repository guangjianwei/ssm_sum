package day10;

import java.io.*;

public class DemoBufferedWriter {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter Bos = new BufferedWriter(new FileWriter("src\\day10\\one.txt"))){
            Bos.write("鹅  鹅  鹅 ");
            Bos.newLine();//换行
            Bos.write("曲项向天歌");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
