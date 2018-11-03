package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {

    void addUserService(User user);

    boolean checkUsername(String username);

    Boolean checkUserStatus(String uname);

    Boolean activeUser(String code);
}
