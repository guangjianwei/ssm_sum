package day11.对话;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class person2 {
    public static void main(String[] args) throws IOException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Scanner sc = new Scanner(System.in);
     while(true){
         service.submit(() -> {
             try {
                 String scString = sc.nextLine();
                 runMessage(scString);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         });
         service.submit(() -> {
             try {
                 String scString = sc.nextLine();
                 runMessage(scString);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         });
     }



    }

    public static void runMessage(String scString) throws IOException {
        String prinfix = "person2说：";
        int len;
        byte[] bytes = new byte[1024];
        Socket socket = new Socket("192.168.22.89", 5000);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        socket.shutdownOutput();
        out.write((prinfix + scString).getBytes());
        while ((len = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));

        }
        socket.close();
        out.close();
        in.close();


    }
}
