package cn.guangjian;

import cn.guangjian.config.SpringConfigrutation;
import cn.guangjian.domain.Account;
import cn.guangjian.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    @Test
    public void insert(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = ac.getBean("account", Account.class);
        account.setName("见遍天下");
        account.setBalance(500.00);
        accountService.insert(account);
    }
    @Test
    public void delete(){
        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.delete(3);
    }
    @Test
    public void update(){
        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = ac.getBean("account", Account.class);
        account.setId(4);
        account.setName("jianbian");
        account.setBalance(1000.00);
        accountService.update(account);
    }
    @Test
    public void findOne(){
        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = accountService.findOne(1);
        System.out.println(account.toString());
    }
}
