package day11;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


//服务端开启，用来接收客户端的连接
public class UploadServer {
    public static void main(String[] args) throws IOException{
        //1.创建一个服务器对象
        System.out.println("服务器正在启动，请稍后...");
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            //2.调用accept方法，用来接收客户端的请求
            Socket accept = ss.accept();
            new Thread(
                    () -> {
                        try {
                            //2.创建一个服务端字符输入流对象，用来接收客户端发来的文件流
                            InputStream inputStream = accept.getInputStream();
                            FileOutputStream fos = new FileOutputStream("src\\day11\\xiaoyueyue.jpg");
                            int len = 0;
                            byte[] bytes = new byte[1024];
                            while ((len = inputStream.read(bytes)) != -1) {
                                fos.write(bytes, 0, len);

                            }
                            //文件上传完成，服务器完成回写操作
                            OutputStream out = accept.getOutputStream();
                            out.write("服务器给的回复：文件已经上传完毕了。".getBytes());
                            fos.close();
                            inputStream.close();
                            accept.close();
                            out.close();
                            System.out.println("服务器文件已经上传完毕"+Thread.currentThread().getName());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
            ).start();

        }
    }
}
