package cn.guangjian.service;

import cn.guangjian.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void save(Account account);
}
