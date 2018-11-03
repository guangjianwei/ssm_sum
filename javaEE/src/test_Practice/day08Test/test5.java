package test_Practice.day08Test;

import java.io.File;
import java.time.temporal.IsoFields;


/*
练习一:文件创建、判断功能、获取功能
描述:
键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
如果是文件，则输出文件的大小
如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
 */
public class test5 {
    public static void main(String[] args) {
        int size = 0;
        File file =new File("D:\\aaa");
        System.out.println(getLength(file,size));


    }

    private static int getLength(File file,int size) {

            File[] files = file.listFiles();
            for (File file1 : files) {
                if(file1.isDirectory()) {
                    getLength(file1,size);
                }
                if(file1.isFile()){
                    size+=file1.length();
                }

            }

            return size;
        }
        }



