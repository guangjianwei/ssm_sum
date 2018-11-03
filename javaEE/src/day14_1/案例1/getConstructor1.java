package day14_1.案例1;
import day14_1.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class getConstructor1 {
    public static void main(String[] args) throws Exception {
        Class cla = Student.class;
        Constructor con = cla.getConstructor();
        Object o = cla.newInstance();
        System.out.println(o);
        Method eat = cla.getMethod("eat");
        eat.invoke(o);
        Method eat1 = cla.getMethod("eat",String.class);

        eat1.invoke(o,"鱼");


    }
}
