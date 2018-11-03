package num04;

import java.util.ArrayList;
import java.util.List;

/*
1.定义ArrayList集合，存入如下字符串：“abc”，“123”，“java”，“mysql”，“别跑啊”；
2.遍历集合，将长度小于4的元素左边填充字符串0，并在控制台打印输出修改后集合中所有元素；
输出结果格式如下：
[0abc,0123,java,mysql,0别跑啊]
问题解析：
1.创建集合添加字符串
2.遍历集合，筛选出元素长度小于4的，进行填充操作，
3.打印集合
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("abc","123","java","mysql","别跑啊"));
//        list.add("abc");
//        list.add("123");
//        list.add("java");
//        list.add("mysql");
//        list.add("别跑啊");
        System.out.print("前：");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()<4){
                list.set(i,"0"+list.get(i));
            }
        }
        System.out.print("后：");
        System.out.println(list);

    }
}
