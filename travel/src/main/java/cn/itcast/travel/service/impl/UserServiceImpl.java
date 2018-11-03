package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void addUserService(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.addUser(user);
    }
}
