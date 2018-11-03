package day14_1.元注解;

import java.lang.annotation.*;
@Inherited   //是否可以被子类继承
@Documented  //描述注解是否可以被抽取到挨批文档中
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface myAnno {

}
