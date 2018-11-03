package 练习.numSix;

import day09.FileWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
6.分析以下需求，并用代码实现
	模拟歌曲复制和删除过程：假设在D：\\songs文件夹中存在一些歌曲(均为mp3格式)
	循环显示该菜单：请选择您要进行的操作：1：查询所有歌曲   2：根据歌曲名称复制  3：根据歌曲名称删除 4: 退出
	举例：
		用户输入：1
			存在以下歌曲：
				蒙娜丽莎的眼泪
				烟花易冷
				上海滩
				小苹果
				夜空中最亮的星

		用户输入：2
			请输入要复制的歌曲名称: 上海滩
			请输入存储路径: E:\\songs  (说明:该路径如果存在则不创建,不存在则创建)
			复制结果: 歌曲上海滩已经成功复制到E:\\songs目录中

		用户输入：3
			请输入要删除的歌曲名称: 上海滩
			删除结果: 歌曲上海滩已经成功删除

		用户输入: 4
			退出系统
 */
public class Test {
    public static void main(String[] args) throws IOException{
        //定义功能项目
        File file = new File("E:\\\\songs");
        String[] str = {"查询所有歌曲","根据歌曲名称复制","根据歌曲名称删除","退出"};
        System.out.println("循环显示该菜单：请选择您要进行的操作：1：查询所有歌曲   2：根据歌曲名称复制  3：根据歌曲名称删除 4: 退出");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请用户进行输入:");
            String sysIn = sc.nextLine();
            int a = Integer.parseInt(sysIn);
            if(a==1){
                searchAll(file);
            }
            if(a==2){
                copyMusic(file);
            }
            if(a==3){
                delectMusic(file);
            }
            if(a==4){
                break;
            }
        }
        System.out.println("程序已经结束");
    }

    private static void delectMusic(File file) {
        System.out.print("请输入要删除的歌曲名称:");
        Scanner sc = new Scanner(System.in);
        String n = file.getName();
        String str =sc.nextLine()+".mp3";
        File[] files = file.listFiles();
        for (File file1 : files) {
            String m = file1.getName();
            if(m.equals(str)){
                    file1.delete();
            }
        }
        File[] fileRel = file.listFiles();
        Collection<String> coll = new ArrayList<>();
        coll.toArray(fileRel);
        if(!coll.contains(str)){
        System.out.println("歌曲已经成功删除!");

        }else{
        System.out.println("歌曲删除失败!");

        }
    }

    private static void copyMusic(File file) throws IOException{
        System.out.println("请输入要Copy的歌曲名称:");
        Scanner sc = new Scanner(System.in);
          String str = sc.nextLine()+".mp3";
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.getName().equals(str)){
                FileInputStream fis = new FileInputStream(file1);
                String m= file1.getName();
                String newDre = "E:\\songsCopy";
                File newFileDre = new File(newDre);
                newFileDre.mkdir();
                String newName = "E:\\songsCopy\\"+m;
                File newFile = new File(newName);
                newFile.createNewFile();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len =0;
                byte[] bytes = new byte[1024];
                while((len = fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
            }
        }
        System.out.println("歌曲已经成功的copy!");
    }

    private static void searchAll(File file) {
        System.out.println("存在以下歌曲:");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
        System.out.println();
    }
}
