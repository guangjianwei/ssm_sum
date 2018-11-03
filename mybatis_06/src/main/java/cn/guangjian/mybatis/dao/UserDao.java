package cn.guangjian.mybatis.dao;

import cn.guangjian.mybatis.domain.Account;
import cn.guangjian.mybatis.domain.User;

import java.util.List;

public interface UserDao {
    //检测一对一延迟
    List<Account> findAll();
    List<User> findById(Integer id);
    //一级缓存检测
    User testFirstLevelCache(Integer integer);
    //如果数据出现了删除更新或者修改等操作，那么以及缓存将会被删除
    void updateUser(User user);
}
