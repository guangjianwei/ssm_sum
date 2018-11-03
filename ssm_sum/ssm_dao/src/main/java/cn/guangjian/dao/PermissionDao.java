package cn.guangjian.dao;

import cn.guangjian.domain.user.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public interface PermissionDao {
    /**
     * 查询所有权限信息
     * @return
     */
    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    /**
     * 添加权限
     * @param permission
     */
    @Insert("insert into permission (permissionName,url)values(#{permissionName},#{url})")
    void save(Permission permission)  throws Exception;
    /**
     * 根据角色id查询对应的所有权限
     * @param id
     * @return
     * @throws Exception
     */
    @Select("select * from permission where id in(select permissionId from role_permission where roleId = #{id})")
    List<Permission> findPermissionsByRoleId(Integer id) throws Exception;
}
