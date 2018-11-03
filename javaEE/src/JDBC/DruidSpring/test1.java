package JDBC.DruidSpring;

import JDBC.Druid.JDBCutils;
import JDBC.Druid.JDBCutils1;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class test1 {
    //向demo数据库的login表中添加一条记录
    //创建jdbcTemplate对象
    static JdbcTemplate jtate = new JdbcTemplate(JDBCutils.getDataSource());
    @Test
    public void add(){
        String str = "insert into login values(?,?,?)";
        int count = jtate.update(str, null, "王五", 33);
        System.out.println(count);
    }
    //删除login表中刚刚添加的数据
    @Test
    public void delect(){
        String str = "DELETE from login where id=?" ;
        int update = jtate.update(str, 3);
        System.out.println(update);
    }
    //查询id为1的数据将其封装成map集合
    @Test
    public void map(){
        String str = "SELECT * FROM login WHERE NAME=? AND PASSWORD=?;";
        Map<String, Object> map = jtate.queryForMap(str,"zhangsan",123);
        System.out.println(map);
    }
    //查询所有的数据将其封装成list集合
    @Test
    public void list(){
        String str  = "select * from login";
        List<Map<String, Object>> maps = jtate.queryForList(str);
        //遍历这个list集合
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }
    // 查询所有记录，将其封装为Emp对象的List集合
    @Test
    public void empList(){
        String str  = "select * from login";
        List<emp> query = jtate.query(str, new BeanPropertyRowMapper<emp>(emp.class));
        for (emp emp : query) {
            System.out.println(emp);
        }
    }
    @Test
    public void function() {
        String sql = "select count(id) from login";
        Long count = jtate.queryForObject(sql, Long.class);
        System.out.println(count);

    }
}
