package cn.itcast.mode;

/**
 * 懒汉式 : 为什么称之为懒汉式,因为只有在我使用的时候,才会去创建对象,不使用不创建    跟懒加载理解起来一样
 * 1.私有化构造方法
 * 2.私有化一个本类对象(不创建对象,在调用方法的时候创建)
 * 3.对外提供一个公共的访问方法
 *
 */
public class SingletonMode1 {
    private SingletonMode1(){}
    private static SingletonMode1 instance;

    public static SingletonMode1 getInstance(){
        if (instance == null){
            instance = new SingletonMode1();
        }
        return instance;
    }
}
