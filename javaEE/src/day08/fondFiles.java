package day08;

import java.io.File;

//寻找指定目录下的所有.java文件
public class fondFiles {
    public static void main(String[] args) {
        File files =new File("src\\day02");
        System.out.println(files.getAbsolutePath());
        fondFilesJava(files);
    }

    private static void fondFilesJava(File files) {
        File[] files1 = files.listFiles();
        for (File file : files1) {
            if(file.isFile()){
                if(file.getName().endsWith(".java")){
                    System.out.println(file.getAbsolutePath());
                    }
            }
            if(file.isDirectory()){
                fondFilesJava(file);
            }

        }
    }


}
