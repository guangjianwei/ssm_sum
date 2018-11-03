package cn.guangjian;
import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //上面出现了依赖关系,所以换了一种写法
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");
        //3.获取数据库数据的预处理对象
        PreparedStatement prept = conn.prepareStatement("select * from account");
        //4.执行操作
        ResultSet rs = prept.executeQuery();
        //遍历结果
        while (rs.next()){
            String sorts = rs.getString("sorts");
            System.out.println(sorts);
        }
        //5.关闭连接
        prept.close();
        conn.close();
    }
}
