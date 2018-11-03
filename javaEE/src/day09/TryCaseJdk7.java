package day09;


import java.io.FileWriter;
import java.io.IOException;

public class TryCaseJdk7 {
    public static void main(String[] args) {
        try {
            FileWriter ff = new FileWriter("e.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //这样就不需要关闭close（） 因为try...catch里面自带close();
        try(FileWriter fw = new FileWriter("src\\day09\\梅.txt")){
            fw.write("梅花");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
