package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//将src中的图片赋值到src\\day09\\xiaoyueyue.jpg
/*
1.创建两个输出与输入的文件对象
2.把src中图片read出来以数组的形式保存到内存当中。
3.在把数组形式的数据转换存储到目标文件当中
 */
public class Demo04Copy {
    public static void main(String[] args) throws Exception {
        FileInputStream Srcfis = new FileInputStream("src\\wukong.jpg");
        FileOutputStream Desfos = new FileOutputStream("src\\day09\\xiaoyueyue.jpg");
        int len = 0;
        byte[] srcByte = new byte[1024];//定义一个空的定长数组用来存放从源文件取出来的字节码
   //     StringBuilder stcStringBui = new StringBuilder();//定义一个容器用来存储从源文件里面取出的所有数据
        while ((len=Srcfis.read(srcByte))!=-1){
       //     String temString = new String(srcByte,0,len);
            Desfos.write(srcByte,0,len);
            //           stcStringBui.append(temString);
        }
        //     byte[] DesBytes = stcStringBui.toString().getBytes();//将容器里面取到的数据，转换成byte数组
         Desfos.close();
        Srcfis.close();
    }
}
