package cn.guangjian.spring.dao.impl;

import cn.guangjian.spring.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
    public AccountDaoImpl() {
        System.out.println("AccountDaoImpl对象已经被创建!");
    }
    public void show(){
        System.out.println("展示2...");
    }
}
