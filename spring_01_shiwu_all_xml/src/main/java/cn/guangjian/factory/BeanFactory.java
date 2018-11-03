package cn.guangjian.factory;

import cn.guangjian.service.AccountService;
import cn.guangjian.service.impl.AccountServiceImpl;
import cn.guangjian.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//这个工厂是用来获取代理对象的
public class BeanFactory {
    private  AccountServiceImpl accountService;
    private  TransactionManager tsManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.tsManager = transactionManager;
    }
    public final void setAccountService(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    public  AccountService getAccountService(){
        return (AccountService)Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnVal=null;
                        //开启事务
                        tsManager.beginTransaction();
                        try{
                        //执行操作
                         returnVal = method.invoke(accountService,args);
                        //提交事务
                        tsManager.commit();
                        //返回
                        return returnVal;
                        }catch(Exception e){
                        //回滚事物
                            tsManager.rollback();
                            throw new RuntimeException(e);
                        }finally {
                        //释放资源
                            tsManager.close();
                        }
                    }
                });
    }
}
