package day09;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

//properties是集合Hashtable的一个子类
public class properties {
    public static void main(String[] args) throws IOException {
        Properties per = new Properties();
        per.load(new FileInputStream("src\\day09\\pro.properties"));
        per.setProperty("傻屌宝","臭逼宝");
        System.out.println(per);
        System.out.println(per.getProperty("name"));
        Set<String> strings = per.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"->"+per.getProperty(string));
            System.out.println();
        }


    }


}
