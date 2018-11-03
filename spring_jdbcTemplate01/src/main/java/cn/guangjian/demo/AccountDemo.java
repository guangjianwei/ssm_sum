package cn.guangjian.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class AccountDemo {

    public static void main(String[] args) {
        try{
            //获取核心容器
           ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
           //获取对象
            JdbcTemplate tept = (JdbcTemplate)ac.getBean("jdbcTemplate");
            //spring中jdbcTemplate的基本用法
            tept.update("insert into account(name,balance) VALUES (?,?)","guangjian",5000f);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void setTept(JdbcTemplate tept) {
    }
}
