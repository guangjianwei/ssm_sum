package test_Practice.day10Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
描述:
项目根路径下有text.txt文件，内容如下：
	我爱黑马
	123456
利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
	123456
我爱黑马
 */
public class test8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src\\test_Practice\\day10Test\\text.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\test_Practice\\day10Test\\text1.txt"));
        ArrayList<String> list = new ArrayList<>();
        int len = 0;
        String line ;
        while((line= br.readLine())!=null){
            list.add(line);
            }
            br.close();
        Collections.reverse(list);
        bw.write(list.get(0)+"\r\n");
        bw.write(list.get(1));
        bw.close();
    }
}
