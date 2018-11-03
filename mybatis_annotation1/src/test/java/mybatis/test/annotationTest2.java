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

public class annotationTest2{
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
     * 查询所有
     */
   @Test
   public void findAll(){
        //调用
    List<Account> list = mapper.findAll();
        for (Account account : list) {
        System.out.println(account.toString());
    }
   }

    /**
     * 删除一个account
     */
   @Test
   public void deleteOne(){
        mapper.deleteOne(6);
   }

    /**
     * 更改一个
     */
   @Test
   public void updateOne(){
       Account account = new Account();
       account.setId(3);
       account.setUid(48);
       account.setMoney(1000.00);
       mapper.updateOne(account);
   }

    /**
     * 插入一个
     */
   @Test
   public  void insertOne(){
       Account account = new Account();
       account.setId(6);
       account.setUid(51);
       account.setMoney(500.00);
       mapper.insertOne(account);
   }

    /**
     * 查询所有User
     */
   @Test
   public void findUsers(){
       List<User> users = mapper.findUsers();
       for (User user : users){
           System.out.println(user.toString());
       }
   }
    /**
     * 模糊查询,参数的方式
     */
    @Test
    public void dimSearch1(){
        List<User> list = mapper.dimSearch1("%杰%");
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
    /**
     * 模糊查询，sql拼接的方式
     */
    @Test
    public void dimSearch2(){
        List<User> list = mapper.dimSearch2("杰");
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
    /**
     * 一对一（account——>user）
     */
    @Test
    public void findOneByOne(){
        List<Account> oneByOne = mapper.findOneByOne();
        for (Account account : oneByOne) {
            System.out.println(account.toString()+account.getUser().toString());
        }
    }
    /**
     * 一对多(user——>accounts)
     */
    @Test
    public void findOneByMany(){
        List<User> oneByMany = mapper.findOneByMany();
        for (User user : oneByMany) {
            System.out.println(user.toString()+user.getAccounts().toString());
        }
    }
}
