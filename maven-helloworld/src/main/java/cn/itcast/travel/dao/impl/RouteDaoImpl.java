package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class RouteDaoImpl implements RouteDao {
    private JdbcTemplate tempt = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public int getCountPage(int cid,String rname) {
        String sql = "select * from tab_route where 1=1 ";
       //定义模板
        StringBuilder sb = new StringBuilder(sql);

        //定义条件们
        List params = new ArrayList();
        if(cid!=0){
            sb.append(" and cid = ? ");
         params.add(cid);
        }
        if(rname!="0"){
            sb.append(" and rname like ? ");
            params.add("%"+rname+"%");
        }
        List<Route> list = null;
        sql = sb.toString();
        try {
            list = tempt.query(sql,new BeanPropertyRowMapper<>(Route.class), params.toArray());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        int i = list.size();
        return i;
    }

    @Override
    public List<Route> getPageList(int pageSize, int start, int cid,String rname) {
        String  sql= "select * from tab_route where 1=1 ";
        //定义模板
        StringBuilder sb = new StringBuilder(sql);

        //定义条件们
        List params = new ArrayList();
        if(cid!=0){
            sb.append(" and cid = ? ");
            params.add(cid);
        }
        if(rname!="0"){
            sb.append(" and rname like ? ");
            params.add("%"+rname+"%");
        }
        sb.append(" limit ?,? ");
        params.add(start);
        params.add(pageSize);
        List<Route> list = null;
        sql = sb.toString();
        try {
            list = tempt.query(sql, new BeanPropertyRowMapper<>(Route.class),params.toArray() );
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Route getOne(int rid) {
        String sql = "select * from tab_route where rid = ?";
        Route route = null;
        try {
            route = tempt.queryForObject(sql, new BeanPropertyRowMapper<>(Route.class), rid);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return route;
    }
}
