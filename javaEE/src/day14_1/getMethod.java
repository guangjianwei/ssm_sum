package day14_1;

import java.lang.reflect.Method;

public class getMethod {
    public static void main(String[] args) throws Exception{
        Student s = new Student();
        //获取Student的 Class对象
        Class<Student> cal = Student.class;
        //获取所有public修饰的成员方法
        Method[] methods = cal.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        //获取指定的成员方法对象
        Method method = cal.getMethod("eat");
        //执行方法
        method.invoke(s);
        System.out.println(method.getName());
        System.out.println("---------");
        Method eat = cal.getMethod("eat", String.class);
        eat.invoke(s,"鱼");
        //getName
        System.out.println(eat.getName());


    }
}
