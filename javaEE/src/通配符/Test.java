package 通配符;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    //设计一个方法，可以接收三个不同的集合
    public static void main(String[] args) {
        Collection<String> col1 =new ArrayList<>();
        Collection<String> col2 =new ArrayList<>();
        Collection<String> col3 =new ArrayList<>();
        use(col1);
        use(col2);
        use(col2);
    }
    public static void use(Collection<?> col){

    }
    //只能接收Integer，Number
    //限制了泛型的范围智能是Number和其子类
    //泛型的上限
    public static void use1(Collection<? extends Number> col){

    }
    //只能接收Object，Number
    //限制了泛型的范围智能是Number和其父类
    //泛型的下限
    public static void use2(Collection<? super Number> col){

    }
}
