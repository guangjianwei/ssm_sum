package cn.itcast.day09.demo07;

//这里虽然是覆盖了抽象父类Animals的一个方法，但是没有全部覆盖，所以这个类依然应该是抽象类，不然就会报错
public abstract class Dogs extends Animals {
    public void eat() {
        System.out.println("吃骨头！");
    }
}
