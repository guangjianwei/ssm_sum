package cn.guangjian.dao.impl;

import cn.guangjian.dao.AccountDao;
import cn.guangjian.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    JdbcTemplate jt;

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    /**
     * 保存
     * @param account
     */
    public void saveDao(Account account) {
        try{
            jt.update("insert into account(name,balance) VALUES (?,?)",account.getName(),account.getBalance());
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    /**
     * 查找一个
     * @param integer
     */
    public Account findOneDao(Integer integer){
        return null;
    }
    /**
     * 查找所有
     * @param
     */
    public List<Account> findAllDao() {
        try{
          return getJdbcTemplate().query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    /**
     * 修改
     * @param account
     */
    public void updateDao(Account account) {

    }
}
