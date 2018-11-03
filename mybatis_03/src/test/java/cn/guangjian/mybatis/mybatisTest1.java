package cn.guangjian.mybatis;


import cn.guangjian.mybatis.dao.UserDao;
import cn.guangjian.mybatis.domain.QueryVo;
import cn.guangjian.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class mybatisTest1{
    private  InputStream in;
    private  SqlSession sqlSession;
    private  UserDao mapper;
    @Before
    public void init() throws IOException {
        //1.读取配置文件生成字节输入流
         in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
         sqlSession = factory.openSession();
        //4.获取dao代理对象
         mapper = sqlSession.getMapper(UserDao.class);
    }

    /**
     * 查询所有
     */
    @Test
    public void findAll(){
        List<User> list = (List<User>) mapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    /**
     * 添加所有
     */
    @Test
    public void addAll(){
        User user = new User();
        user.setAddress("杭州");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setUsername("杰弟弟");
        System.out.println("保存前的数据:"+user.toString());
        mapper.addAll(user);
        System.out.println("保存后的数据:"+user.toString());
    }

    /**
     * 修改
     */
    @Test
    public void update(){
        User user = new User();
        user.setId(41);
        user.setAddress("扬州");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setUsername("徐明杰");
        mapper.update(user);
    }
    /**
     * 删除
     */
    @Test
    public void delete(){
        mapper.delete(42);
    }
    /**
     * 查询一个
     */
    @Test
    public void finByone(){
        User one = mapper.findByOne(41);
        System.out.println(one.toString());
    }
    /**
     *   根据QueryVo的条件进行查询
     */
    @Test
    public void findQueryVoOne(){
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setId(41);
        queryVo.setUser(user);
        User one = mapper.findQueryVoOne(queryVo);
        System.out.println(one.toString());
    }
    /**
     * 按照用户名进行模糊查询1
     */
    @Test
    public void dimSarch1(){
        List<User> users = mapper.dimSearch("%杰%");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    /**
     * 按照用户名进行模糊查询2
     */
    @Test
    public void dimSarch2(){
        List<User> users = mapper.dimSearch1("杰");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    /**
     * 查询用户的总记录数
     */
    @Test
    public void findTotal(){
        Integer total = mapper.findTotal();
        System.out.println("用户的总记录数为:"+total);
    }
    @After
    public void destory() throws IOException {
        sqlSession.close();
        in.close();
    }
}
