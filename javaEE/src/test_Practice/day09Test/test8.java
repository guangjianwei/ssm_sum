package test_Practice.day09Test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
描述:
我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
score.txt文件内容如下：
zhangsan = 90
lisi = 80
wangwu = 85
 */
public class test8 {
    public static void main(String[] args) throws IOException{
        File file = new File("src\\test_Practice\\day09Test\\score.txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(("zhangsan = 90"+"\r\n").getBytes());
        fos.write(("lisi = 80"+"\r\n").getBytes());
        fos.write(("wangwu = 85"+"\r\n").getBytes());
        //利用hashtable有一个子集叫做properties集合
        Properties proper = new Properties();
        proper.load(new FileInputStream(file));
        Set<String> keys = proper.stringPropertyNames();
        for (String key : keys) {
            if(key.equals("lisi")){
                proper.setProperty(key,"100");

            }
        }
        proper.store(new FileOutputStream(file),"haha");
        fos.close();

    }
}
