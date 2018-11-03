package Java基础.file和递归;

/*
* file的构造方法

  file类的一些常用方法

  FileFileter接口
    此接口用来过滤文件,只有一个抽象方法,所以可以写成lambda表达式.

  递归的好处和注意点:
    好处: 代码简洁.
    特点:
        1.直接或者间接的调用自身.
        2.要有边界条件  跳出递归的条件
        3.如果递归过深的话 会导致内存溢出
        4.构造中不能出现递归

   递归练习讲解:多层打印文件夹
*
* */

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Test_file {
    public static void main(String[] args) throws IOException {
        fileConst();

        fileMethod();

        fileFileFilter();

        File file = new File("D://");
        printDir(file);

    }

    private static void printDir(File file) {
        File[] files = file.listFiles();
        if (files == null){
            return;
        }
        for (File file1 : files) {
            if (file1.isFile()){
                System.out.println(file1.getAbsolutePath());
            }else {
                printDir(file1);
            }
        }
    }

    private static void fileFileFilter() {
        File file = new File("");


        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getPath().endsWith(".txt");
            }
        });


        file.listFiles(f -> f.isFile());
    }

    /*
    * file类的构造方法
    * */
    private static void fileConst() {
        File file = new File("a\\b.txt");
        File file1 = new File("a","c.txt");
//        里面穿的是一个路径,不能在里面直接传递一个对象吗?
    }

    /*
    * file类的一些常用方法.
    * */
    private static void fileMethod() throws IOException {
        File file = new File("c.txt");
        //将此抽象路径名转换为路径名字符串。
        file.getPath();
        //判断文件存在不存在
        file.exists();
        //返回由此File表示的文件的长度。如果此路径名表示目录，则返回值未指定。
        file.length();
        //判断次文件对象是否是文件夹
        file.isDirectory();
        //创建一个文件
        file.createNewFile();
        //对文件进行改名(重命名由此抽象路径名表示的文件。 命名文件的新抽象路径名)
        file.renameTo(new File("cc.txt"));
        //删除文件(只能删除文件,或者一个空的文件夹,不能直接删除文件夹)
        file.delete();
    }
}
