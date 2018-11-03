import cn.guangjian.domain.User;
import cn.guangjian.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        User user = ac.getBean("user", User.class);
        user.setUserName("jeck");
        userService.findAll();
        userService.insert(user);
        System.out.println("无敌是多么寂寞?");
    }
}
