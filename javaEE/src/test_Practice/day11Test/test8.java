package test_Practice.day11Test;

import javax.print.DocFlavor;
import java.io.*;
import java.net.Socket;

/*
1.需求说明：使用TCP编写一个网络程序,设置服务器程序监听端口为8002,
当于客户端建立后,向客户端发送”hello world”,客户端将信息输出

2.需求说明：我们来做一个“文件上传案例”，有以下要求：
将项目中的一个图片,通过客户端上传至服务器
 */
public class test8 {
    public static void main(String[] args) throws IOException{
        //创建客户端对象
        Socket socket = new Socket("192.168.22.83",8080);
        //创建输出流对象
        OutputStream out = socket.getOutputStream();
        //写入流数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\test_Practice\\day11Test\\悟空.jpg"));
        int len;
        byte[] bytes =new  byte[1024];
        while((len = bis.read(bytes))!=-1){
            out.write(bytes);
            }
        System.out.println("已经成功上传");
        //终止上方写的操作
        socket.shutdownOutput();
        InputStream in = socket.getInputStream();
        while((len = in.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        bis.close();
        out.close();
        socket.close();
        in.close();
    }
}
