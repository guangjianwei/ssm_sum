package day14_1;

import java.lang.reflect.Constructor;

//获取构造方法们
public class getConstractor{
    public static void main(String[] args) throws Exception{
        Student s = new Student();
        //获取Studnet的calss对象
        Class cal = Student.class;
        //获取所有public修饰的构造方法们
        Constructor[] cons = cal.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        //获取指定的构造方法对象(有参构造)
        Constructor con = cal.getConstructor(String.class, int.class);
        //创建一个对象
        Object conStu = con.newInstance("傻逼宝", 43);
        System.out.println(conStu);
        //获取一个空参构造对象
        Constructor con1 = cal.getConstructor();
        //利用空参构造对象创造一个Student对象
        Object o = con1.newInstance();
        System.out.println(o);
        //Class提供了一个简化的创建空参对象的方法
        Object o1 = cal.newInstance();
        System.out.println(o1);


    }
}
