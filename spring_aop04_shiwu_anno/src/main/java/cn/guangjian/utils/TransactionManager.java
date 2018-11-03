package cn.guangjian.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 *和事务相关的工具类,包括开启事务,提交事务,回滚事务,释放连接
 */
@Component("transactionManager")
public class TransactionManager {
    @Autowired
    ConnectionUtils connectionUtils;
    @Pointcut("execution(* cn.guangjian.service.impl.*.*(..))")
    public void pt1(){

    }
    /**
     * 开启事务
     */
   public void beginTransaction(){
        //利用工具类获取连接对象
       try {
           connectionUtils.getConnection().setAutoCommit(false);
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
    /**
     * ,提交事务
     */
    public void commit(){
        try {
            connectionUtils.getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 回滚事务
     */
    public void rollback(){
        try {
            connectionUtils.getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 释放连接
     */
    public void close(){
        try {
            connectionUtils.getConnection().close();
            connectionUtils.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Around("pt1")
    public Object arroundAdvice(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            //1.获取参数
            Object[] args = pjp.getArgs();
            //2.开启事务
            this.beginTransaction();
            //3.执行方法
            rtValue= pjp.proceed(args);
            //4.提交事务
            this.commit();
            return rtValue;

        }catch(Throwable e){
            //回滚事务
            this.rollback();
            throw new RuntimeException(e);

        }finally {
            //关闭连接
            this.close();
        }

    }
}
