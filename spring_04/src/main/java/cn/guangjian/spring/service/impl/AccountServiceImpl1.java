package cn.guangjian.spring.service.impl;

import cn.guangjian.spring.service.AccountService;

import java.util.Date;

public class AccountServiceImpl1 implements AccountService {
    private String username;
    private int password;
    private Date date;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void show() {
        System.out.println("展示1..."+username+"-"+password+"-"+date);
    }
}
