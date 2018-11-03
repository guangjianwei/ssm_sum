package JDBC.DriverManager;
import java.sql.*;

public class DMLDemoDriverManager {
    public static void main(String[] args) {
        //1.获取数据连接对象
        Connection connection =null;
        Statement statement = null;
        ResultSet rs=null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            //2.sql语句对象
           statement = connection.createStatement();
           //3.发送给服务器
            String str = "select * from student";
            rs = statement.executeQuery(str);
            //对查询的结果给进行遍历
            while(rs.next()){
                System.out.println("编号:"+rs.getInt("id")+"姓名:"+rs.getString("name")+"年龄:"+rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭连接
//            JdbcUtils.close(connection,ps,resultSet);
            //这里面,关闭资源的顺序应该是近到远
//            if(rs!=null){
////                try {
////                    rs.close();
////                } catch (SQLException e) {
////                    e.printStackTrace();
////                }
////
////            }
////
////            if(statement!=null){
////                try {
////                    statement.close();
////                } catch (SQLException e) {
////                    e.printStackTrace();
////                }
////
////            }
////            if(connection!=null){
////                try {
////                    connection.close();
////                } catch (SQLException e) {
////                    e.printStackTrace();
////                }
////
////            }
        }

    }
}
