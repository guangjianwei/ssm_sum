package day14_1.fuxi;

import java.lang.reflect.Method;

//利用注解的方法来调用Student中的show1方法,并执行
@stu(className = "day14_1.fuxi.Student",methodName = "show1")
public class show3Student {
    public static void main(String[] args) throws Exception {
                 //解析注解中的内容
        stu anno = show3Student.class.getAnnotation(stu.class);
        String className = anno.className();
        String methodName = anno.methodName();
        Class cls = Class.forName(className);
        Method method = cls.getMethod(methodName);
        Object o = cls.newInstance();
        method.invoke(o);
    }
}
