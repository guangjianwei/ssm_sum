package JDBC.DriverManager;

import java.sql.*;

public class test1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demo";
        //1) 使用用户名、密码、URL 得到连接对象
        Connection connection = DriverManager.getConnection(url, "root", "root");
        Statement stmt = connection.createStatement();
        String str= "select name,age from student";
        ResultSet resultSet = stmt.executeQuery(str);
        while (resultSet.next()){
            System.out.println(resultSet.getString("name")+",");
            System.out.println(resultSet.getString("age"));
            System.out.println();
        }
    }
}
