package cn.guangjian.service.impl;

import cn.guangjian.dao.AccountDao;
import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    //注入AccountDao
    @Qualifier("accountDao")
    @Autowired
    AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("service层实现...findAll");

        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("service层实现...save");
        accountDao.save(account);

    }
}
