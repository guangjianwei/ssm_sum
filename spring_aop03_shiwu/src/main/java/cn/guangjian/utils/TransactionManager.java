package cn.guangjian.utils;

import java.sql.SQLException;

/**
 *和事务相关的工具类,包括开启事务,提交事务,回滚事务,释放连接
 */
public class TransactionManager {
    ConnectionUtils connectionUtils;
    //创建一个set方法,交给spring来管理
    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
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
}
