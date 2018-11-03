package Test.TestOne;
/*
* 有一个需求,
* 创建一个抽象的person类,包含一个抽象方法 work();
* 有两个子类继承person,一个是学生类,一个是老师类,要求重写work方法,
学生的名字前需要添加"学生: ",老师的名字前需要添加"老师: ",年龄不能为负数,如果为负数需要抛出异常
* 通过两个线程分别创建10个对象(for循环随机创建,老师年龄要求30-50岁,学生年龄要求10-20岁),
* map的key要求的是对象创建的序号加上对象创建的时间.
* 存入到map集合中,并遍历出来.
* 拿到所有的value,把老师和学生分类出来保存到两个arraylist中,并打印出來
* 并通过年龄的大小来排序(学生的按照升序排序,老师的按照降序排列),并打印出来
*
*/



public class TestDemo1 {
    public static void main(String[] args) {
          new Thread(
                  ()->{

                  }
          ).start();
          new Thread(
                  ()->{

                  }
          ).start();
    }
}
