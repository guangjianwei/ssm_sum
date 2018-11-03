package cn.guangjian.test;

import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class DemoTest1 {
    @Autowired
   private AccountService accountService;
    @Autowired
   private   Account account;
    /**
     * 保存
     * @param
     */
    @Test
   public void save(){
        account.setName("guangjian");
        account.setBalance(1000.0);
        accountService.save(account);
    }
    /**
     * 查找一个
     * @param
     */
    @Test
    public void findOne(){

    }
    /**
     * 查找所有
     * @param
     */
    @Test
    public void findAll(){
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account.toString());
        }
    }

    /**
     * 修改
     * @param
     */
    @Test
    public void update(){

    }
}
