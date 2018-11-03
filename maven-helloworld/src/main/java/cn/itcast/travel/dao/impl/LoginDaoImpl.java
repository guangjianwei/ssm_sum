package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.LoginDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDaoImpl implements LoginDao {
    private JdbcTemplate tempt = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public User checkUandP(String username, String password) {
        String sql = "select * from tab_user where username=? and password=?";
        User user = null;
        try {
            user = tempt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
        } catch (DataAccessException e) {
            System.out.println("空结果！");
        }
        if(user==null||user.toString().length()==0){
            return null;
        }else{
            return user;
        }
    }
}
