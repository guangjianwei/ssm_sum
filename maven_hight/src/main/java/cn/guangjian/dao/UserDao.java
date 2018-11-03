package cn.guangjian.dao;

import cn.guangjian.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     */
    List<User> findAll();
}
