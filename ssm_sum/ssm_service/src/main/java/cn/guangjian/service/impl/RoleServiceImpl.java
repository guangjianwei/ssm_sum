package cn.guangjian.service.impl;

import cn.guangjian.dao.RolesDao;
import cn.guangjian.domain.user.Permission;
import cn.guangjian.domain.user.Role;
import cn.guangjian.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RolesDao rolesDao;
    @Override
    public List<Role> findAll() throws Exception{
        List<Role> list = rolesDao.findAll();
        return list;
    }

    @Override
    public void save(Role role) throws Exception {
        rolesDao.save(role);
    }

    @Override
    public Role findById(Integer id) {
        return  rolesDao.findById(id);
    }

    @Override
    public List<Permission> findOtherPermissionByRoleId(Integer id) {
        return rolesDao.findOtherPermissionByRoleId(id);
    }

    @Override
    public void addPermissionToRole(Integer roleId, String[] ids) {
        //对获取的ids进行遍历,分别调用dao中的方法
        int permissionId;
        for (String id : ids) {
            permissionId = Integer.parseInt(id);
            rolesDao.addPermissionToRole(roleId,permissionId);
        }
    }
}
