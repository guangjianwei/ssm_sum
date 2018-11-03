package cn.guangjian.service;

import cn.guangjian.domain.user;

public interface userService {
   Boolean checkUser(user user);

   Boolean userNameCheck(String username);
}
