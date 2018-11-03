package cn.guangjian.dao;

import cn.guangjian.domain.Traveller;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TravellerDao {
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId = #{oid})")
    List<Traveller> findByOrderId(int oid) throws Exception;
}
