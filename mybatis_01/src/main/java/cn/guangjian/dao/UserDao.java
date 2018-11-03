package cn.guangjian.dao;

import cn.guangjian.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
