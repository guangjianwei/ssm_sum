package day08;

import java.io.File;
import java.io.FileFilter;

//文件过滤器的使用lsitFiles(FileFilter filter)
public class fileter {
    public static void main(String[] args) {
        //回顾一下，之前的筛选文件之中.java文件的方法
        File file = new File("src\\day06");
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            if(file1.isFile()){
//                System.out.println(file1.getAbsolutePath());
//            }
//        }
        //下面利用过滤器的方法(下面是单级过滤)
        searchJava(file);

    }

    private static void searchJava(File file) {
        /*File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".java")){
                    return true;
                }
                if(pathname.isDirectory()){
                    return true;
                }
                return false;
            }
        });*/
        //对上述的代码进行优化，上述接FileFilter()是一个抽象接口，有且只有一个方法，函数式接口，lambda进行简化代码
        /*File[] files = file.listFiles((File pathname)->{
            return pathname.getName().endsWith(".java") || pathname.isDirectory();
        });*/
        //再次简化
        File[] files = file.listFiles(pathname->
           pathname.getName().endsWith(".java") || pathname.isDirectory());
        for (File file1 : files) {
            if(file1.isFile()){

                System.out.println(file1.getAbsolutePath());
            }
            if(file1.isDirectory()){
                //如果是文件，则继续查找
                searchJava(file1);
            }
        }
    }


}
