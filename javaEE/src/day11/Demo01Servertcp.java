package day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo01Servertcp {
    public static void main(String[] args) throws IOException {
        //创建一个服务器对象
        System.out.println("服务器端启动，等待连接...");
        ServerSocket ss = new ServerSocket(6666);
        //调用accept方法 返回一个socket对象
        Socket socket = ss.accept();
        //创建一个字节输入流
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream out = socket.getOutputStream();
        out.write("Hello,客户端！".getBytes());
        out.close();
        in.close();
        socket.close();

    }
}
