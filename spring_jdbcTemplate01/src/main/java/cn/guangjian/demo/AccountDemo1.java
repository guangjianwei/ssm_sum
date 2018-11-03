package cn.guangjian.demo;

import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDemo1 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        Account account = ac.getBean("account", Account.class);
        account.setName("guangjian");
        account.setBalance(1000.0);
        accountService.save(account);
    }
}
