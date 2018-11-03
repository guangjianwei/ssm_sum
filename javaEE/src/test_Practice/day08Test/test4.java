package test_Practice.day08Test;

import java.io.File;
import java.io.IOException;

/*
练习六:获取文件信息:文件名,文件大小,文件的绝对路径,文件的父路径
描述:
获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
 */
public class test4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\aaa");
        File file1 = new File("D:\\aaa\\bbb.txt");
        File fileP = file1.getParentFile();
        file.mkdirs();
        file1.createNewFile();
        System.out.println("是否存在："+file.exists());
        System.out.println("文件名："+file.getName());
        System.out.println("文件大小："+file.length());
        System.out.println("文件的绝对路径："+file.getAbsolutePath());
        System.out.println("父路径:"+fileP.getAbsolutePath());
        File file2 = new File("D:\\aaa\\ccc.txt");
//        file2.createNewFile();
        System.out.println("文件大小："+file2.length());
    }
}
