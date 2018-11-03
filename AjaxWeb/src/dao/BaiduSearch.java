package dao;

import domain.Search;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCutils;

import java.util.List;

public class BaiduSearch {
   private JdbcTemplate template = new JdbcTemplate(JDBCutils.getDataSource());
   public List<Search> search(String name){
       String sql = "select * from search where name like ?";
       String str = "%"+name+"%";
       List<Search> list = null;
       try {
           list = template.query(sql, new BeanPropertyRowMapper<>(Search.class), str);
       } catch (DataAccessException e) {
           System.out.println("么么哒！！！");
       }
       return list;

   }
}
