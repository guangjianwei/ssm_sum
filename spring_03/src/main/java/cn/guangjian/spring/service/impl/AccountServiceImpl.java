package cn.guangjian.spring.service.impl;

import cn.guangjian.spring.service.AccountService;

public class AccountServiceImpl implements AccountService {
    public void init(){
        System.out.println("对象创建");
    }
    public void destory(){
        System.out.println("对象消亡");
    }
    public AccountServiceImpl() {
        System.out.println("AccoungServiceImpl对象已经被创建!");
    }

    public void show() {
        System.out.println("展示1...");
    }
}
