package day14_1;

public @interface MyAnno {
    int num();
    String str();
    Person per();//这是一个枚举类型
    MyAnno1 myAnno();//注解类型
    String[] st();

}
