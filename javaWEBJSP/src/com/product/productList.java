package com.product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//获取到所有产品的list
public class productList {
    JdbcTemplate template = new JdbcTemplate(JDBCutils.getDataSource());

//    public static void main(String[] args) {
//        List<pruduct> list = getList();
//        System.out.println(list);
//    }
    public  List<pruduct> getList(){
        try {
            String str = "select * from product";
            List<pruduct> list = template.query(str, new BeanPropertyRowMapper<pruduct>(pruduct.class));
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
