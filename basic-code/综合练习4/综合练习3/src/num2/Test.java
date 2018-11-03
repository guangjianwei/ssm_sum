package num2;

import java.util.ArrayList;

//
//字符串数组strs中包含字符串{"12","345","6789","1","123","4567"} ，
//创建2个ArrayList集合 ，分别存放strs数组中字符串长度为偶数的元素和字
//符串长度为奇数的元素 ，最终将这两个集合在控制台打印输出 ：
//打印格式如下：
//偶数长度字符串[12,6789,4567]
//奇数长度字符串[345,1,123]
//解题思路：
//1.生成一个提示的字符串和两个集合
//2.把strs每个字符串进行遍历，对其中的元素进行长度筛选和判断，
//偶数加入ArrayList1，奇数加入ArrayList2.
//3.分别对这两个集合进行打印，直接sout（ArrayList）
//
//第3题：
//编写一个Java程序，定义一个String字符串"   ab123cd  "，首先去除字符串两端的空白，然后截取出字符串中的最后3个字符并在控制台输出。
//
class Test {
    public static void main(String[] args) {
        String[] strs ={"12","345","6789","1","123","4567"};
        ArrayList<String> arrayList1 = new ArrayList();//存放偶数
        ArrayList<String> arrayList2 = new ArrayList();//存放奇数
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length()%2==0){
                arrayList1.add(strs[i]);
            }else {
                arrayList2.add(strs[i]);
            }
        }
        System.out.print("偶数长度的字符串：");
        System.out.println(arrayList1);
        System.out.print("奇数长度的字符串：");
        System.out.println(arrayList2);
    }


}
