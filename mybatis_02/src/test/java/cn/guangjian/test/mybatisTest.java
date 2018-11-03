package cn.guangjian.test;






import cn.guangjian.dao.UserDao;
import cn.guangjian.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {
    /**
     *入门案例:查询所有
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in=null;
        try {
           in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
         //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = ssfb.build(in);
        //3.使用工厂产生SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao代理对象
        UserDao mapper = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> list = mapper.findAll();
        //遍历
        for (User user : list) {
            System.out.println(user.toString());
        }
        //关闭资源
        session.close();
        in.close();
    }
}
