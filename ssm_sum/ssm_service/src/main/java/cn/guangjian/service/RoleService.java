package cn.guangjian.service;


import cn.guangjian.domain.user.Permission;
import cn.guangjian.domain.user.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll() throws Exception;
    void save(Role role) throws Exception;

    Role findById(Integer id);

    List<Permission> findOtherPermissionByRoleId(Integer id);

    void addPermissionToRole(Integer roleId, String[] ids);

}
