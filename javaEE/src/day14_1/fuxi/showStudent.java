package day14_1.fuxi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//利用反射的方式来获取成员变量,构造方法,成员方法,私有方法
public class showStudent {
    public static void main(String[] args) throws Exception {
        //1.首先获取到类class类对象
        Class cls = Class.forName("day14_1.fuxi.Student");
        //利用class对象声明一个空参的实例对象
        Object o = cls.newInstance();
        //获取所有成员变量对象
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field+",");
        }
        //获取指定的成员变量
        Field name = cls.getDeclaredField("name");
        //因为要赋值的变量为私有变量,所以要进行暴力反射
        name.setAccessible(true);
        name.set(o,"张三");
        System.out.println(name.get(o));
        System.out.println("============");
        //获取构造方法们对象
        Constructor[] cons = cls.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        //获取无参构造方法
        Constructor con1 = cls.getConstructor();
           //实例一个对象
        Object o1 = con1.newInstance();
        System.out.println(o1);
        //获取有参构造方法对象
        Constructor con2 = cls.getConstructor(String.class, int.class);
        Object o3 = con2.newInstance( "李四", 23);
        System.out.println(o3);
        //获取成员方法对象
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);  //这里方法包含了所继承的父类的方法
        }
       //获取无参成员方法对象并执行
        Method show1 = cls.getMethod("show1");
        show1.invoke(o1);
        //获取有参数成员方法并执行
        Method show2 = cls.getDeclaredMethod("show2", String.class);
        show2.setAccessible(true);
        show2.invoke(o3,"这是有参私有方法");
    }
}
