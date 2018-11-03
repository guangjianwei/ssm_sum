package day01.装箱操作;
/*
基本类型与包装类之间 转换

    装箱  基本类型转换成对应的包装类

    拆箱  包装类转换成对应的基本类型

    以Integer---int
 */
public class packageClass {
    public static void main(String[] args) {
        //装箱过程
        int i = 2;
        Integer A = new Integer(i);//第一种new的装箱方法
        Integer B = Integer.valueOf(i);
        //拆箱过程
        int c = A.intValue();
        System.out.println(c);
    }
}
