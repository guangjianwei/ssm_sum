package cn.guangjian.dao;

import cn.guangjian.domain.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 保存
     * @param account
     */
    void saveDao(Account account);
    /**
     * 查找一个
     * @param integer
     */
    Account findOneDao(Integer integer);
    /**
     * 查找所有
     * @param
     */
    List<Account> findAllDao();

    /**
     * 修改
     * @param account
     */
    void updateDao(Account account);
}
