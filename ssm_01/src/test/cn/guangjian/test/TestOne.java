package cn.guangjian.test;

import cn.guangjian.dao.AccountDao;
import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestOne {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:bean.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
        accountService.findAll();
        accountDao.findAll();
    }
    @Test
    public void run2() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取session
        SqlSession session = factory.openSession();
        //创建代理对象
        AccountDao mapper = session.getMapper(AccountDao.class);
        List<Account> list = mapper.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        session.close();
        in.close();
    }
    @Test
    public void run3() throws IOException {
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(200.0);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取session
        SqlSession session = factory.openSession();
        //创建代理对象
        AccountDao mapper = session.getMapper(AccountDao.class);
        mapper.save(account);
        session.commit();
        session.close();
        in.close();
    }
}
