package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.FavoriteDao;
import cn.itcast.travel.domain.Favorite;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FavoriteDaoImpl implements FavoriteDao {
    private JdbcTemplate tempt = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public Favorite isFavorite(int uid, int rid) {
        Favorite favorite = null;
        try {
            String sql = "select * from tab_favorite where uid = ? and rid = ?";
            favorite = tempt.queryForObject(sql,new BeanPropertyRowMapper<>(Favorite.class),uid,rid);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return favorite;
    }

    @Override
    public void addFavorite(int uid, int rid) {
        String sql = "insert into tab_favorite values(?,?,?)";
        tempt.update(sql,rid,new Date(),uid);
        }

    @Override
    public int showFavCount(String rid) {
        int favCount = 0;
        try {
            String sql = "select count(*) from tab_favorite where rid = ?";
           favCount = tempt.queryForObject(sql,Integer.class,rid);
        } catch (DataAccessException e) {
            //如果查询为空
            favCount=0;
        }
        return favCount;
    }

    @Override
    public void addCount(String rid, int favCount) {
        String sql  = "update tab_route set count = ? where rid= ?";
        tempt.update(sql,favCount,rid);
    }

    @Override
    public int getFavCount(String rname, int le_price, int rg_price) {
        String sql = "select count(*) from tab_route where 1=1 ";
        StringBuilder sb = new StringBuilder(sql);
        List params = new ArrayList();//存放参数
        //拼接参数
        if(rname!=""){
            sb.append(" and rname like ? ");
            params.add("%"+rname+"%");
        }
        if(le_price!=0&&rg_price!=0){
            sb.append(" and price between ? and ? ");
            params.add(le_price);
            params.add(rg_price);
        }
        if(le_price==0&&rg_price!=0){
            sb.append(" and price <= ? ");
            params.add(rg_price);
        }
        if(le_price!=0&&rg_price==0){
            sb.append(" and price >= ? ");
            params.add(le_price);
        }
        sb.append(" and count>0 ");
        sql = sb.toString();
        Integer count = null;
        try {
            if(params.size()==0){
                count = tempt.queryForObject(sql, Integer.class);
            }else {
                count = tempt.queryForObject(sql, Integer.class, params.toArray());
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<Route> getFavPage(String rname, int le_price, int rg_price, int start, int pageSize) {
        String sql = "select * from tab_route where 1=1 ";
        StringBuilder sb = new StringBuilder(sql);
        List params = new ArrayList();//存放参数
        //拼接参数
        if(rname!=""){
            sb.append(" and rname like ? ");
            params.add("%"+rname+"%");
        }
        if(le_price!=0&&rg_price!=0){
            sb.append(" and price between ? and ? ");
            params.add(le_price);
            params.add(rg_price);
        }
        if(le_price==0&&rg_price!=0){
            sb.append(" and price <= ? ");
            params.add(rg_price);
        }
        if(le_price!=0&&rg_price==0){
            sb.append(" and price >= ? ");
            params.add(le_price);
        }
        sb.append(" and count>0 ");
        sb.append(" limit ?,? ");
        params.add(start);
        params.add(pageSize);
        sql = sb.toString();
        List<Route> list = null;
        try {
            list = tempt.query(sql, new BeanPropertyRowMapper<>(Route.class), params.toArray());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return list;
    }
}
