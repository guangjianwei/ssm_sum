package cn.guangjian.dao;

import cn.guangjian.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public interface AccountDao{
    @Select("select * from account")
    List<Account>  findAll();
    @Insert(value="insert into account (name,money) values (#{name},#{money})")
    void save(Account account);
}
