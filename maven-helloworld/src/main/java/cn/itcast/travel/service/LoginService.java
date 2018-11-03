package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public abstract interface LoginService {
 abstract User checkUnamePass(String username, String password);
}
