package cn.guangjian.dao.impl;

import cn.guangjian.dao.AccountDao;
import cn.guangjian.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
    //此变量也可以让spring提供
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    /**
     * 增加
     * @param account
     */
    public void insert(Account account){
        try {
            runner.update("insert into account(name,balance) values(?,?)",account.getName(),account.getBalance());

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
            runner.update("delete from account where id = ?",integer);
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
            runner.update("update account set name = ?,balance = ?  where id = ?",account.getName(),account.getBalance(),account.getId());
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
            return runner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class), i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
