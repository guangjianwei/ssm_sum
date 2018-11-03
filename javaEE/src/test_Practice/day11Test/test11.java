package test_Practice.day11Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
生成一个浏览器的服务器，用来接收浏览器发送来的信息，进而进行反馈
 */
public class test11 {
    public static void main(String[] args) throws IOException {
        //创建一个服务对象
        ServerSocket ss = new ServerSocket(8088);
        System.out.println("服务器已开启，等待连接...");
        while (true) {
            //调用accept方法等待连接
            Socket socket = ss.accept();
            new Thread(
                    () -> {
                        try {
                     //接收流信息
                            InputStream in = socket.getInputStream();
                            //把获取到的流信息转换成可以读取一行的流
                            BufferedReader br = new BufferedReader(new InputStreamReader(in));
                            //读取到了第一行的信息
                            String line1 = br.readLine();
                            //筛选第一行的信息
                            String[] s1 = line1.split(" ");
                            String line = s1[1].substring(1);//
                            File file = new File(line);
                            //创建高效字节输入流
                            System.out.println(line);
                            System.out.println(file.getAbsolutePath());
                           BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                            OutputStream out = socket.getOutputStream();
                            int len;
                            byte[] bytes = new byte[1024];
                            // 写入HTTP协议响应头,固定写法
                            out.write("HTTP/1.1 200 OK\r\n".getBytes());
                            out.write("Content-Type:text/html\r\n".getBytes());
                            // 必须要写入空行,否则浏览器不解析
                            out.write("\r\n".getBytes());
                            //读取信息，反馈给浏览器
                            while ((len = bis.read(bytes)) != -1) {
                                out.write(bytes, 0, len);
                            }
                            System.out.println("信息已经反馈完毕！");
                            in.close();
                            br.close();
                            bis.close();
                            out.close();
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();

                        }
                    }
            ).start();
        }


    }
}
