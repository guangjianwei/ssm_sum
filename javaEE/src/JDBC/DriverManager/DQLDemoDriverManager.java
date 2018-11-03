package JDBC.DriverManager;

import JDBC.util.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
DriverManager 作用：
1) 管理和注册驱动
2) 创建数据库的连接
 */
public class DQLDemoDriverManager {
    public static void main(String[] args){
        Statement statement = null;
        Connection conn =null;
        try{
            //1.获取连接对象
//           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            conn = JdbcUtil.getConnection();
            //2.通过连接对象获取到语句对象
          statement = conn.createStatement();
            //3.通过语句对象发送sql语句给服务器,执行语句
            String str ="UPDATE student SET NAME = '傻屌宝' WHERE id = 1;";
            int i = statement.executeUpdate(str);//这个返回值是影响的行数
            System.out.println("所影响的行是:"+i);
            System.out.println("语句修改成功");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //最后要释放资源
            //关闭之前要进行判断
            JdbcUtil.close(statement,conn);
//            if(statement!=null){
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(conn!=null){
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//
//            }
        }


    }
}
