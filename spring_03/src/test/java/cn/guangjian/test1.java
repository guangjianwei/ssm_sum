package cn.guangjian;


import cn.guangjian.spring.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    //获取spring的Ioc核心对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取对象
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");
        accountService.show();
        ac.close();
    }
}
