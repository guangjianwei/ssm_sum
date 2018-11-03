package cn.guangjian.spring.service.impl;

import cn.guangjian.spring.service.AccountService;

public class AccountServiceImpl implements AccountService {
    public AccountServiceImpl() {
        System.out.println("AccoungServiceImpl对象已经被创建!");
    }

    public void show() {
        System.out.println("展示1...");
    }
}
