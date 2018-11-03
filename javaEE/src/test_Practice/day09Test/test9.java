package test_Practice.day09Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
定义一个方法统计test.txt文件中’a’字符出现的次数。
比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
 */
public class test9 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\test_Practice\\day09Test\\test.txt");
        file.createNewFile();
        String str = new Scanner(System.in).nextLine();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(str.getBytes());
        FileInputStream fis = new FileInputStream(file);
        int len =0;
        int count=0;
        while((len = fis.read())!=-1){
            if((char)len=='a'){
                count++;
            }
        }
        System.out.println("a出现了："+count+"次");

    }

}
