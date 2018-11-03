package cn.guangjian.mybatis.dao;

import cn.guangjian.mybatis.domain.Account;
import cn.guangjian.mybatis.domain.QueryVo;
import cn.guangjian.mybatis.domain.User;
import cn.guangjian.mybatis.domain.UserAccount;

import java.util.List;

public interface UserDao {
    List<User> findAll();
//    查询特定条件的,这里的条件可能是用户名,可能是地址,可能是性别
    List<User> findIf(User user);
    //根据QueryVo中的id集合查询对应的lsit
    List<User> findIds(QueryVo queryVo);
    //查询account表
    List<Account> findAccount();
    //查询User表和Account表
    List<UserAccount> finUserAccount();
    //findAccountOther();
    List<Account> findAccountOther();
    //一对多  一个user对多个account
    List<User> findUserAccounts();

}
