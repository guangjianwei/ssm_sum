package JDBC.DruidSpring;

import JDBC.Druid.JDBCutils;
import JDBC.Druid.JDBCutils1;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        //1.导包jar
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCutils1.getDataSource());
        String sql1 = "SELECT * FROM USER WHERE username=? AND PASSWORD=?";
        Map<String, Object> som = template.queryForMap(sql1,"zhangsan","123");
        System.out.println(som);


    }
}
