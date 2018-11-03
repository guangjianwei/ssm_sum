package 练习.numThree;

import java.io.File;
import java.util.Scanner;

//从键盘接收一个文件夹路径,删除该文件夹(不要操作系统盘目录下的内容)
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径(格式:xx\\yy\\mm):");
        File file = new File(sc.nextLine());
        delectFile(file);
    }

    private static void delectFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                delectFile(file1);
            }
                if (file1.isFile()) {
                    file1.delete();
                }
            }

           file.delete();
        System.out.println("文件已经成功删除");

    }
}
