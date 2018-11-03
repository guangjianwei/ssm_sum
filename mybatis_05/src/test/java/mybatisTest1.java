import cn.guangjian.mybatis.dao.UserDao;
import cn.guangjian.mybatis.domain.Role;
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

public class mybatisTest1 {
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
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        mapper = sqlSession.getMapper(UserDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
         sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * User表查询
     */
    @Test
    public void findUsers(){
        List<User> users = mapper.findUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    /**
     * Role表查询
     */
    @Test
    public void findRoles(){
        List<Role> roles = mapper.finRoles();
        for (Role role : roles) {
            System.out.println(role);
        }
    }
    /**
     * 多对多 Role表对Userss
     */
    @Test
    public void findRoleUsers(){
        List<Role> userRoles = mapper.findRoleUsers();
        for (Role userRole : userRoles){
            List<User> users = userRole.getUsers();
            System.out.println(userRole+users.toString());
        }
    }
    /**
     * 多对多user表到roles表
     */
    @Test
    public void findUserRoles(){
        List<User> list = mapper.finUserRoles();
        for (User user : list) {
            System.out.println(user.toString()+user.getRoles().toString());
        }
    }
    /**
     * 多对多 User表对Roles表
     */
    @Test
    public void findUserRole(){

    }
}
