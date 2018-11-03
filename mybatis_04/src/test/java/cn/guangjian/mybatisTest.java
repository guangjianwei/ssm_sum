package cn.guangjian;

import cn.guangjian.mybatis.dao.UserDao;
import cn.guangjian.mybatis.domain.Account;
import cn.guangjian.mybatis.domain.QueryVo;
import cn.guangjian.mybatis.domain.User;
import cn.guangjian.mybatis.domain.UserAccount;
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
    private SqlSession sqlSession;
    private UserDao mapper;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
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
        List<User> list = mapper.findAll();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }

    /**
     * 查询特定条件的,这里的条件可能是用户名,可能是地址,可能是性别
     */
    @Test
    public void findIf(){
        User user = new User();
        user.setUserName("徐明杰");
        user.setUserSex("女");
        user.setUserAddress("上海");
        List<User> list = mapper.findIf(user);
        for (User user1 : list){
            System.out.println(user1.toString());
        }
    }

    /**
     * 根据queryVo中的ids集合查找对应的list
     */
    @Test
    public void findIds(){
        QueryVo queryVo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(41);
        ids.add(45);
        ids.add(51);
        queryVo.setIds(ids);
        List<User> list = mapper.findIds(queryVo);
        for (User user : list) {
            System.out.println(user.toString());
        }

    }
    /**
     * 根据account表查询所有
     */
    @Test
    public void findAccount(){
        List<Account> account = mapper.findAccount();
        for (Account account1 : account){
            System.out.println(account1.toString());
        }
    }
    /**
     * 根据account
     */
    @Test
    public void finUserAccount(){
        List<UserAccount> userAccounts = mapper.finUserAccount();
        for (UserAccount userAccount : userAccounts) {

            System.out.println(userAccount.toString());
        }
    }

    /**
     * 根据UserAccount,查询account和user量表的一一对应关系表
     */
    @Test
    public void findAccountOther(){
        List<Account> accountOther = mapper.findAccountOther();
        for (Account account : accountOther) {
            System.out.println(account.toString());
        }

    }
    /**
     * 一对多，一个user对应account
     */
    @Test
    public void findUserAccounts(){
        List<User> userAccounts = mapper.findUserAccounts();
        for (User userAccount : userAccounts) {
            System.out.println(userAccount);
        }
    }
}
