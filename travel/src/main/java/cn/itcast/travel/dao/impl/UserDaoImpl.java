package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate tempt = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public void addUser(User user){
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
                    null,
                    null
            );
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

    }
}
