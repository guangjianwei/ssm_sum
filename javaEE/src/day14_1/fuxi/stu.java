package day14_1.fuxi;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface stu {
       String className();         //注解里面定义的都是方法
       String methodName();
}
