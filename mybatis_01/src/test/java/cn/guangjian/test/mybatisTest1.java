package cn.guangjian.test;
import cn.guangjian.dao.UserDao;
import cn.guangjian.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class mybatisTest1 {
    /**
     * 入门案例
     * @param args
     */
    public static void main(String[] args)throws Exception {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
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
