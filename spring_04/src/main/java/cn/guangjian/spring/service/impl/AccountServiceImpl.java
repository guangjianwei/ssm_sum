package cn.guangjian.spring.service.impl;

import cn.guangjian.spring.service.AccountService;

import java.util.Date;

public class AccountServiceImpl implements AccountService {
    private String username;
    private int password;
    private Date date;

    public AccountServiceImpl(String username, int password, Date date) {
        this.username = username;
        this.password = password;
        this.date = date;
    }
    public void show() {
        System.out.println("展示1..."+username+"-"+password+"-"+date);
    }
}
