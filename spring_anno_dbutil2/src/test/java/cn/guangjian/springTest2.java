package cn.guangjian;

import cn.guangjian.config.SpringConfigrutation;
import cn.guangjian.domain.Account;
import cn.guangjian.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用Junit单元测试：测试我们的配置
 * Spring整合junit的配置
 *      1、导入spring整合junit的jar(坐标)
 *      2、使用Junit提供的一个注解把原有的main方法替换了，替换成spring提供的
 *             @Runwith
 *      3、告知spring的运行器，spring和ioc创建是基于xml还是注解的，并且说明位置
 *          @ContextConfiguration
 *                  locations：指定xml文件的位置，加上classpath关键字，表示在类路径下
 *                  classes：指定注解类所在地位置
 *
 *   当我们使用spring 5.x版本的时候，要求junit的jar必须是4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfigrutation.class)
public class springTest2 {
    @Autowired
    private  AccountServiceImpl accountService;
    @Autowired
    private Account account;
    @Test
    public void insert(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
//        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
//        Account account = ac.getBean("account", Account.class);
        account.setName("见遍天下");
        account.setBalance(500.00);
        accountService.insert(account);
    }
    @Test
    public void delete(){
//        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
//        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.delete(5);
    }
    @Test
    public void update(){
//        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
//        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
//        Account account = ac.getBean("account", Account.class);
        account.setId(4);
        account.setName("jianbian");
        account.setBalance(1000.00);
        accountService.update(account);
    }
    @Test
    public void findOne(){
//        ApplicationContext ac =   new AnnotationConfigApplicationContext(SpringConfigrutation.class);
//        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = accountService.findOne(1);
        System.out.println(account.toString());
    }
}
