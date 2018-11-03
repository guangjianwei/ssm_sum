package test_Practice.day11Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
需求说明：创建新项目，按以下要求编写代码：
在项目下创建TCP 服务器端 端口号为8888
1:等待客户端连接   如果有客户端连接  获取到客户端对象
2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据

 */
public class test6 {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ss = new ServerSocket(8000);
        //调用accept方法等待客户端连接
        Socket socket = ss.accept();
        //获取输入流
        InputStream in = socket.getInputStream();
        //读取流数据
        int len ;
        byte[] buffer = new byte[1024];
        while((len = in.read(buffer))!=-1){
            System.out.println(new String (buffer,0,len));
            }
        //释放资源
        in.close();
    }
}
