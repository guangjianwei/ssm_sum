package cn.guangjian.utils;

import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionUtils {
    private ThreadLocal<Connection> t1 = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public Connection getConnection(){
        //获取连接
        Connection conn = t1.get();
        try{

        //判断
        if(conn==null){
            //从数据源终中取一个连接,给t1
            conn = dataSource.getConnection();
            t1.set(conn);
        }
        return conn;
        }catch(Exception e){
          throw new RuntimeException(e);
        }
    }

    /**
     * 把线程和连接进行解绑
     */
    public void removeConnection(){
    t1.remove();
    }
}
