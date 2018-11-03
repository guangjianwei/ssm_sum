package cn.guangjian.test;

import cn.guangjian.dao.UserDao;
import cn.guangjian.domain.User;
import cn.guangjian.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void run1(){
        //dao测试
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = ac.getBean(UserDao.class);
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
    @org.junit.Test
    public void run2(){
        //service测试
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
       userService.findAll();

    }
}
