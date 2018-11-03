package Java基础.IO流;

import java.io.*;

/*
*       IO流框架: 图见桌面
*
*       请问 inputstream Writer
*           outputstream Reader   是IO流吗?
*
*           inputStream Reader
*           outputstream Writer
*
*           Read(int n)     读取一个字符
*           writer(int n)   写入一个字符.
*
*      IO流核心的代码
*       int len;
*       byte[] bytes = new byte[1024];
 *      while ((len = fileInputStream.read(bytes)) != -1)
* */
public class Test_IO {

    public static void main(String[] args) throws Exception {

        IOStream();

//        flushIOStream();
    }

    private static void IOStream() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("a.txt");
            //如果出现异常
            try {
                int i = 1 / 0;
            }catch (Exception e){
                e.printStackTrace();
            }
            fileOutputStream = new FileOutputStream("a.txt");
            int len;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,len);
            }
            //如果遇到运行时异常,需要catch吗?
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("IOException");
            e.printStackTrace();
        }finally {
            System.out.println("finally");
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void flushIOStream() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
        String len;
        while ((len = bufferedReader.readLine()) != null){
            bufferedWriter.write(len);
            bufferedWriter.flush();
        }

        bufferedWriter.close();
        bufferedWriter.close();
    }
}
