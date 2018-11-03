package cn.itcast.day08.dmeo01.demo04;

public class Phone {
    public static void main(String[] args) {
        Test t =new Test("诺基亚",6000,7);
        System.out.println("名称："+t.getBrand()+","+"价格："
                +t.getPrice()+","+"尺寸："+t.getSize());
        t.sendMessage();
        t.call();
        t.playGame();
    }



}
