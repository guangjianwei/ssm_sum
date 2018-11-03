package day11.对话;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class person1 {
    public static void main(String[] args) throws IOException{
          new Thread(()->{
              while (true){
                  try {
                      String prinfix ="person1说：";
                      Scanner sc = new Scanner(System.in);
                      int len;
                      byte[] bytes = new byte[1024];

                      Socket socket = new Socket("192.168.22.89",5000);
                      OutputStream out = socket.getOutputStream();
                      InputStream in = socket.getInputStream();
                      out.write((prinfix+sc.nextLine()).getBytes());
                      socket.shutdownOutput();
                      while((len = in.read(bytes))!=-1){
                          System.out.println(new String(bytes,0,len));
                      }
                      socket.close();
                      out.close();
                      in.close();
                  }catch (IOException e){
                      e.printStackTrace();
                  }

              }
          }).start();




    }
}
