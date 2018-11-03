package cn.guangjian.dao.impl;

import cn.guangjian.dao.AccountDao;
import cn.guangjian.domain.Account;
import cn.guangjian.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    //此变量也可以让spring提供
    private QueryRunner runner;
    ConnectionUtils connectionUtils;
    //创建一个set方法,交给spring来管理
    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }
    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    /**
     * 增加
     * @param account
     */
    public void insert(Account account){
        try {
            runner.update(connectionUtils.getConnection(),"insert into account(name,balance) values(?,?)",account.getName(),account.getBalance());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 删除
     * @param
     *
     * */
    public void delete(Integer integer) {
        try {
            runner.update(connectionUtils.getConnection(),"delete from account where id = ?",integer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 更新数据
     * @param account
     */
    public void update(Account account) {
        try {
            runner.update(connectionUtils.getConnection(),"update account set name = ?,balance = ?  where id = ?",account.getName(),account.getBalance(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 查看一条
     * @param
     */
    public Account findOne(Integer i) {
        try {
            return runner.query(connectionUtils.getConnection(),"select * from account where id = ?", new BeanHandler<Account>(Account.class), i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Account findOneName(String name) {
        try {
            List<Account> list = runner.query(connectionUtils.getConnection(),"select * from account where name = ?", new BeanListHandler<Account>(Account.class), name);
            if(list==null || list.size()==0){
                return null;
            }else if(list.size()>1){
                throw new RuntimeException("查询的内容不符合条件!");
                }
                return list.get(0);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
