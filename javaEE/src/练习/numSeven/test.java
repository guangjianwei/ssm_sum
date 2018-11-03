package 练习.numSeven;
//复制文件夹
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        File srcDri = new File("E:\\songs");//源文件
        File destDri = new File("D:\\songs");//目标文件
        copy(srcDri,destDri);
        System.out.println("文件复制成功");
    }

    private static void copy(File srcDri, File destDri) throws IOException {
        //首先对文件进行大小的判断
        if(!destDri.exists()){
            destDri.mkdir();
        }
        if(srcDri.length()==0){
            return;
        }
        //首先获取所有的子文件夹和子文件
        File[] files = srcDri.listFiles();
        for (File file : files) {
            if(file.isFile()){
               File newDestDri = new File(destDri,String.valueOf(file.getName()));
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(newDestDri);
                int len = 0;
                byte[] bytes = new byte[1024*8];
                while((len = fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }
            if(file.isDirectory()){
                //首先要进行文件路径的拼接
                File newFile = new File(destDri,String.valueOf(file.getName()));
                if(!newFile.exists()){
                    newFile.mkdir();
                }
                copy(file, newFile);
            }
        }
    }
}
