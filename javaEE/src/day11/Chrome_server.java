package day11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//创建一个浏览器的在本地的一个服务器
/*
1.首先接收浏览器发送过来的请求信息
2.对信息进行筛选，取出寻找文件的主要信息，也就是请求信息的第一行，进行slip(" ")之后取1索引位置元素，在对元素进行submit(1)，
3.再对筛选出来的信息进行输出
 */
public class Chrome_server {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        System.out.println("服务器正在开启，请稍后...");
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket socket = ss.accept();
            //获取浏览器与服务器之间流的信息
            //接收浏览器的链接请求
            new Thread(
                    () -> {
                        try {
                            InputStream in = socket.getInputStream();
                            //把流信心转换成可以读取一行的流
                            BufferedReader br = new BufferedReader(new InputStreamReader(in));
                            String s = br.readLine();
                            System.out.println(s);
                            //对获取到的第一行的信息进行帅选
                            String[] s1 = s.split(" ");
                            String s3 = s1[1].substring(1);//
                            System.out.println(s3);
                            //创建输出流对象
                            //本地的服务器再对这个帅选出的正确路径信息进行信息读取
                            FileInputStream fis = new FileInputStream(s3);
                            OutputStream out = socket.getOutputStream();
                            byte[] bytes = new byte[1024];
                            int len = 0;
                            // 写入HTTP协议响应头,固定写法
                            out.write("HTTP/1.1 200 OK\r\n".getBytes());
                            out.write("Content-Type:text/html\r\n".getBytes());
                            // 必须要写入空行,否则浏览器不解析
                            out.write("\r\n".getBytes());
                            while ((len = fis.read(bytes)) != -1) {
                                out.write(bytes, 0, len);
                            }

                            out.close();
                            fis.close();
                            br.close();
                            in.close();
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            ).start();
        }


    }


}


