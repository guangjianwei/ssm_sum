package test_Practice.day08Test;

import java.io.File;

/*
描述:
键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
 */
public class test10 {
    public static void main(String[] args) {
        File file = new File("src\\cn");
        removeFile(file);
    }

    private static void removeFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                removeFile(file1);
            }else {
                file1.delete();
            }

        }
        file.delete();

    }
}
