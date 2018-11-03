package cn.guangjian;

import cn.guangjian.spring.dao.impl.AccountDaoImpl;
import cn.guangjian.spring.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test1 {
    /**
     * ApplicationContext的三种常用的实现类
     * ClassPathXmlApplicationContext:他可以加载类路径下的配置文件,要求配置文件必须是类路径下的.不在的话加载不了
     * FileSystemXmlApplicationContext:他可以加载磁盘任意路径下的配置文件(必须具有访问权限)---这个不推荐使用,尽量使用根据项目走的配置文件,而不是根据服务器走的配置文件
     * AnnotationConfigApplicationContext:他是用于读取注解来创建容器.
     *
     * 核心容器的两个接口引发的问题:
     *   1.ApplicationContext(底层接口,功能全面,经常使用):    生产的对象是单列对象
     *   它在构建核心容器时,创建对象采取的策略是用立即加载的方式.也就是说,只要一读取完配置文件马上就创建配置文件中配置的对象(根据传入的id名称在集合中获取已经创建的对象,集合中的对象只在配置文件加载的时候创建一次)
     *   2.BeanFactory(其实是顶层接口,不经常使用):           生产的对象是多列对象
     *   它在构建核心容器时,创建对象采用的是延时加载的方式,也就是说,什么时候根据id获取对象了,什么时候才真正的创建对象.
     * @param args
     */
    public static void main(String[] args) {
        //耦合出现
//        AccountService accountService = new AccountServiceImpl();
        //利用spring内置工厂的方式生产,可以解决类之间的依赖
        //1.首先导入jar包
        //2.创建bean.xml 配置(这里面需要输入一些约束,需要查询spring文档)
        //3.获取spring核心Ioc对象,根据id获取对象
        //获取核心对象
//        ------ApplicationContext方式来获取对象-----
       ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean对象
        AccountServiceImpl accountService = (AccountServiceImpl)ac.getBean("accountService");
        accountService.show();
        AccountDaoImpl accountDao = (AccountDaoImpl)ac.getBean("accountDao");
        accountDao.show();
        //---------------BeanFactory方式---------------
        //先读取配置文件
/*        ClassPathResource resource = new ClassPathResource("bean.xml");
        //获取核心对象
        BeanFactory bf = new XmlBeanFactory(resource);
        //创建对象
        AccountServiceImpl accountService1 = (AccountServiceImpl) bf.getBean("accountService");
        accountService1.show();
        AccountDaoImpl accountDao1 = (AccountDaoImpl) bf.getBean("accountDao");
        accountDao1.show();*/
    }
}
