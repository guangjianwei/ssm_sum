package cn.guangjian.service.impl;

import cn.guangjian.dao.UserDao;
import cn.guangjian.domain.user.Role;
import cn.guangjian.domain.user.UserInfo;
import cn.guangjian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        //查询所有角色
        List<Role> roles = null;
        try {
            userInfo = userDao.findByUsername(username);
            roles = userInfo.getRoles();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //调用getAuthoritry
        List<SimpleGrantedAuthority> authoritys = getAuthority(roles);
        //由于返回的是userDetails对象，所以要对象userInfo对象进行转换
        User user= new User(userInfo.getUsername(),userInfo.getPassword(),userInfo.getStatus() == 0 ? false : true, true, true, true, authoritys);
        return user;
    }
    private List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {
        List<SimpleGrantedAuthority> authoritys = new ArrayList();
        for (Role role : roles) {
            authoritys.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }
        return authoritys;
    }
    public List<UserInfo> findAll() throws Exception {
        List<UserInfo> list = userDao.findAll();
        return list;
    }
    @Override
    public void save(UserInfo userInfo) throws Exception {
        //把密码获取出来进行加密重新赋
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        userDao.save(userInfo);
    }

    @Override
    public UserInfo findById(Integer id) throws Exception{
       UserInfo user =  userDao.findById(id);
        return user;
    }

    @Override
    public List<Role> findByIdOtherRoles(Integer id) {
       return userDao.findByIdOtherRoles(id);

    }

    @Override
    public void addRoleToUser(Integer id, String[] ids) {
        //首先遍历ids
        int roleId;
        for (String s : ids) {
            //首先把s转换成int类型
            roleId= Integer.parseInt(s);
            //调用dao方法进行添加
            userDao.addRoleToUser(id,roleId);
        }
    }
}
