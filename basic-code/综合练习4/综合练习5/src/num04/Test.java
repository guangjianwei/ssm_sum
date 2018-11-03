package num04;

import java.util.ArrayList;
import java.util.List;

/*
3、1. 设计一个Book类，私有成员变量： name（书名），author（作者），publisher（出版社），
并生成相应的get/set方法。
2. 定义测试类，在main方法中完成以下要求：
	  a) 创建三个Book对象，分别为”Java基础入门，”传智播客”，”清华大学出版社”；”Java学习笔记”，”林信良”,
	  ”人民邮电出版社”；
	  ”C语言入门经典”，” 霍顿”，” 清华大学出版社”。
	  b) 将以上3个对象添加到list集合中
	  c) 遍历集合，将出版社为“清华大学出版社”的书籍信息
 */
public class Test {
    public static void main(String[] args) {
        Book one = new Book("Java基础入门","传智播客","清华大学出版社");
        Book two = new Book("Java学习笔记","林信良","人民邮电出版社");
        Book three = new Book("C语言入门经典","霍顿","清华大学出版社");
        ArrayList<Book> list = new ArrayList<>(List.of(one,two,three));
//        System.out.println("书名："+"作者：","出版社：");
    }
}
