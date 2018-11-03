package 练习.numTwo;

//	从键盘接收一个文件夹路径,统计该文件夹大小
/*
思路:
1.首先要定义一个方法来获取文件夹路径,在其中要对输入的路径对进行判断,从而返回一个正确的文件夹路径
2.
 */
import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径(格式:xx\\yy\\mm):");
        File file = new File(sc.nextLine());
        System.out.println("该文件大小为:");
        System.out.print(getSize(file));


    }
    public  static long getSize(File file){
        File[] files = file.listFiles();
        long length=0;
        for (File file1 : files) {
            if(file1.isFile()){
                long length1 = file1.length();
                length= length1+length;

            }
            if(file1.isDirectory()){
               length+= getSize(file1);
            }
        }
        return length;
    }
}
