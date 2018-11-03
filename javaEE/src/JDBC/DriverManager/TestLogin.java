package JDBC.DriverManager;

import JDBC.util.JdbcUtil;

import java.sql.*;
import java.util.Scanner;

//验证登陆账号和密码是否是正确的
public class TestLogin {
    private static Connection conn;
    private static PreparedStatement ps;
    //1.首先创建数据库
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password1 = sc.nextLine();
        int password = Integer.parseInt(password1);
        //2.创建数据库连接
        try {
            //3.创建sql语句
            String str = "SELECT * FROM login WHERE NAME= ? AND PASSWORD = ?";
            conn = JdbcUtil.getConnection();
            //获取异常后进行开启事物
            conn.setAutoCommit(false);
            //4.获取执行sql对象
            ps = conn.prepareStatement(str);
            ps.setString(1,name);
            ps.setInt(2,password);
            //这里执行查询不需要传参数
            ResultSet resultSet = ps.executeQuery();
            if(resultSet!=null){
                System.out.println("恭喜你，登陆成功");
                conn.commit();  //如果程序继续执行，则提交事务
            }

        } catch (Exception e) {
            //如果程序出现任何的异常
            if(conn!=null){
                try {
                    conn.rollback();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
            System.out.println("对不起，你输入的密码账号有误！");

        }finally {
            JdbcUtil.close(ps, conn);
        }
    }
}
