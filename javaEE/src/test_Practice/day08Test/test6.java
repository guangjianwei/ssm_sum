package test_Practice.day08Test;


import java.io.File;
import java.util.Arrays;

/*

 */
public class test6 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        String[] files = file.list();
        System.out.println(Arrays.toString(files));


    }
}
