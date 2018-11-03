package cn.guangjian;

import cn.guangjian.mybatis.dao.UserDao;
import cn.guangjian.mybatis.domain.Account;
import cn.guangjian.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class mybatisTest {
    private InputStream in;
    SqlSessionFactory factory;
    private SqlSession sqlSession;
    private UserDao mapper;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
         factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        mapper = sqlSession.getMapper(UserDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
        // sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }
    @Test
    public void findAll(){
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(account.toString()+account.getUser().toString());
        }
    }

    /**
     * 检测一级缓存
     */
    @Test
    public void findOneUser(){
        User user1 = mapper.testFirstLevelCache(41);
        System.out.println(user1);
        sqlSession.close();
        //重新获取sqlSession对象
        SqlSession sqlSession1 = factory.openSession(true);
        UserDao mapper1 = sqlSession1.getMapper(UserDao.class);
        User user2= mapper1.testFirstLevelCache(41);
        System.out.println(user2);

        System.out.println(user1==user2);
    }

    /**
     * 如果数据出现了删除更新或者修改等操作，那么以及缓存将会被删除
     */
    @Test
    public void testCache(){

        User user1 = mapper.testFirstLevelCache(41);
        System.out.println(user1);
        user1.setUserAddress("大灵5656");
        user1.setUserName("傻吊");

        //这里执行更新操作
        mapper.updateUser(user1);



      User user2= mapper.testFirstLevelCache(41);
        System.out.println(user2);

        System.out.println(user1==user2);
    }
}
