import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Person perOne = new Person("小秋" ,1.72, 72);
        Person perTwo = new Person("小红" ,1.58, 44);
        Person perThree = new Person("小白" ,1.80, 55);
        ArrayList<Person> list = new ArrayList<>();
        list.add(perOne);
        list.add(perTwo);
        list.add(perThree);
        System.out.println("修改前：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName());
            System.out.println("身高："+list.get(i).getHeight());
            System.out.println("体重："+list.get(i).getWeight());
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setWeight(list.get(i).getWeight()+10);
        }
        System.out.println("修改后：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName());
            System.out.println("身高："+list.get(i).getHeight());
            System.out.println("体重："+list.get(i).getWeight());
        }

    }
}
