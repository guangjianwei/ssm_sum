package cn.guangjian.service;

import cn.guangjian.domain.user.Role;
import cn.guangjian.domain.user.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;
    void save(UserInfo userInfo) throws Exception;
    UserInfo findById(Integer id) throws Exception;

    List<Role> findByIdOtherRoles(Integer id);

    void addRoleToUser(Integer id, String[] ids);
}
