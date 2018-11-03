package mybatis.test;

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
import java.util.List;

public class cacheTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession sqlSession;
    UserDao mapper;
    @Before
    public void init() throws Exception {

        //创建输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        factory = new SqlSessionFactoryBuilder().build(in);
        //获取sqlsession
        sqlSession = factory.openSession(true);
        //创建dao代理对象
        mapper = sqlSession.getMapper(UserDao.class);
    }
    @After
    public  void  destory() throws Exception {

        sqlSession.close();
        in.close();
    }

    /**
     * 一级缓存
     */
    @Test
    public void findByUid(){
        List<Account> list1 = mapper.findByUid(51);
        List<Account> list2 = mapper.findByUid(51);
        System.out.println(list1==list2);
    }
    @Test
    public void findByUid1(){
        SqlSession sqlSession1 = factory.openSession(true);
        UserDao mapper1 = sqlSession.getMapper(UserDao.class);
        List<Account> byUid1 = mapper1.findByUid(51);

        SqlSession sqlSession2 = factory.openSession(true);
        UserDao mapper2 = sqlSession.getMapper(UserDao.class);
        List<Account> byUid2 = mapper2.findByUid(51);
        System.out.println(byUid1==byUid2);
    }
}
