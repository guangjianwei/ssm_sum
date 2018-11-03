package cn.guangjian.service.impl;

import cn.guangjian.dao.UerDao;
import cn.guangjian.domain.User;
import cn.guangjian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UerDao userDao;
    @Override
    public List<User> findAll() {
        System.out.println("service方法执行...");
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user.toString());
        }
        return list;

    }
}
