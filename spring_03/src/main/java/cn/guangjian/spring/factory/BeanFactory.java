package cn.guangjian.spring.factory;

import cn.guangjian.spring.service.impl.AccountServiceImpl;

public class BeanFactory {
    public Object getAccountService(){
     return new AccountServiceImpl();
    }
}
