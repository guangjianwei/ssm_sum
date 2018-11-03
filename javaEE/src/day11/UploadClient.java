package day11;

import javax.print.DocFlavor;
import java.io.*;
import java.net.Socket;

//把硬盘上的文件上传到服务器上的硬盘上面
/*
解析：
 1.创建一个客户端网络编程对象
 2.创建和一个字符输入流对象
 3.创建一个客户端输出流对象，用来传递文件
 4.释放资源

 */
public class UploadClient{
    public static void main(String[] args) throws IOException{
        //创建一个客户端网络编程对象
        Socket sc =new Socket("192.168.22.83",8888);//提前默认一个端口号,注意端口号不用双引号
        //创建一个字符输入流对象
        FileInputStream fis = new FileInputStream("src\\wukong.jpg");
        OutputStream outputStream = sc.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            outputStream.write(bytes,0,len);

        }
        //这是里要通知服务器，客户端已经不执行写的操作了，不然无法接受服务器的回写的话
        sc.shutdownOutput();
        InputStream in = sc.getInputStream();
        byte[] bytes1 =new byte[1024];
        int len1 = in.read(bytes);
        System.out.println(new String(bytes,0,len1));

        outputStream.close();
        fis.close();
        sc.close();
        in.close();
        System.out.println("文件传输完成！");
        }
}
