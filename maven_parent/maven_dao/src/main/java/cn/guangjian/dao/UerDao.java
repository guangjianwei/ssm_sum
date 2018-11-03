package cn.guangjian.dao;

import cn.guangjian.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface UerDao {
    /**
     * 查询所有
     */
    @Select("select * from user")
    List<User> findAll();
}
