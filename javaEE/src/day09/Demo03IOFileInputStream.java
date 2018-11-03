package day09;

import java.io.FileInputStream;

public class Demo03IOFileInputStream{
    //读取文件中的内容，并进行输出打印
    public static void main(String[] args)  throws Exception{
        FileInputStream fis = new FileInputStream("src\\day09\\day09.txt" );
        //用read方法进行读取
        byte[] buff = new byte[4];
        //read方法返回的是一个读取字节的个数
        int len = 0;
        while((len=fis.read(buff))!=-1){
//            for (byte b : buff) {
//                System.out.print((char)b);
//            }
            //简洁的写法,用string类中的一个方法，对byte的数组字节数组进行字符串转换
            System.out.print(new String(buff,0,len));
        }
        fis.close();

    }

}
