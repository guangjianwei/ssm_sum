package cn.itheima.test02;

import java.sql.SQLOutput;

/*
创建Dog（狗）类，要求：

      继承Animal（动物）类，实现speak方法，在方法内打印“X说：Y”，其中X为狗的名字，
      Y为当前方法的参数。

      完成set/get方法，满参构造。

      实现Sports接口，实现swimming方法，在方法内打印：XXX狗刨中！其中，X为狗的名字。

      创建成员方法：goPlay()，在方法内依次调用speak(String str)方法和swimming ()方法。
      其中speak方法的参数自行创建。
 */
public class Dog extends Animal implements Sports{
    public Dog(String name){
        super(name);
    }
    @Override
    void speak(String str) {
        System.out.println(getName()+"说："+str);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"狗刨中！");
    }
    public void goPlay(String str){
        speak(str);
        swimming();
    }
}
