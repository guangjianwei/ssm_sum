package com.itheima03.stream;

import java.util.ArrayList;
import java.util.List;
/*

    进行第一个筛选
       将 名字中 带 王的 人筛选出来 存储起来

    进行第二个筛选
       在上面的集合中  进行筛选 名字带有三个字的人
 */
public class ListDemo {

    public static void main(String[] args) {
        //JDK9添加集合方法
        List<String> list = List.of("虚竹","王重阳","南院大王","隔壁老王","王大锤");

        // 创建一个 存储 名字中带 王的 人的集合
        ArrayList<String> one = new ArrayList<>();
        for (String name : list) {
            if(name.contains("王")){
                one.add(name);
            }
        }

        // 跟你就上一筛选结果 筛选
        ArrayList<String> two = new ArrayList<>();
        for (String name : one) {
            if(name.length()==3){
                two.add(name);
            }
        }

        for (String s : two) {
            System.out.println(s);
        }
    }
}
