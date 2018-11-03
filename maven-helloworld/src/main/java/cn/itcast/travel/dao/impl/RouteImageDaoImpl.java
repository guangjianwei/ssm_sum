package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteImageDao;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class RouteImageDaoImpl implements RouteImageDao {
    private JdbcTemplate tempt = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<RouteImg> getImages(int rid) {
        List<RouteImg> list_img = new ArrayList();
        String sql = "select * from tab_route_img where rid = ?";
        try {
            list_img = tempt.query(sql, new BeanPropertyRowMapper<>(RouteImg.class), rid);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return list_img;
    }
}
