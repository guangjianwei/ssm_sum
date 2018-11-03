package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService {
    @Override
    public void addUserService(User user) {
        UserDao userDao = new UserDaoImpl();
        //这里设置user的状态码和激活码
        user.setCode(UuidUtil.getUuid());
        user.setStatus("N");
        userDao.addUser(user);
        //添加user之后,发送邮件,待确认
        String content = "请<a href = 'http://localhost:9090/mgr/user/activeUserServlet?code="+user.getCode()+"'>激活邮件</a>";
        MailUtils.sendMail(user.getEmail(),content,"激活邮件");
    }

    @Override
    public boolean checkUsername(String username) {
        UserDao cheuname = new UserDaoImpl();
        User user = cheuname.checkUsername(username);
        if(user==null||user.toString().length()==0){
        return false;
        }else{
            return true;
        }
    }

    @Override
    public Boolean checkUserStatus(String uname) {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.checkUserStatus(uname);
        if("Y".equals(user.getStatus())){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 激活用户
     * @param code
     * @return
     */
    @Override
    public Boolean activeUser(String code) {
        UserDao userDao = new UserDaoImpl();
      int count = userDao.active(code);
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
}
