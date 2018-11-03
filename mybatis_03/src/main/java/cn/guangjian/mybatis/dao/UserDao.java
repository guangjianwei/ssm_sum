package cn.guangjian.mybatis.dao;

import cn.guangjian.mybatis.domain.QueryVo;
import cn.guangjian.mybatis.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    void addAll(User user);
    void update(User user);
    void delete(int id);
    User findByOne(int id);
    User findQueryVoOne(QueryVo queryVo);
    List<User> dimSearch(String username);
    List<User> dimSearch1(String username);
    Integer findTotal();
}
