package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface LoginDao {
    User checkUandP(String username, String password);
}
