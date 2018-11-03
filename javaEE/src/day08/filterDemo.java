package day08;

import java.io.File;

//筛选出E:\毕业设计文件夹中的所有文件
public class filterDemo {
    public static void main(String[] args) {
        File file = new File("E:\\毕业设计");
        getFiles(file);

    }

    private static void getFiles(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                System.out.println("文件夹有："+file1);
               getFiles(file1);
            }
            if(file1.isFile()){
                System.out.println("文件有："+file1);
            }
        }
    }
}
