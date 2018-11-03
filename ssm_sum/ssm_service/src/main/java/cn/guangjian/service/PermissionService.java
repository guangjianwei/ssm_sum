package cn.guangjian.service;

import cn.guangjian.domain.user.Permission;

import java.util.List;

public interface PermissionService {
    /**
     * 查询所有权限信息
     * @return
     */
    List<Permission> findAll() throws Exception;

    /**
     * 添加权限
     * @param permission
     */
    void save(Permission permission) throws Exception;
}
