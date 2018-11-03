package cn.guangjian.mybatis.dao;


import cn.guangjian.mybatis.domain.Role;
import cn.guangjian.mybatis.domain.User;

import java.util.List;

public interface UserDao {
    //Role表查询
    List<Role> finRoles();
//    //多表查询 User到Role
    List<Role> findRoleUsers();
    //多表查询Role到User
    List<User> finUserRoles();
    //查询User
    List<User> findUsers();
}
