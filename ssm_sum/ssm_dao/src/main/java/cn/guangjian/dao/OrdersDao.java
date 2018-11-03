package cn.guangjian.dao;

import cn.guangjian.domain.Orders;
import cn.guangjian.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersDao {
    @Select("select * from orders")
    @Results({
            @Result(id = true,property = "id",column ="id" ),
            @Result(property = "orderNum",column ="orderNum" ),
            @Result(property = "orderTime",column ="orderTime" ),
            @Result(property = "orderStatus",column ="orderStatus" ),
            @Result(property = "peopleCount",column ="peopleCount" ),
            @Result(property = "payType",column ="payType" ),
            @Result(property = "orderDesc",column ="orderDesc" ),
            @Result(property = "product",column ="productId",one = @One(
                    select="cn.guangjian.dao.ProductDao.finById"
            ))}
    )
    List<Orders> findAll(Integer page,Integer size) throws Exception;

    /**
     * 查询一个订单详情
     * @param oid
     * @return
     */
    @Select("select * from orders where id = #{oid}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column ="orderNum" ),
            @Result(property = "orderTime",column ="orderTime" ),
            @Result(property = "orderStatus",column ="orderStatus" ),
            @Result(property = "peopleCount",column ="peopleCount" ),
            @Result(property = "payType",column ="payType" ),
            @Result(property = "orderDesc",column ="orderDesc" ),
            @Result(property = "product",column ="productId",javaType = Product.class,one = @One(
                    select="cn.guangjian.dao.ProductDao.finById"
            )),
            @Result(property = "travellers",column ="id",javaType = java.util.List.class,many = @Many(
                    select="cn.guangjian.dao.TravellerDao.findByOrderId"
            )),
            @Result(property = "member",column ="memberId",one = @One(
                    select="cn.guangjian.dao.MemberDao.findById"
            ))
    })
    Orders findById(Integer oid) throws Exception;
}
