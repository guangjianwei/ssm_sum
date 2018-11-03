package test_Practice.day08Test;

import java.io.File;

/*
描述:创建两个文件对象，分别使用相对路径和绝对路径创建。
 */
public class test1 {
    public static void main(String[] args) {
        File file = new File("Java基础第二阶段\\2018 JavaSE 就业班习题");
        File file1 =new File("test_Practice\\day08Test");
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file1);
        System.out.println(file.exists());
    }
}
