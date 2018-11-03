package cn.guangjian.test;

import cn.guangjian.Service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = ac.getBean(AccountService.class, "accountService");
        accountService.save();
        accountService.find(2);
        accountService.update();
    }
}
