package 练习.numFour;


import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中,每种类型的文件及个数,

	注意:用文件类型(后缀名,不包含.,"java","txt")作为key,用个数作为value,放入到map集合中,并按照如下格式打印map集合中的内容

		docx类型的文件有  1 个
		java类型的文件有  24 个
		txt类型的文件有  10 个

 */
public class test {
    static int countJava = 0;
    static int countDoc = 0;
    static int countTxt =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径(格式:xx\\yy\\mm):");
        String in = sc.nextLine();
        File file =new File(in);
        Map<String,Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = getFile(file, map1);
        Set<String> keySet = map2.keySet();
        for (String s : keySet) {
            System.out.println(s+"类型的文件有:"+map2.get(s)+"个");
        }
    }

    private static Map<String, Integer> getFile(File file, Map<String, Integer> map) {
        File[] files = file.listFiles();

        for (File file1 : files) {
            if(file1.isDirectory()){
                getFile(file1,map);
            }else if(file1.isFile()){
                if(file1.getName().contains(".java")){
                    countJava++;
                }
                if(file1.getName().contains(".doc")){
                    countDoc++;
                }
                if(file1.getName().contains(".txt")){
                    countTxt++;
                }
            }

        }
        map.put("java",countJava);
        map.put("doc",countDoc);
        map.put("txt",countTxt);
        return map;
    }
}
