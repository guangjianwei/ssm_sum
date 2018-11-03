package cn.itcast.day10.demo01.demo01;
//系统会自定义一个pubic abstract，就算是不写
public interface  MyInerfaceAbstract {
    //接口当中定义一个抽象方法
          abstract void mathod1();
          //默认方法
     public default void mathod1Default() {
         System.out.println("默认方法");
     }

    }


