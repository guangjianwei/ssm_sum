package JDBC.C3p0;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class test {
    public static void main(String[] args) throws Exception {
        //1.创建数据库连接池
        DataSource ds =  new ComboPooledDataSource();
        //2.获取连接对象
        Connection conn = ds.getConnection();
        for (int i = 0; i < 10; i++) {

        System.out.println(i+","+conn);

        }
    }
}
