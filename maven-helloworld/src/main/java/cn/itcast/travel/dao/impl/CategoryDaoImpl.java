package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CategoryDaoImpl  implements CategoryDao{
    private JdbcTemplate tempt = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Category> showCategoryDao() {
        String sql = "select * from tab_category";
        List<Category> list=null;
        try {
            list = tempt.query(sql, new BeanPropertyRowMapper<>(Category.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return list;
    }
}
