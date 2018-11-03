package day12;
//this,引入lanbda表达式中
public class Husband {
    public  void buyHouse(){
        System.out.println("买大房子");

    }
    public void  marry(BuyHouse buyhouse){
        buyhouse.buyHouse();

    }
    public void  bBaby(){
        marry(()->{
            this.buyHouse();
        });
    }
    public void  bBaby1(){
        marry(this::buyHouse);
    }
}
