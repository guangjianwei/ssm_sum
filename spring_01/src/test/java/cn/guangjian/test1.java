package cn.guangjian;
import cn.guangjian.spring.factory.BeanFactory;
import cn.guangjian.spring.service.impl.AccountServiceImpl;

public class test1 {
    public static void main(String[] args) {
        //这种写法就会避免new对象而出现的耦合现象
//        AccountServiceImpl accountService = (AccountServiceImpl)BeanFactory.getBean("accountService");
//        accountService.show();
//        AccountDaoImpl accountDao = (AccountDaoImpl)BeanFactory.getBean("accountDao");
//        accountDao.show();
        for (int i = 0; i < 5; i++) {
        AccountServiceImpl accountService = (AccountServiceImpl) BeanFactory.getBean("accountService");
        //生产了五个对象,都是同一个对象
            System.out.println(accountService);

        }
    }
}
