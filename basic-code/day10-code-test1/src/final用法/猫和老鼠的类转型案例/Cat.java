package final用法.猫和老鼠的类转型案例;

public class Cat extends Animals {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catMathod(){
        System.out.println("可以捉老鼠");
    }
}
