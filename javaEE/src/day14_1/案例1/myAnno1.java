package day14_1.案例1;

public @interface myAnno1 {
    //一共有五种属性的选择
    int age();
    String str();
    String[] str2();
    Person per();  //这是一个枚举类型
    myAnno my();  //注解类型

}
