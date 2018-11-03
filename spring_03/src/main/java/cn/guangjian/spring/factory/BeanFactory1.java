package cn.guangjian.spring.factory;

import cn.guangjian.spring.service.impl.AccountServiceImpl;

public class BeanFactory1 {
    public static Object getAccountService(){
     return new AccountServiceImpl();
    }
}
