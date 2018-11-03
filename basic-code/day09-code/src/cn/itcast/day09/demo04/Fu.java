package cn.itcast.day09.demo04;

public class Fu {
    int age;
    String name="父亲";
    public void getName(){
        System.out.println(this.name);
    }
    public void Fu(){
        System.out.println("父类无参构造");
    }
    public void Fu(int num){
        System.out.println("父类有参构造");
    }
}
