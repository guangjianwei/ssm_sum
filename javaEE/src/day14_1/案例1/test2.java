package day14_1.案例1;
import java.lang.reflect.Method;

@myAnno(className = "day14_1.案例1.Student",methodName = "show")
public class test2 {
    public static void main(String[] args) throws Exception {
    //解析注解信息
        Class<test2> cls = test2.class;
        myAnno an = cls.getAnnotation(myAnno.class);
        String methodName = an.methodName();
        String className = an.className();
        Class cls1 = Class.forName(className);
        Object o = cls1.newInstance();
        Method method = cls1.getMethod(methodName);
        method.invoke(o);
    }

}
