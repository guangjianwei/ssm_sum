package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    void addUser(User user);

    User checkUsername(String username);

    User checkUserStatus(String uname);

    int active(String code);
}
