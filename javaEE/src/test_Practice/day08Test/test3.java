package test_Practice.day08Test;

import java.io.File;
import java.io.IOException;

/*

 */
public class test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        File file1 = new File("D:\\bbb");
//        File file2 = new File("D:\\bbb\\ccc");
        File file3 = new File("D:\\bbb");
        System.out.println("D盘符下是否存在a.txt文件："+file.exists());
        file.createNewFile();//当且仅当该文件夹不存在的时候存储
        file1.mkdir();//当且仅当该文件夹不存在的时候存储
//        file2.mkdirs();//当且仅当该文件夹不存在的时候存储
        System.out.println("D盘符下是否存在a.txt文件："+file.exists());
        System.out.println("D盘符下是否存在bbb文件："+file1.exists());
        file.delete();
        file3.delete();

    }
}
