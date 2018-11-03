package cn.guangjian.dao;

import cn.guangjian.domain.user.Permission;
import cn.guangjian.domain.user.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesDao {
    /**
     * 查询所有角色
     *
     * @return
     * @throws Exception
     */
    @Select("select * from role")
    @ResultMap("roleMap")
    List<Role> findAll() throws Exception;

    /**
     * 添加角色用户
     *
     * @param role
     * @throws Exception
     */
    @Insert("insert into role (roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void save(Role role) throws Exception;

    /**
     * 根据用户id查询对应的所有角色
     */
    @Select("select * from role where id in(select roleId from users_role where userId = #{id})")
    @Results(id = "roleMap", value =
            {
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "roleName", column = "roleName"),
                    @Result(property = "roleDesc", column = "roleDesc"),
                    @Result(property = "permissions", column = "id", javaType = java.util.List.class, many = @Many(
                            select = "cn.guangjian.dao.PermissionDao.findPermissionsByRoleId"
                    )),
                    @Result(property = "users", column = "id", javaType = java.util.List.class, many = @Many(
                            select = "cn.guangjian.dao.UserDao.findUsersByRoleId"
                    ))
            }
    )
    List<Role> findRolesByuserId(Integer id) throws Exception;

    /**
     * 根据id查询角色信息
     *
     * @param id
     * @return
     */
    @Select("select * from role where id = #{id}")
    @Results(
            {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", javaType = java.util.List.class, many = @Many(
            select = "cn.guangjian.dao.PermissionDao.findPermissionsByRoleId"
                    ))
            }
    )
    Role findById(Integer id);

    /**
     * 根据角色id,查询对应的可添加的权限List
     *
     * @param id
     * @return
     */
    @Select("select * from permission where id not in (select permissionId from role_permission where roleId =#{id})")
    List<Permission> findOtherPermissionByRoleId(Integer id);

    /**
     * 给特定角色添加权限
     * @param roleId
     * @param permissionId
     */
    @Insert("insert into role_permission (roleId,permissionId) values(#{roleId},#{permissionId})")
    void addPermissionToRole(@Param("roleId") Integer roleId,@Param("permissionId") Integer permissionId);
}
