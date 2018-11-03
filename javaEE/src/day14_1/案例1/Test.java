package day14_1.案例1;

import java.lang.reflect.Method;

@myAnno(className = "day14_1.案例1.Demo1", methodName ="show1")
public class Test {
    public static void main(String[] args) throws Exception{
       //解析注解
        //1.首先获得该类的字节码文件对象
        Class<Test> cla = Test.class;
          //1.1获得注解对象
        myAnno an = cla.getAnnotation(myAnno.class);
        //2.调用注解中定义的抽象方法,获取返回值
        String cn = an.className();
        String mn = an.methodName();
        //3.加载该类进内存
        Class cls = Class.forName(cn);
        //4.获取方法对象
        Method method = cls.getMethod(mn);
        //生成一个空参对象
        Object o = cls.newInstance();
        //执行方法
        method.invoke(o);

    }
}
