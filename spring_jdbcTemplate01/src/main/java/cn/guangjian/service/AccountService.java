package cn.guangjian.service;

import cn.guangjian.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 保存
     * @param account
     */
      void save(Account account);
    /**
     * 查找一个
     * @param integer
     */
      Account findOne(Integer integer);
    /**
     * 查找所有
     * @param
     */
      List<Account> findAll();

    /**
     * 修改
     * @param account
     */
      void update(Account account);
}
