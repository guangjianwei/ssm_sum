package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import com.alibaba.druid.sql.ast.expr.SQLAggregateExpr;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate tempt = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public void addUser(User user) {
        try {
            String sql = "INSERT INTO tab_user (uid,username,PASSWORD,NAME,birthday,sex,telephone,email,status,code) VALUES(NULL,?,?,?,?,?,?,?,?,?)";
            tempt.update(sql,
                    user.getUsername(),
                    user.getPassword(),
                    user.getName(),
                    user.getBirthday(),
                    user.getSex(),
                    user.getTelephone(),
                    user.getEmail(),
                    user.getStatus(),
                    user.getCode()
            );
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User checkUsername(String username) {
        String sql = "select * from tab_user where username = ?";
        User user = null;
        try {
            user = tempt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
        } catch (DataAccessException e) {
            System.out.println("空结果异常！");
        }
       return user;
    }

    @Override
    public User checkUserStatus(String uname) {
        String sql = "select * from tab_user where username = ?";
        User user = null;
        try {
             user = tempt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), uname);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public int active(String code) {
        String sql = "update tab_user set status = 'Y' where code = ?";
        int count = 0;
        try {
            count = tempt.update(sql, code);
        } catch (DataAccessException e) {

        }
        return count;
    }
}
