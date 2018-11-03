package JDBC.DruidSpring;

import JDBC.Druid.JDBCutils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        //1.导包jar
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCutils.getDataSource());
        //3.调用方法
        String sql = "UPDATE login SET PASSWORD = 222 WHERE id =?";
        int count = template.update(sql, 1);
        System.out.println(count);

        //select
        System.out.println("=============");
        String sql1 = "SELECT * FROM login where id =?";
        Map<String, Object> som = template.queryForMap(sql1,1);
        System.out.println(som);
        System.out.println("=============");
        String sql2 = "SELECT * FROM login ";
        List<Map<String, Object>> maps = template.queryForList(sql2);
        System.out.println(maps);

    }
}
