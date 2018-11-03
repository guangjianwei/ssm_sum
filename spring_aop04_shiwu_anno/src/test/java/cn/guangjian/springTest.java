package cn.guangjian;

import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import cn.guangjian.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class springTest {
    @Autowired
    private AccountService accountService;
    @Autowired
    private Account account;
    @Test
    public void trasfer(){
        accountService.trasfer("jim","rose", (double) 100);
    }
}
