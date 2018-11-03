package cn.itheima.test02;
/*
    创建测试类，在测试类的main方法中完成：

            通过满参构造创建一个姓名为“旺财”Dog类对象。

            调用这个对象的goPlay()方法。
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        dog.goPlay("儿子");
    }

}
