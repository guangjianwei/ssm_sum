package day01.demo05.Throw;

import java.io.IOException;

//多个异常该怎样处理
public class MultiThrow {
    public static void main(String[] args) {
       //1.这个是多异常分别处理
 /*       try {
            getIo();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            getCla();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
         //2.一次捕获一次处理

    }

    private static void getIo() throws ClassNotFoundException{
    }
    private static void getCla() throws IOException{
    }
}
