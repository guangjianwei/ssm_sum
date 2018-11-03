package day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest1 {
    public static void main(String[] args) throws IOException {
        System.out.println("连接高健------------");

        System.out.println("连接成功请说话");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Socket socket = new Socket("192.168.22.42", 6666);
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            String lock = "";
            while (!(lock.equals("break"))) {


                String s = scanner.nextLine();
                lock = s;
                os.write(("金富超说:" + lock).getBytes());


            }
            socket.shutdownOutput();


// 读取数据数据

            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {
                String msg = new String(b, 0, len);
                System.out.println(msg);
            }

            is.close();
            os.close();
            socket.close();
        }


// 读取数据数据

//关闭资源 .


    }
}