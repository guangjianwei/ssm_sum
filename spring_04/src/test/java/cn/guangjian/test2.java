package cn.guangjian;


import cn.guangjian.spring.service.impl.AccountServiceImpl;
import cn.guangjian.spring.service.impl.AccountServiceImpl1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取对象
        AccountServiceImpl1 accountService = (AccountServiceImpl1) ac.getBean("accountService1");
        accountService.show();
    }
}
