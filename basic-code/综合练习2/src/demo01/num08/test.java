package demo01.num08;

import java.util.ArrayList;

/*

2. 定义Test类：在main()方法中，按以下要求编写代码:
    1） 分别实例化三个Person对象，三个对象分别为："小秋" ,1.72, 72、"小红" ,1.58, 44、"小白" ,1.80, 55;
    2） 创建一个ArrayList集合，这个集合里面存储的是Person类型，分别将上面的三个Person对象添加到集合中
3）遍历这个集合，将集合中姓名为小白的对象，体重增加10kg，然后调用这个对象的showBMI方法展示这个对象的属性和体质指数.
控制台打印示例：
小白身高为1.8,体重为65,体质指数是:21
 */
public class test {
    public static void main(String[] args) {
        Person one = new Person("小秋" ,1.72, 72);
        Person two = new Person("小红" ,1.58, 44);
        Person three = new Person("小白" ,1.80, 55);
        ArrayList<Person> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println("改变前：");
        for (int i = 0; i < list.size(); i++) {
             list.get(i).showBMT();
        }
        System.out.println("改变后：");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setWeight(list.get(i).getWeight()+10);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showBMT();
        }

    }
}
