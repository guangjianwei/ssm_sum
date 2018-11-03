package cn.itcast.day08.dmeo01.demo05;

public class shabao extends Fu{
    public  static void main(String[] args) {
        int a =99;
        System.out.println(a);
        System.out.println("=========");
//        System.out.println(super.a);
        sta();
    }
    public  void sta1(){
        sta();
    }
    public static void sta(){
        int b = 5;
       System.out.println(b);
    }
}
