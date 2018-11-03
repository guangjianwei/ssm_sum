package test_Practice.day11Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class test8_server {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        System.out.println("服务器开启，等待连接...");
        ServerSocket ss =new ServerSocket(8080);
        //调用accept方法等待客户端的请求连接
        Socket socket = ss.accept();
        //获取流数据
        InputStream in = socket.getInputStream();
        //读取流数据
        int len;
         byte[] bytes = new byte[1024];
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\test_Practice\\day11Test\\xiaoyueyue.jpg"));
         while((len = in.read(bytes))!=-1){
             bos.write(bytes);
             }
         //释放资源
        OutputStream out = socket.getOutputStream();
         out.write("服务端说：已经成功加载到本地".getBytes());
        System.out.println("已经成功加载到本地");

        bos.close();
        in.close();
        out.close();


    }
}
