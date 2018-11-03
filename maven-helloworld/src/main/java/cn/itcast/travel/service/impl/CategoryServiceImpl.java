package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public String showCategory() {
        //获取连接
//        Jedis jedis = JedisPoolUtils.getJedis();
        ObjectMapper obj = new ObjectMapper();
//        System.out.println(jedis);
        String json = "";
        //首先从我们的jedis中查找
//        List<String> categoryList = jedis.lrange("categoryList", 0, -1);
//        if(categoryList.size()==0||categoryList==null){
        CategoryDao categoryDao = new CategoryDaoImpl();
        List<Category> list = categoryDao.showCategoryDao();
        //把list转换成json对象

        try {
             //把json数据存入jedis中
//            jedis.set("categoryList", String.valueOf(list));
             json = obj.writeValueAsString(list);
        } catch (JsonProcessingException e){
            e.printStackTrace();
        }
//        }else{
//            try {
//                json = obj.writeValueAsString(categoryList);
//            } catch (JsonProcessingException e) {
//                e.printStackTrace();
//            }
//        }
        //返回到servlet中

        return json;
    }
}
