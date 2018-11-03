package cn.guangjian;
import cn.guangjian.spring.service.impl.AccountServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
    /**
     * @param args
     */
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取对象
        AccountServiceImpl2 accountService = (AccountServiceImpl2) ac.getBean("accountService2");
        accountService.show();
    }
}
