package day11;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//客户端做的事情
public class Demo01Clienttcp {
    public static void main(String[] args) throws Exception{
        //创建一个客户端对象  里面要完成三次握手操作
        Socket sk = new Socket("192.168.22.83",6666);
        //创建字节输出流对象
        OutputStream os = sk.getOutputStream();
        os.write("Hello,服务器！".getBytes());
        byte[] bytes = new byte[1024];
        InputStream is = sk.getInputStream();
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        is.close();
        os.close();
        sk.close();
    }
}
