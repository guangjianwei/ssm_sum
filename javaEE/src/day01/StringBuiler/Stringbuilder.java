package day01.StringBuiler;
/*
java.lang.StringBuilder
       可变的字符序列，字符串缓冲区，可以理解为一个容器用来存放字符串的，提供了在自己空间中操作字符串的方法

       构造
        - public StringBuilder()：构造一个空的StringBuilder容器。
        - public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。
	   先实现类，在用append（）;方法进行添加内容
	   StringBuilder常用功能：
     - public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。

     - public String toString()：将当前StringBuilder对象转换为String对象。
 */
public class Stringbuilder {

    public static void main(String[] args) {
        System.out.println("=========有参数======");
        StringBuilder strbulder = new StringBuilder("sdflsj");
        System.out.println(strbulder);
        System.out.println("=========无参数======");
        StringBuilder strbulder1 = new StringBuilder();
        strbulder1.append(123);
        strbulder1.append("eeee");
        strbulder1.append('f');
        strbulder1.append(123);
//        Person one = new Person("傻屌宝",30);
        strbulder1.append(new Person("傻屌宝",30));
        System.out.println(strbulder1.toString());
    }
}


