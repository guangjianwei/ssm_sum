package day08;

import java.io.File;

public class fileTest {
    public static void main(String[] args) {
        File file = new File("src\\day07");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());

        getFiles(file);

    }

    private static void getFiles(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile())
            { System.out.println("文件为："+file1.getAbsolutePath());}
            if(file1.isDirectory())
            {   System.out.println("目录为："+file1.getAbsolutePath());
            getFiles(file1);}

        }
    }

}
