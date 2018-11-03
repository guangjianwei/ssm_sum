package cn.guangjian.dao;

import cn.guangjian.domain.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
    @Select("select * from member where id = #{mid}")
    Member findById(int mid) throws Exception;
}
