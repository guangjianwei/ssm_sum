package cn.guangjian.mybatis.dao;

import cn.guangjian.mybatis.domain.Account;
import cn.guangjian.mybatis.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
@CacheNamespace(blocking = true)
public interface UserDao {
    /**
     * 查询account所有,利用注解的方法
     */
    @Select("select * from account")
    List<Account> findAll();
    @Select("delete  from  account where id = #{id}")
    void deleteOne(Integer integer);
    @Select("update account set uid=#{uid},money = #{money} where id = #{id}")
    void updateOne(Account account);
    @Select("insert into account values(#{id},#{uid},#{money})")
    void insertOne(Account account);
    /**
     * 查询User所有
     */
    @Select("select * from User")
    @Results(id="userMap",value={
            @Result(id=true,column = "id",property = "userId"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "username",property = "userName"),
            @Result(column = "birthday",property = "userBirthday")
    })
    List<User> findUsers();


    /**
     * 查询一个（根据id）
     */
    @Select("select * from user where id = #{id}")
    @ResultMap("userMap")
    User findById(Integer integer);


    /**
     * 模糊查询(参数的方式)
     */
    @Select("select * from user where username like #{username}")
    @ResultMap("userMap")
    List<User> dimSearch1(String username);


    /**
     * 模糊查询(sql拼接方式)
     */
    @Select("select * from user where username like '%${value}%'")
    @ResultMap("userMap")
    List<User> dimSearch2(String username);


    /**
     * 一对一(account->user)
     */
    @Select("select * from account")
    @Results(value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "money",property = "money"),
            @Result(property = "user",column = "uid",one=@One(select = "cn.guangjian.mybatis.dao.UserDao.findById",fetchType= FetchType.EAGER))

    })
    List<Account> findOneByOne();
    /**
     * 一对多(user->account)
     */
    @Select("select * from user")
    @Results(value = {
            @Result(id=true,column = "id",property = "userId"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "username",property = "userName"),
            @Result(column = "birthday",property = "userBirthday"),
            @Result(column = "id",property = "accounts",many=@Many(select = "cn.guangjian.mybatis.dao.UserDao.findByUid",fetchType = FetchType.LAZY))
    })
    List<User> findOneByMany();

    /**
     * 根据单个uid查询account中的list集合
     * @return
     */
    @Select("select * from account where uid = #{id}")
    List<Account> findByUid(Integer integer);
 }
