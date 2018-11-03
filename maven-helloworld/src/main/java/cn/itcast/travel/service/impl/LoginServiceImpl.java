package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.LoginDao;
import cn.itcast.travel.dao.impl.LoginDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public User checkUnamePass(String username, String password) {
        LoginDao loginDao = new LoginDaoImpl();
       return loginDao.checkUandP(username,password);
    }
}
