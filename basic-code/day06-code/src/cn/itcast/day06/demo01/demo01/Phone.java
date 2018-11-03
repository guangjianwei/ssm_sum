package cn.itcast.day06.demo01.demo01;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void call(){
        System.out.print("打电话。");
    }
    public void sendMessage(){
        System.out.print("发短信。");
    }
    public void playGame(){
        System.out.print("玩游戏。");
    }
}
