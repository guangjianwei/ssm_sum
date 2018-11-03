package day14_1;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

//这里面试一个映射的案例
/*
 步骤：
				1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
				2. 在程序中加载读取配置文件
				3. 使用反射技术来加载类文件进内存
				4. 创建对象
				5. 执行方法
 */
public class reflect {
    public static void main(String[] args) throws Exception{
        //1.将一个对象的全名和执行的方法定义在配置文件中
        //1.1创建properties对象
        //1.2加载配置文件到一个集合当中
        Properties pp = new Properties();
        ClassLoader classLoader = reflect.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("day14_1\\pro.properties");
        pp.load(is);
        //3.加载类文件进内存,获取到
        String className = pp.getProperty("className");
        String methodName = pp.getProperty("methodName");
        Class cla = Class.forName(className);
        //4.创建一个空参对象,利用cal来创建
        Object o = cla.newInstance();
         //5.执行方法
        //获取方法对象
        Method method = cla.getMethod(methodName);
        method.invoke(o);

    }
}
