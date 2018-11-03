package mybatis.test;


import cn.guangjian.mybatis.dao.UserDao;
import cn.guangjian.mybatis.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class annotationTest1 {
    public static void main(String[] args) throws Exception {
        //创建输入流
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取sqlsession
        SqlSession sqlSession = factory.openSession(true);
        //创建dao代理对象
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //调用
        List<Account> list = mapper.findAll();
        for (Account account : list) {
            System.out.println(account.toString());
        }
        sqlSession.close();
        in.close();

    }

}
