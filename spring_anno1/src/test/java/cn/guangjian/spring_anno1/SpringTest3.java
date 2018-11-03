package cn.guangjian.spring_anno1;

import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest3 {
    public static void main(String[] args) {
        //获取ioc核心
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new AnnotationConfigApplicationContext("bean.xml");
        AccountServiceImpl as= ac.getBean("accountService", AccountServiceImpl.class);
        as.saveAccount();
        ac.close();
    }
}
