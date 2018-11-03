package cn.itcast.day08.dmeo01.demo05;

import java.util.Scanner;

//利用indexOf和subString的方法对大字符串中出现的小字符串进行数数
//三种方法进行字符串的截取
/*
1.获取索引intdexOf  subtring，找到然后删除
 */
public class Stringsub {
    public static void main(String[] args) {
        String strBig= "werwrheima,sdfaisfoheima,ksjfjiheimajslkfjasjff,heima";
        String strSmall= "heima";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入大串字符：");
//        String scBig = sc.next();
//        System.out.println("请输入小串字符：");
//        String scSmall = sc.next();
        getStr1(strBig,strSmall);
        getStr2(strBig,strSmall);
        getStr3(strBig,strSmall);

    }
    public static void getStr1(String scBig,String scSmall){
        //1.获取索引intdexOf  subtring，找到然后删除
        int count=0;
        while (true){
            int index = scBig.indexOf(scSmall);
            if(index==-1){
                break;
            }else{
                scBig = scBig.substring(index+scSmall.length());
                count++;
            }
        }
        System.out.println(count);

    }
    public static void getStr2(String scBig,String scSmall){
        int count =0;
        String[] str = scBig.split(scSmall);
        //2.利用split方法进行分割字符串的方式，查看分割后数组的长度-1，就是
        if(scBig.endsWith(scSmall)){
            System.out.println(str.length);
        }else{
            System.out.println(str.length-1);
        }
    }
    public static void getStr3(String scBig,String scSmall){
        //替换，利用长度的差值，来求出count
        String str = scBig.replace(scSmall,"");
        int count = (scBig.length()-str.length())/scSmall.length();
        System.out.println(count);
    }

}