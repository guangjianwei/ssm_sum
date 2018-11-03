package JDBC.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class getConnectionObj2 {
    public static void main(String[] args) throws Exception {
        //url 连接字符串
        String url = "jdbc:mysql://localhost:3306/day24";
        //属性对象
        Properties info = new Properties();
        //把用户名和密码放在 info 对象中
        info.setProperty("user","root");
        info.setProperty("password","root");
        Connection connection = DriverManager.getConnection(url, info);
        //com.mysql.jdbc.JDBC4Connection@68de145
        System.out.println(connection);
    }
}
