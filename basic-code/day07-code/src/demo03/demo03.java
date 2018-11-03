package demo03;

import java.util.ArrayList;

/*
1.创建一个ArrayList集合，用于存储一些字符。串："abc","def","def","ghi","def","hij","jkol"。
	2.遍历集合，统计集合中"def"字符串一共出现了多少个。
	3.将集合中的所有"def"字符串删除。打印删除后的集合元素。
 */
public class demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("ghi");
        list.add("def");
        list.add("hij");
        list.add("jkol");
        System.out.println();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)=="def"){
                count++;
            }
            System.out.print(list.get(i)+",");
        }
        System.out.println("def一共出现了"+count+"次");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)=="def"){
                list.remove(i);
                i--;              //提示：每次循环结束，如果程序进入到if语句，那么list就会少一个原素，如果在次循环
            }                       //下一个list原素的位置就会发生改变前移一个位置，那么只有i--，才能使得
        }                           //这个前移的元素被检测到
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
