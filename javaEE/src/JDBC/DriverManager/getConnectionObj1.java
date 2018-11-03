package JDBC.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class getConnectionObj1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/day24";
        //1) 使用用户名、密码、URL 得到连接对象
        Connection connection = DriverManager.getConnection(url, "root", "root");
        //com.mysql.jdbc.JDBC4Connection@68de145
        System.out.println(connection);

    }
}
