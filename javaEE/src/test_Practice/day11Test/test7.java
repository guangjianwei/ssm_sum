package test_Practice.day11Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
需求说明：创建新项目，按以下要求编写代码：
在项目下创建TCP 客户端
访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888
1:客户端连接服务器,并发送 hello.服务器,我是客户端.
2:开启上一题服务器,等待客户端连接,客户端连接并发送数据
 */
public class test7 {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket socket = new Socket("192.168.22.83",8000);
        //创建输出流
        OutputStream out = socket.getOutputStream();
        //写数据
        out.write("帅见见，您好！".getBytes());
        //释放资源
        out.close();
        socket.close();


    }
}
