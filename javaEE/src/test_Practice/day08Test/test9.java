package test_Practice.day08Test;

import java.io.File;

/*
描述:
获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
 */
public class test9 {
    public static void main(String[] args) {
        File file = new File("src\\com");
        getFile(file);
    }

    private static void getFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                getFile(file1);
            }
            if(file1.isFile()){
                if(file1.getName().endsWith(".java")){

                    System.out.println("文件："+file1);
                }
            }
        }



    }
}
