package day02.demo04;

import day02.demo04.Interface1;

public class Test{
    public static void main(String[] args) {
        Interface1<String> inter = new Interface1<String>() {
            @Override
            public void add(String s) {
                System.out.println(s);
            }
        };
        inter.add("傻逼宝");
        System.out.println();
        new Interface1<String>() {
            @Override
            public void add(String s) {
                System.out.println(s);
            }
        }.get("臭逼宝");
    }


}
