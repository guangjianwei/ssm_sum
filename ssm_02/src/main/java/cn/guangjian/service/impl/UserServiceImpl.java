package cn.guangjian.service.impl;

import cn.guangjian.dao.UserDao;
import cn.guangjian.domain.User;
import cn.guangjian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService{
    @Qualifier("userDao")
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        System.out.println("查询所有...");
        List<User> list = userDao.findAll();
        return list;
    }

    @Override
    public void insert(User user) {
        System.out.println("插入数据...");
        userDao.insert(user);
    }
}
