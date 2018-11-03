package day14_1;

import java.lang.reflect.Field;

public class reflectDemo {
    public static void main(String[] args) throws Exception {
        //定义一个student对象，用反射的方法对其中的成员变量进行赋值以及获取值
        Student student = new Student();
        //1.获取Class对象
        Class cla = Class.forName("day14_1.Student");
        //2.获取所有的成员变量
        Field[] fields = cla.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //获取指定名称的成员变量
        Field name = cla.getDeclaredField("name");
        //进行暴力反射
        name.setAccessible(true);
        //进行赋值
        name.set(student,"傻逼宝");
        //取值
        Object o = name.get(student);
        System.out.println(o);
    }
}
