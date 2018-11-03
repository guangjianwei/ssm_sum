package cn.guangjian.dao;

import cn.guangjian.domain.user.Role;
import cn.guangjian.domain.user.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from users")
    public List<UserInfo> findAll() throws Exception;

    /**
     * 查询用户详情(根据用户id)
     * @param id
     * @return
     */
    @Select("select * from users where id = #{id}")
    @Results(
            {
                    @Result(id=true,property ="id" ,column = "id"),
                    @Result(property ="username" ,column = "username"),
                    @Result(property ="email" ,column = "email"),
                    @Result(property ="password" ,column = "password"),
                    @Result(property ="phoneNum" ,column = "phoneNum"),
                    @Result(property ="status" ,column = "status"),
                    @Result(property ="roles" ,column = "id",javaType = java.util.List.class,many = @Many(
                            select = "cn.guangjian.dao.RolesDao.findRolesByuserId"
                    )),
            }
    )
    public UserInfo findById(Integer id);

    /**
     * 根据角色id查询对应的所有用户
     * @param id
     * @return
     * @throws Exception
     */
    @Select("select * from users where id in(select userId from users_role where roleId = #{id})")
    public List<UserInfo> findUsersByRoleId(Integer id) throws Exception;

    /**
     * 添加用户
     * @param userInfo
     * @throws Exception
     */
    @Insert("insert into users(email,username,password,phoneNum,status) value(#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo userInfo) throws Exception;
    /**
     * 根据姓名查询用户
     * @param username
     * @return
     * @throws Exception
     */
    @Select("select * from users where username = #{username}")
    @Results(value = {
            @Result(id = true,property ="id" ,column = "id"),
            @Result(property ="username" ,column = "username"),
            @Result(property ="email" ,column = "email"),
            @Result(property ="password" ,column = "password"),
            @Result(property ="phoneNum" ,column = "phoneNum"),
            @Result(property ="status" ,column = "status"),
            @Result(property ="roles" ,column = "id",javaType = java.util.List.class,many = @Many(
                    select = "cn.guangjian.dao.UserDao.findByUserIdRoles"
            )),
    })
    UserInfo findByUsername(String username) throws Exception;
    /**
     * 查询所有角色
     * @return
     */
    @Select("select * from role")
     List<Role> findRoles();

    /**
     * 根据用户的id查询用户所对应的所有角色
     * @param uid
     * @return
     */
    @Select("select * from role where id in (select roleId from users_role where userId = #{uid})")
    List<Role> findByUserIdRoles(Integer uid);

    /**
     * 根据用户id，查询用户对应所有角色中非用户的所有角色
     * @param id
     * @return
     */
    @Select("select * from role where id not in(select roleId from users_role where userId = #{id})")
    List<Role> findByIdOtherRoles(Integer id);
    @Insert("insert into users_role (userId,roleId) values(#{id},#{roleId})")
    void addRoleToUser(@Param("id") Integer id, @Param("roleId") int roleId);
}
