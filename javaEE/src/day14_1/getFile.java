package day14_1;
import java.lang.reflect.Field;

public class getFile {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
       //获取到Student的class对象,这里面的路径是相对于类的包名
        Class cal= Class.forName("day14_1.Student");
        //获取所有的public修饰的成员变量
        System.out.println(cal);
        //获取所有public修饰的所有成员变量对象
        Field[] fields = cal.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //获取指定的都public修饰的成员变量
        Field a = cal.getField("a");
        //获取到成员量的值,这里首先要声明一个Student的对象,只有实体的对象才有相对应的值
        System.out.println(a.get(s));
        //对获取到的成员变量进行赋值
        a.set(s,"aaa");
        //再次获取
        System.out.println(a.get(s));
        //下面是getDeclaredFields() ,抛去修饰符的限制,取到所有的成员变量对象
        Field[] fields1 = cal.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        //getDeclaredField(String name) 抛去修饰符的限制,取到指定的成员变量对象
        Field a1 = cal.getDeclaredField("a");
        //取值
        System.out.println(a1.get(s));
        //赋值
        a1.set(s,"a1a1a1");
        //再次取值
        System.out.println(a1.get(s));

        //第二种方法
        System.out.println(s.getClass());
        //第三种方法
        System.out.println(Student.class);



    }
}
