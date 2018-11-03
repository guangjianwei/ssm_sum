package cn.guangjian.dao;

import cn.guangjian.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDao {
        /**
         * 查询产品所有
         * @return
         */
        @Select("select * from product")
        List<Product> findAll() throws Exception;
        @Insert("INSERT INTO PRODUCT(id, productnum, productname, cityname, departuretime, productprice,productdesc, productstatus)VALUES (NULL,#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
        void save(Product product);

        /**
         * 查询一个产品
         * @return
         */
        @Select("select * from product where id = #{pid}")
        Product finById(int pid) throws Exception;
}
