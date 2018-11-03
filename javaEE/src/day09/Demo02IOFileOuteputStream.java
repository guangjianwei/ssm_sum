package day09;

import java.io.FileOutputStream;

public class Demo02IOFileOuteputStream {
    public static void main(String[] args) throws Exception{
        //day09文件后面添加内容
        FileOutputStream fos = new FileOutputStream("src\\day09\\day09.txt",true);
        byte[] bytes = "cde".getBytes();
        fos.write(bytes);
        fos.write(bytes);
    }
}
