package cn.guangjian.service.impl;

import cn.guangjian.dao.AccountDao;
import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import cn.guangjian.utils.TransactionManager;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }



    public void insert(Account account){
        accountDao.insert(account);
    }

    public void delete(Integer integer) {
        accountDao.delete(integer);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public Account findOne(Integer integer) {
       return accountDao.findOne(integer);
    }

    public void trasfer(String outPer, String inPer, Double money) {
        Account out = accountDao.findOneName(outPer);
        out.setBalance(out.getBalance()-money);
        Account in = accountDao.findOneName(inPer);
        in.setBalance(in.getBalance()+money);
        accountDao.update(out);
        accountDao.update(in);
    }
}