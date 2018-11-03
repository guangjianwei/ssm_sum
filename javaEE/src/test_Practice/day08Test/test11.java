package test_Practice.day08Test;

import java.io.File;

/*
练习六:文件获取方法,递归的使用
描述:从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
 */
public class test11 {
    public static void main(String[] args) {
        File file = new File("src\\cn");
        int countSize = 0;
        System.out.println("文件总大小为："+getSize(countSize,file));

    }

    private static  int getSize(int countSize, File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                countSize+=file1.length();
            }else {
              countSize+=getSize(countSize,file1); //一定要注意这里的写法
            }
        }
       return countSize;
    }
}
