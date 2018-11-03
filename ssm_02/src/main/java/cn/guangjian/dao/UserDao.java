package cn.guangjian.dao;

import cn.guangjian.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userDao")
public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from user")
    @Results(id="userMap",value={
            @Result(id=true,column = "name",property = "userName"),
            @Result(column = "password",property = "userPsw"),
            @Result(column = "sex",property = "userSex")
    })
    List<User> findAll();

    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into user (name,password,sex) values(#{userName},#{userPsw},#{userSex})")
    void insert(User user);
}
