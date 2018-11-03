package cn.guangjian.service.impl;

import cn.guangjian.dao.AccountDao;
import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * 保存
     * @param account
     */
    public void save(Account account) {
        accountDao.saveDao(account);
    }
    /**
     * 查找一个
     * @param integer
     */
    public Account findOne(Integer integer) {
        return null;
    }
    /**
     * 查找所有
     * @param
     */
    public List<Account> findAll() {
       return accountDao.findAllDao();
    }
    /**
     * 修改
     * @param account
     */
    public void update(Account account) {

    }
}
