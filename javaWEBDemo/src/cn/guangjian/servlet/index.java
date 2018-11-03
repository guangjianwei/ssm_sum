package cn.guangjian.servlet;


import cn.guangjian.domain.user;

import java.util.ArrayList;
import java.util.List;

public class index {
    public static void main(String[] args) {
        Long aong = Long.valueOf(44);
        int count = aong.intValue();
        System.out.println(count);
        String str = "aaa";
        String str1 ="";
        user user  = new user();
        user.setId(1);
        user.setUsername("aaa");
        System.out.println(user.getId());
        if(str1!=""){
            System.out.println("呵呵呵呵额和");
        }
        List list = new ArrayList();
        list.add("%"+str+"%");
        list.add("bb");
        list.add("ccc");
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println(objects.toString());

    }
}
