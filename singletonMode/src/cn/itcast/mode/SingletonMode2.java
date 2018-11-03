package cn.itcast.mode;

/**
 * 饿汉式 : 类似于没有吃饱的人, 一出来就要吃, 所以理解为饿汉式
 * 1.私有化构造方法
 * 2.私有化一个本类对象(直接创建对象)
 * 3.对外提供一个公共的访问方法
 */
public class SingletonMode2 {
    private SingletonMode2(){}
    private static SingletonMode2 instance = new SingletonMode2();

    public static SingletonMode2 getInstance(){
        return instance;
    }
}
