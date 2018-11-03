package day10;
/*
3.侍中、侍郎郭攸之、费祎、董允等，此皆良实，志虑忠纯，是以先帝简拔以遗陛下。愚以为宫中之事，事无大小，悉以咨之，然后施行，必得裨补阙漏，有所广益。
8.愿陛下托臣以讨贼兴复之效，不效，则治臣之罪，以告先帝之灵。若无兴德之言，则责攸之、祎、允等之慢，以彰其咎；陛下亦宜自谋，以咨诹善道，察纳雅言，深追先帝遗诏，臣不胜受恩感激。
4.将军向宠，性行淑均，......
分析上述的问题：
    a.可以把上述的问题加载到map集合当中，在进行遍历。(利用高效字符流的方式)
    b.在读取文件的时候对获取到的每行数据进行分割"\\.",左边的为键，右边为值。
    c.对集合进行遍历，对当前数据按照一定的格式writer到新的文件当中。

 */
//src\\出师表.txt进行重新的格式化到新的数组中

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class newTest {
    public static void main(String[] args) throws IOException{
        BufferedReader buffReader = new BufferedReader(new FileReader("src\\出师表.txt"));
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter("src\\day10\\新出师表.txt"));
        String bufRder ;
        HashMap<Integer,String> oldMap = new HashMap<>();
        while((bufRder= buffReader.readLine())!=null){
              String[] str = bufRder.split("\\.");
              oldMap.put(Integer.parseInt(str[0]),str[1]);
        }
        Set<Integer> integers = oldMap.keySet();
        for (Integer integer : integers) {
            buffWriter.write(integer+"."+oldMap.get(integer));
            buffWriter.newLine();

        }
        buffReader.close();
        buffWriter.close();
    }

}
