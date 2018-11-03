package cm;

public class Phone {
    public String brand;
    public double price;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(String name){
        String per = name;
        System.out.println("给"+per+"打电话了！");
    }
    public void setMessage(){
        System.out.println("我要发短息了！");
    }
}
