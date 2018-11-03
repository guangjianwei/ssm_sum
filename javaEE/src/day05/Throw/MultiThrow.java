package day05.Throw;

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
         //2.一次捕获多次处理
       /* try {
            getIo();
            getCla();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
       //一次捕获一次
        try {
            getIo();
            getCla();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void getIo() throws ClassNotFoundException{
    }
    private static void getCla() throws IOException{
    }
}
