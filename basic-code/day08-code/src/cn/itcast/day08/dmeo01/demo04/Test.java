package cn.itcast.day08.dmeo01.demo04;
/*
	1.手机类Phone
		  属性:品牌brand,价格price
		  无参构造,有参构造
		  行为:打电话call,发短信sendMessage,玩游戏playGame
		2.测试类
		  创建Phone类对象,调用Phone类中的方法

 */
public class Test {
    private String brand;
    private int price;
    private int size=6;

    public Test() {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Test(String brand, int price, int size) {

        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public static void call() {
        System.out.println("打电话了");
    }

    public static void sendMessage() {
        System.out.println("发短信了");
    }

    public static void playGame() {
        System.out.println("玩游戏了");
    }
}
