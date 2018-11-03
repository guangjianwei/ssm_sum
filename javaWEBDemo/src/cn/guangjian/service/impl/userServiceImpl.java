package cn.guangjian.service.impl;

import cn.guangjian.dao.getUsernameCheckDao;
import cn.guangjian.dao.impl.userDaoImpl;
import cn.guangjian.dao.userDao;
import cn.guangjian.domain.user;
import cn.guangjian.service.userService;

public class userServiceImpl implements userService {
    @Override
    public Boolean checkUser(user user){
        userDao ud = new userDaoImpl();
        Object obj = ud.checkUserDao(user);
        if(obj==null){
        return false;
        }else{
            return true;
        }
    }

    @Override
    public Boolean userNameCheck(String username) {
        getUsernameCheckDao getUcheck = new userDaoImpl();

        return getUcheck.getUcheck(username);
    }
}
