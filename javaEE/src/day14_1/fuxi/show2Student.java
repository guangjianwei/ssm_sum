package day14_1.fuxi;
import java.lang.reflect.Method;
import java.util.Properties;

//利用配置文件的方法对Studnet的方法进行获取执行
public class show2Student {
    public static void main(String[] args) throws Exception {
        //获取配置文件中的内容
        Properties pro = new Properties();
        pro.load(show2Student.class.getClassLoader().getResourceAsStream("pro.properties"));
        String clssName = pro.getProperty("clssName");
        String show = pro.getProperty("methodName");
        Class cls = Class.forName(clssName);
        Method method = cls.getMethod(show);
        Object o = cls.newInstance();
        method.invoke(o);
    }
}
