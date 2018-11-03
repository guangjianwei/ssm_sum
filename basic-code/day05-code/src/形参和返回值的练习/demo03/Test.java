package 形参和返回值的练习.demo03;

import javax.swing.plaf.SliderUI;

/*
定义类：Test，类中定义main（）方法，按以下要求编写代码：
	1.实例化三个Solider对象，三个对象分别为："王小兵"，25，"打篮球"、"李团长"，35，"游泳"、"王军长"，55，"踢足球"；
	2.定义方法,传递三个对象,如果对象的年龄大于40，那么将这个对象的爱好改成"打高尔夫",然后返回这个对象
	3.在main方法中调用该方法,接收返回的对象,调用这个对象的show（）方法展示这个对象所有的属性信息
 */
public class Test {
    public static void main(String[] args) {
        Solider one = new Solider("丑逼宝",42,"爱吃屎！");
        Solider two = new Solider("傻吊求",33,"爱吃祥！");
        Solider three = new Solider("逗比磊",29,"爱喝尿！");
        Solider last = getObj(one,two,three);
        System.out.println("姓名："+last.getName());
        System.out.println("年龄："+last.getAge());
        System.out.println("爱好："+last.getLike());
    }
    public static Solider getObj(Solider one,Solider two,Solider three){
         if(one.getAge()>40){
             one.setLike("又吃屎，又喝尿！");
             return one;
         }else if(two.getAge()>40){
             two.setLike("又吃屎，又喝尿！");
             return two;
         }else if(three.getAge()>40){
             three.setLike("又吃屎，又喝尿！");
             return three;
         }
         return null;
    }

}
