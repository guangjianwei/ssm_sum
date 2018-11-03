package day11.对话;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class sever {
    public static void main(String[] args) throws IOException {
        String prinfix ="sever说：";
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("服务器已经成功开启，等待连接...");
        while(true){
            Socket socket = ss.accept();
            new Thread(()->{
                try{
                    Scanner sc = new Scanner(System.in);
                    InputStream in = socket.getInputStream();
                    int len;
                    byte[] bytes = new byte[1024];
                    while((len = in.read(bytes))!=-1){
                        System.out.println(new String(bytes,0,len));
                    }
                    OutputStream out = socket.getOutputStream();
                    out.write((prinfix+sc.nextLine()).getBytes());
                    in.close();
                    out.close();
                }catch (IOException e){
                    e.printStackTrace();

                }
            }).start();

        }


    }
}
