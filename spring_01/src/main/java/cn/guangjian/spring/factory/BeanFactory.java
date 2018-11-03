package cn.guangjian.spring.factory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory{
    //利用工厂的方式创建service和dao实例对象
    //第一个,需要配置文件来配置我们的service和dao   配置的内容:唯一标识 = 全限定类名(key = value)
    //第二个:通过读取配置文件中配置的内容,反射创建对象
    //配置文件可以是xml也可以是properties
    //定义一个properties

    private static Properties props;
    //现在生产出来的对象都是多列的对象,如果想创建单列对象
    private static Map<String,Object> map;

    static{
        try {
            props = new Properties();
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //实例化容器
            map = new HashMap<String, Object>();
            //取出配置文件中所有的key
            Enumeration<Object> keys = props.keys();
            while(keys.hasMoreElements()){
                //取出每一个key
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = null;
                //反射对象
                try {
                    value = Class.forName(beanPath).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                //存到map中
                map.put(key,value);

            }
        } catch (IOException e) {
            throw new ExceptionInInitializerError("初始化失败!");
        }
    }

    /**
     * 根据bean的名称获取bean对象
     * @param beanName
     * @return
     */
//    public static Object getBean(String beanName){
//       Object bean = null;
//        try {
//            String beanPath = props.getProperty(beanName);
//            bean = Class.forName(beanPath).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return bean;
//    }
    public static Object getBean(String beanName){
        return map.get(beanName);
    }
}
