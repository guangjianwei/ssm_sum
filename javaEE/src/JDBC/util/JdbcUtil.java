package JDBC.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
    static String url;
    static String user;
    static String password;
    static String driver;

    //用代码块来进行获取properties中的内容
    static {
        try {
//            ClassLoader classLoader = JdbcUtil.class.getClassLoader();
//            URL resource = classLoader.getResource("jdbc.properties");
//            String path = resource.getPath();
//
//            System.out.println(path);
//            Properties pro = new Properties();
//            pro.load(new FileInputStream(path));
            ClassLoader classLoader = JdbcUtil.class.getClassLoader();
            InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
            Properties pro = new Properties();
            pro.load(resourceAsStream);
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            //在这里直接进行注册驱动
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws SQLException {

            return DriverManager.getConnection(url, user, password);

    }

    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
