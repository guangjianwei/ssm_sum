package cn.guangjian;

import cn.guangjian.domain.Account;
import cn.guangjian.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class springTest {
    @Autowired
    private   AccountServiceImpl accountService;
    @Autowired
    private Account account;
    @Test
    public void insert(){
        account.setName("见遍天下");
        account.setBalance(500.00);
        accountService.insert(account);
    }
    @Test
    public void delete(){
        accountService.delete(3);
    }
    @Test
    public void update(){
        account.setId(3);
        account.setName("jianbian");
        account.setBalance(1000.00);
        accountService.update(account);
    }
    @Test
    public void findOne(){
        Account account = accountService.findOne(1);
        System.out.println(account.toString());
    }
}
