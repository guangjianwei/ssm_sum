package cn.guangjian.spring_anno1;

import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {
    public static void main(String[] args) {
        //获取ioc核心
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new AnnotationConfigApplicationContext("bean.xml");
        AccountServiceImpl as1 = ac.getBean("accountService", AccountServiceImpl.class);
        AccountServiceImpl as2 = ac.getBean("accountService", AccountServiceImpl.class);
        System.out.println(as1==as2);
    }
}
